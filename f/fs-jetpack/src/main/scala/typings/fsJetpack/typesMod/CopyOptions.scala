package typings.fsJetpack.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyOptions extends StObject {
  
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  
  var matching: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var overwrite: js.UndefOr[Boolean | OverwriteFunction] = js.undefined
}
object CopyOptions {
  
  inline def apply(): CopyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptions]
  }
  
  extension [Self <: CopyOptions](x: Self) {
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    inline def setMatching(value: String | js.Array[String]): Self = StObject.set(x, "matching", value.asInstanceOf[js.Any])
    
    inline def setMatchingUndefined: Self = StObject.set(x, "matching", js.undefined)
    
    inline def setMatchingVarargs(value: String*): Self = StObject.set(x, "matching", js.Array(value :_*))
    
    inline def setOverwrite(value: Boolean | OverwriteFunction): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteFunction2(
      value: (/* srcInspectData */ InspectResult, /* destInspectData */ InspectResult) => Boolean | js.Promise[Boolean]
    ): Self = StObject.set(x, "overwrite", js.Any.fromFunction2(value))
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
