package typings.gapiDotClientDotSearchconsole.gapiNs.clientNs.searchconsoleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunMobileFriendlyTestResponse extends js.Object {
  /** Test verdict, whether the page is mobile friendly or not. */
  var mobileFriendliness: js.UndefOr[String] = js.undefined
  /** List of mobile-usability issues. */
  var mobileFriendlyIssues: js.UndefOr[js.Array[MobileFriendlyIssue]] = js.undefined
  /** Information about embedded resources issues. */
  var resourceIssues: js.UndefOr[js.Array[ResourceIssue]] = js.undefined
  /** Screenshot of the requested URL. */
  var screenshot: js.UndefOr[Image] = js.undefined
  /** Final state of the test, can be either complete or an error. */
  var testStatus: js.UndefOr[TestStatus] = js.undefined
}

object RunMobileFriendlyTestResponse {
  @scala.inline
  def apply(
    mobileFriendliness: String = null,
    mobileFriendlyIssues: js.Array[MobileFriendlyIssue] = null,
    resourceIssues: js.Array[ResourceIssue] = null,
    screenshot: Image = null,
    testStatus: TestStatus = null
  ): RunMobileFriendlyTestResponse = {
    val __obj = js.Dynamic.literal()
    if (mobileFriendliness != null) __obj.updateDynamic("mobileFriendliness")(mobileFriendliness)
    if (mobileFriendlyIssues != null) __obj.updateDynamic("mobileFriendlyIssues")(mobileFriendlyIssues)
    if (resourceIssues != null) __obj.updateDynamic("resourceIssues")(resourceIssues)
    if (screenshot != null) __obj.updateDynamic("screenshot")(screenshot)
    if (testStatus != null) __obj.updateDynamic("testStatus")(testStatus)
    __obj.asInstanceOf[RunMobileFriendlyTestResponse]
  }
}

