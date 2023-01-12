package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PowerFormsFormDataResponse extends StObject {
  
  /**
    * An array containing PowerForm data.
    */
  var envelopes: js.UndefOr[js.Array[PowerFormFormDataEnvelope]] = js.undefined
}
object PowerFormsFormDataResponse {
  
  inline def apply(): PowerFormsFormDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PowerFormsFormDataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PowerFormsFormDataResponse] (val x: Self) extends AnyVal {
    
    inline def setEnvelopes(value: js.Array[PowerFormFormDataEnvelope]): Self = StObject.set(x, "envelopes", value.asInstanceOf[js.Any])
    
    inline def setEnvelopesUndefined: Self = StObject.set(x, "envelopes", js.undefined)
    
    inline def setEnvelopesVarargs(value: PowerFormFormDataEnvelope*): Self = StObject.set(x, "envelopes", js.Array(value*))
  }
}
