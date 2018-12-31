package typings
package gapiDotClientDotSearchconsoleLib.gapiNs.clientNs.searchconsoleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunMobileFriendlyTestResponse extends js.Object {
  /** Test verdict, whether the page is mobile friendly or not. */
  var mobileFriendliness: js.UndefOr[java.lang.String] = js.undefined
  /** List of mobile-usability issues. */
  var mobileFriendlyIssues: js.UndefOr[js.Array[MobileFriendlyIssue]] = js.undefined
  /** Information about embedded resources issues. */
  var resourceIssues: js.UndefOr[js.Array[ResourceIssue]] = js.undefined
  /** Screenshot of the requested URL. */
  var screenshot: js.UndefOr[Image] = js.undefined
  /** Final state of the test, can be either complete or an error. */
  var testStatus: js.UndefOr[TestStatus] = js.undefined
}

