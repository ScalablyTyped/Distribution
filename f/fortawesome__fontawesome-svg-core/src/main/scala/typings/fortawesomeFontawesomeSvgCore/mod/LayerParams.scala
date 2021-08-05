package typings.fortawesomeFontawesomeSvgCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerParams extends StObject {
  
  var classes: js.UndefOr[String | js.Array[String]] = js.undefined
}
object LayerParams {
  
  inline def apply(): LayerParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerParams]
  }
  
  extension [Self <: LayerParams](x: Self) {
    
    inline def setClasses(value: String | js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value :_*))
  }
}
