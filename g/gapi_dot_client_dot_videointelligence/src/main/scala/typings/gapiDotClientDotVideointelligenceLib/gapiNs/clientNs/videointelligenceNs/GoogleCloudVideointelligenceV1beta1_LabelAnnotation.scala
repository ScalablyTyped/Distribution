package typings
package gapiDotClientDotVideointelligenceLib.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta1_LabelAnnotation extends js.Object {
  /** Textual description, e.g. `Fixed-gear bicycle`. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Language code for `description` in BCP-47 format. */
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  /** Where the label was detected and with what confidence. */
  var locations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta1_LabelLocation]] = js.undefined
}

object GoogleCloudVideointelligenceV1beta1_LabelAnnotation {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    languageCode: java.lang.String = null,
    locations: js.Array[GoogleCloudVideointelligenceV1beta1_LabelLocation] = null
  ): GoogleCloudVideointelligenceV1beta1_LabelAnnotation = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1_LabelAnnotation]
  }
}

