package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All the findings for a single scanned item.
  */
@js.native
trait Schema$GooglePrivacyDlpV2InspectResult extends js.Object {
  /**
    * List of findings for an item.
    */
  var findings: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2Finding]] = js.native
  /**
    * If true, then this item might have more findings than were returned, and
    * the findings returned are an arbitrary subset of all findings. The
    * findings list might be truncated because the input items were too large,
    * or because the server reached the maximum amount of resources allowed for
    * a single API call. For best results, divide the input into smaller
    * batches.
    */
  var findingsTruncated: js.UndefOr[Boolean] = js.native
}

object Schema$GooglePrivacyDlpV2InspectResult {
  @scala.inline
  def apply(
    findings: js.Array[Schema$GooglePrivacyDlpV2Finding] = null,
    findingsTruncated: js.UndefOr[Boolean] = js.undefined
  ): Schema$GooglePrivacyDlpV2InspectResult = {
    val __obj = js.Dynamic.literal()
    if (findings != null) __obj.updateDynamic("findings")(findings.asInstanceOf[js.Any])
    if (!js.isUndefined(findingsTruncated)) __obj.updateDynamic("findingsTruncated")(findingsTruncated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2InspectResult]
  }
}

