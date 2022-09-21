package typings.firebaseFirestore.anon

import typings.typescript.mod.SourceFile
import typings.typescript.mod.TransformerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait After extends StObject {
  
  var after: js.Array[scala.Nothing]
  
  var before: js.Array[TransformerFactory[SourceFile]]
}
object After {
  
  inline def apply(after: js.Array[scala.Nothing], before: js.Array[TransformerFactory[SourceFile]]): After = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
  
  extension [Self <: After](x: Self) {
    
    inline def setAfter(value: js.Array[scala.Nothing]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterVarargs(value: scala.Nothing*): Self = StObject.set(x, "after", js.Array(value*))
    
    inline def setBefore(value: js.Array[TransformerFactory[SourceFile]]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeVarargs(value: TransformerFactory[SourceFile]*): Self = StObject.set(x, "before", js.Array(value*))
  }
}
