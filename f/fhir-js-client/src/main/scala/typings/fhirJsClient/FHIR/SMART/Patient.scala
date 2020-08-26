package typings.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Patient in context
  */
@js.native
trait Patient extends js.Object {
  /**
    * Patient scoped fhir.js FHIR API interface. This will ensure that the 'patient' query parameter is passed
    * along with all the API calls which needs a patient context.
    */
  var api: Api = js.native
  /**
    * Patient ID
    */
  var id: String = js.native
  /**
    * Get the Patient resource in context
    * GET BASEURL/Patient/{id}
    */
  def read(): js.Promise[Response] = js.native
}

object Patient {
  @scala.inline
  def apply(api: Api, id: String, read: () => js.Promise[Response]): Patient = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[Patient]
  }
  @scala.inline
  implicit class PatientOps[Self <: Patient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApi(value: Api): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: () => js.Promise[Response]): Self = this.set("read", js.Any.fromFunction0(value))
  }
  
}

