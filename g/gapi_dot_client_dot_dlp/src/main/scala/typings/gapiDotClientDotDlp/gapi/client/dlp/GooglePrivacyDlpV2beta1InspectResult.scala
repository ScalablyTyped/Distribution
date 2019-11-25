package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1InspectResult extends js.Object {
  /** List of findings for an item. */
  var findings: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Finding]] = js.undefined
  /**
    * If true, then this item might have more findings than were returned,
    * and the findings returned are an arbitrary subset of all findings.
    * The findings list might be truncated because the input items were too
    * large, or because the server reached the maximum amount of resources
    * allowed for a single API call. For best results, divide the input into
    * smaller batches.
    */
  var findingsTruncated: js.UndefOr[Boolean] = js.undefined
}

object GooglePrivacyDlpV2beta1InspectResult {
  @scala.inline
  def apply(
    findings: js.Array[GooglePrivacyDlpV2beta1Finding] = null,
    findingsTruncated: js.UndefOr[Boolean] = js.undefined
  ): GooglePrivacyDlpV2beta1InspectResult = {
    val __obj = js.Dynamic.literal()
    if (findings != null) __obj.updateDynamic("findings")(findings.asInstanceOf[js.Any])
    if (!js.isUndefined(findingsTruncated)) __obj.updateDynamic("findingsTruncated")(findingsTruncated.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InspectResult]
  }
}

