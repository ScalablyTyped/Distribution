package typings.gestalt.mod

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpsellSubComponents extends StObject {
  
  var Form: FunctionComponent[UpsellFormProps]
}
object UpsellSubComponents {
  
  inline def apply(Form: FunctionComponent[UpsellFormProps]): UpsellSubComponents = {
    val __obj = js.Dynamic.literal(Form = Form.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsellSubComponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpsellSubComponents] (val x: Self) extends AnyVal {
    
    inline def setForm(value: FunctionComponent[UpsellFormProps]): Self = StObject.set(x, "Form", value.asInstanceOf[js.Any])
  }
}
