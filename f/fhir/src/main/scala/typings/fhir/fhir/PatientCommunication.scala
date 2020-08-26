package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Languages which may be used to communicate with the patient about their health
  */
@js.native
trait PatientCommunication extends BackboneElement {
  /**
    * Contains extended information for property 'preferred'.
    */
  var _preferred: js.UndefOr[Element] = js.native
  /**
    * The language which can be used to communicate with the patient about their health
    */
  var language: CodeableConcept = js.native
  /**
    * Language preference indicator
    */
  var preferred: js.UndefOr[Boolean] = js.native
}

object PatientCommunication {
  @scala.inline
  def apply(language: CodeableConcept): PatientCommunication = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatientCommunication]
  }
  @scala.inline
  implicit class PatientCommunicationOps[Self <: PatientCommunication] (val x: Self) extends AnyVal {
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
    def setLanguage(value: CodeableConcept): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def set_preferred(value: Element): Self = this.set("_preferred", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_preferred: Self = this.set("_preferred", js.undefined)
    @scala.inline
    def setPreferred(value: Boolean): Self = this.set("preferred", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferred: Self = this.set("preferred", js.undefined)
  }
  
}

