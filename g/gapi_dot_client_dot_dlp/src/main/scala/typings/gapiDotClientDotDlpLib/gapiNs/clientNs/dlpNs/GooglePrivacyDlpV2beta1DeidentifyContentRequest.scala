package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1DeidentifyContentRequest extends js.Object {
  /** Configuration for the de-identification of the list of content items. */
  var deidentifyConfig: js.UndefOr[GooglePrivacyDlpV2beta1DeidentifyConfig] = js.undefined
  /** Configuration for the inspector. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2beta1InspectConfig] = js.undefined
  /**
    * The list of items to inspect. Up to 100 are allowed per request.
    * All items will be treated as text/&#42;.
    */
  var items: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ContentItem]] = js.undefined
}

object GooglePrivacyDlpV2beta1DeidentifyContentRequest {
  @scala.inline
  def apply(
    deidentifyConfig: GooglePrivacyDlpV2beta1DeidentifyConfig = null,
    inspectConfig: GooglePrivacyDlpV2beta1InspectConfig = null,
    items: js.Array[GooglePrivacyDlpV2beta1ContentItem] = null
  ): GooglePrivacyDlpV2beta1DeidentifyContentRequest = {
    val __obj = js.Dynamic.literal()
    if (deidentifyConfig != null) __obj.updateDynamic("deidentifyConfig")(deidentifyConfig)
    if (inspectConfig != null) __obj.updateDynamic("inspectConfig")(inspectConfig)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1DeidentifyContentRequest]
  }
}

