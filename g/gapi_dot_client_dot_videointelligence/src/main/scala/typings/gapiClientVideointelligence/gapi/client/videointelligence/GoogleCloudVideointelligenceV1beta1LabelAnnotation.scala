package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta1LabelAnnotation extends js.Object {
  /** Textual description, e.g. `Fixed-gear bicycle`. */
  var description: js.UndefOr[String] = js.undefined
  /** Language code for `description` in BCP-47 format. */
  var languageCode: js.UndefOr[String] = js.undefined
  /** Where the label was detected and with what confidence. */
  var locations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta1LabelLocation]] = js.undefined
}

object GoogleCloudVideointelligenceV1beta1LabelAnnotation {
  @scala.inline
  def apply(
    description: String = null,
    languageCode: String = null,
    locations: js.Array[GoogleCloudVideointelligenceV1beta1LabelLocation] = null
  ): GoogleCloudVideointelligenceV1beta1LabelAnnotation = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1LabelAnnotation]
  }
}

