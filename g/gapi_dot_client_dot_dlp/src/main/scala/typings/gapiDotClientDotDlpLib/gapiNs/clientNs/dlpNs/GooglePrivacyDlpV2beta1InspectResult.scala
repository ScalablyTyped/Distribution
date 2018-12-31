package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

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
  var findingsTruncated: js.UndefOr[scala.Boolean] = js.undefined
}

