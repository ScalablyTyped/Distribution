package typings.fireo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseFieldConfig extends StObject {
  
  var modelName: js.UndefOr[String] = js.undefined
  
  var originalName: js.UndefOr[String] = js.undefined
  
  var toLowercase: js.UndefOr[Boolean] = js.undefined
}
object BaseFieldConfig {
  
  inline def apply(): BaseFieldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseFieldConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseFieldConfig] (val x: Self) extends AnyVal {
    
    inline def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "modelName", js.undefined)
    
    inline def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    inline def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    
    inline def setToLowercase(value: Boolean): Self = StObject.set(x, "toLowercase", value.asInstanceOf[js.Any])
    
    inline def setToLowercaseUndefined: Self = StObject.set(x, "toLowercase", js.undefined)
  }
}
