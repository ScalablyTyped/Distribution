package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1InspectContentRequest extends js.Object {
  /** Configuration for the inspector. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2beta1InspectConfig] = js.undefined
  /**
    * The list of items to inspect. Items in a single request are
    * considered "related" unless inspect_config.independent_inputs is true.
    * Up to 100 are allowed per request.
    */
  var items: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ContentItem]] = js.undefined
}

object GooglePrivacyDlpV2beta1InspectContentRequest {
  @scala.inline
  def apply(
    inspectConfig: GooglePrivacyDlpV2beta1InspectConfig = null,
    items: js.Array[GooglePrivacyDlpV2beta1ContentItem] = null
  ): GooglePrivacyDlpV2beta1InspectContentRequest = {
    val __obj = js.Dynamic.literal()
    if (inspectConfig != null) __obj.updateDynamic("inspectConfig")(inspectConfig.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InspectContentRequest]
  }
}

