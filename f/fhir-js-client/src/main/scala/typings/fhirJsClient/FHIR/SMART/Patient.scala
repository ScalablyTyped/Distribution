package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Patient in context
  */
trait Patient extends StObject {
  
  /**
    * Patient scoped fhir.js FHIR API interface. This will ensure that the 'patient' query parameter is passed
    * along with all the API calls which needs a patient context.
    */
  var api: Api
  
  /**
    * Patient ID
    */
  var id: String
  
  /**
    * Get the Patient resource in context
    * GET BASEURL/Patient/{id}
    */
  def read(): js.Promise[Response]
}
object Patient {
  
  inline def apply(api: Api, id: String, read: () => js.Promise[Response]): Patient = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[Patient]
  }
  
  extension [Self <: Patient](x: Self) {
    
    inline def setApi(value: Api): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRead(value: () => js.Promise[Response]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
  }
}
