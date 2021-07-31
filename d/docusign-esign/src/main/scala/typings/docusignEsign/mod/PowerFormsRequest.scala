package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PowerFormsRequest extends StObject {
  
  /**
    * An array of PowerForm objects.
    */
  var powerForms: js.UndefOr[js.Array[/* Contains details about a PowerForm. */ PowerForm]] = js.undefined
}
object PowerFormsRequest {
  
  @scala.inline
  def apply(): PowerFormsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PowerFormsRequest]
  }
  
  @scala.inline
  implicit class PowerFormsRequestMutableBuilder[Self <: PowerFormsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPowerForms(value: js.Array[/* Contains details about a PowerForm. */ PowerForm]): Self = StObject.set(x, "powerForms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerFormsUndefined: Self = StObject.set(x, "powerForms", js.undefined)
    
    @scala.inline
    def setPowerFormsVarargs(value: (/* Contains details about a PowerForm. */ PowerForm)*): Self = StObject.set(x, "powerForms", js.Array(value :_*))
  }
}
