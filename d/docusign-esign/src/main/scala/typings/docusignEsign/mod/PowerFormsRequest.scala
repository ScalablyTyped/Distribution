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
  
  inline def apply(): PowerFormsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PowerFormsRequest]
  }
  
  extension [Self <: PowerFormsRequest](x: Self) {
    
    inline def setPowerForms(value: js.Array[/* Contains details about a PowerForm. */ PowerForm]): Self = StObject.set(x, "powerForms", value.asInstanceOf[js.Any])
    
    inline def setPowerFormsUndefined: Self = StObject.set(x, "powerForms", js.undefined)
    
    inline def setPowerFormsVarargs(value: (/* Contains details about a PowerForm. */ PowerForm)*): Self = StObject.set(x, "powerForms", js.Array(value :_*))
  }
}
