package typings.fsJetpack.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileOptions extends StObject {
  
  var content: js.UndefOr[WritableData] = js.undefined
  
  var jsonIndent: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[String | Double] = js.undefined
}
object FileOptions {
  
  inline def apply(): FileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileOptions] (val x: Self) extends AnyVal {
    
    inline def setContent(value: WritableData): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentVarargs(value: Any*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setJsonIndent(value: Double): Self = StObject.set(x, "jsonIndent", value.asInstanceOf[js.Any])
    
    inline def setJsonIndentUndefined: Self = StObject.set(x, "jsonIndent", js.undefined)
    
    inline def setMode(value: String | Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
