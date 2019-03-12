package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Patient in context
  */
trait Patient extends js.Object {
  /**
    * Patient scoped fhir.js FHIR API interface. This will ensure that the 'patient' query parameter is passed
    * along with all the API calls which needs a patient context.
    */
  var api: Api
  /**
    * Patient ID
    */
  var id: java.lang.String
  /**
    * Get the Patient resource in context
    * GET BASEURL/Patient/{id}
    */
  def read(): js.Promise[Response]
}

object Patient {
  @scala.inline
  def apply(api: Api, id: java.lang.String, read: () => js.Promise[Response]): Patient = {
    val __obj = js.Dynamic.literal(api = api, id = id, read = js.Any.fromFunction0(read))
  
    __obj.asInstanceOf[Patient]
  }
}

