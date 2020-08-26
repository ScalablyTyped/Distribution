package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudVideointelligenceV1LabelAnnotation extends js.Object {
  /** Textual description, e.g. `Fixed-gear bicycle`. */
  var description: js.UndefOr[String] = js.native
  /** Language code for `description` in BCP-47 format. */
  var languageCode: js.UndefOr[String] = js.native
  /** Where the label was detected and with what confidence. */
  var locations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1LabelLocation]] = js.native
}

object GoogleCloudVideointelligenceV1LabelAnnotation {
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1LabelAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1LabelAnnotation]
  }
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1LabelAnnotationOps[Self <: GoogleCloudVideointelligenceV1LabelAnnotation] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    @scala.inline
    def setLocationsVarargs(value: GoogleCloudVideointelligenceV1LabelLocation*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[GoogleCloudVideointelligenceV1LabelLocation]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
  }
  
}

