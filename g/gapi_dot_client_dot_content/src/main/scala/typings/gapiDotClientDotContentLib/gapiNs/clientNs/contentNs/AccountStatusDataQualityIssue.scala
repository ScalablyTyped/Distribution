package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatusDataQualityIssue extends js.Object {
  /** Country for which this issue is reported. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** A more detailed description of the issue. */
  var detail: js.UndefOr[java.lang.String] = js.undefined
  /** Actual value displayed on the landing page. */
  var displayedValue: js.UndefOr[java.lang.String] = js.undefined
  /** Example items featuring the issue. */
  var exampleItems: js.UndefOr[js.Array[AccountStatusExampleItem]] = js.undefined
  /** Issue identifier. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Last time the account was checked for this issue. */
  var lastChecked: js.UndefOr[java.lang.String] = js.undefined
  /** The attribute name that is relevant for the issue. */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** Number of items in the account found to have the said issue. */
  var numItems: js.UndefOr[scala.Double] = js.undefined
  /** Severity of the problem. */
  var severity: js.UndefOr[java.lang.String] = js.undefined
  /** Submitted value that causes the issue. */
  var submittedValue: js.UndefOr[java.lang.String] = js.undefined
}

