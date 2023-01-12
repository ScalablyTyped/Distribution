package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageBoxReturnValue extends StObject {
  
  /**
    * The checked state of the checkbox if `checkboxLabel` was set. Otherwise `false`.
    */
  var checkboxChecked: Boolean
  
  /**
    * The index of the clicked button.
    */
  var response: Double
}
object MessageBoxReturnValue {
  
  inline def apply(checkboxChecked: Boolean, response: Double): MessageBoxReturnValue = {
    val __obj = js.Dynamic.literal(checkboxChecked = checkboxChecked.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBoxReturnValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageBoxReturnValue] (val x: Self) extends AnyVal {
    
    inline def setCheckboxChecked(value: Boolean): Self = StObject.set(x, "checkboxChecked", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Double): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
