package typings.gestalt.mod

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpsellSubCompnents extends StObject {
  
  var Form: FC[UpsellFormProps]
}
object UpsellSubCompnents {
  
  inline def apply(Form: FC[UpsellFormProps]): UpsellSubCompnents = {
    val __obj = js.Dynamic.literal(Form = Form.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsellSubCompnents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpsellSubCompnents] (val x: Self) extends AnyVal {
    
    inline def setForm(value: FC[UpsellFormProps]): Self = StObject.set(x, "Form", value.asInstanceOf[js.Any])
  }
}
