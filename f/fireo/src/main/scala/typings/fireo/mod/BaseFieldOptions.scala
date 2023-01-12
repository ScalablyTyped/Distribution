package typings.fireo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseFieldOptions extends StObject {
  
  var default: js.UndefOr[Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
}
object BaseFieldOptions {
  
  inline def apply(): BaseFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseFieldOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseFieldOptions] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
