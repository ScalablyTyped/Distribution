package typings.googleapis.buildSrcApisSearchconsoleV1Mod.searchconsole_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mobile-friendly test response, including mobile-friendly issues and
  * resource issues.
  */
@js.native
trait Schema$RunMobileFriendlyTestResponse extends js.Object {
  /**
    * Test verdict, whether the page is mobile friendly or not.
    */
  var mobileFriendliness: js.UndefOr[String] = js.native
  /**
    * List of mobile-usability issues.
    */
  var mobileFriendlyIssues: js.UndefOr[js.Array[Schema$MobileFriendlyIssue]] = js.native
  /**
    * Information about embedded resources issues.
    */
  var resourceIssues: js.UndefOr[js.Array[Schema$ResourceIssue]] = js.native
  /**
    * Screenshot of the requested URL.
    */
  var screenshot: js.UndefOr[Schema$Image] = js.native
  /**
    * Final state of the test, can be either complete or an error.
    */
  var testStatus: js.UndefOr[Schema$TestStatus] = js.native
}

object Schema$RunMobileFriendlyTestResponse {
  @scala.inline
  def apply(
    mobileFriendliness: String = null,
    mobileFriendlyIssues: js.Array[Schema$MobileFriendlyIssue] = null,
    resourceIssues: js.Array[Schema$ResourceIssue] = null,
    screenshot: Schema$Image = null,
    testStatus: Schema$TestStatus = null
  ): Schema$RunMobileFriendlyTestResponse = {
    val __obj = js.Dynamic.literal()
    if (mobileFriendliness != null) __obj.updateDynamic("mobileFriendliness")(mobileFriendliness.asInstanceOf[js.Any])
    if (mobileFriendlyIssues != null) __obj.updateDynamic("mobileFriendlyIssues")(mobileFriendlyIssues.asInstanceOf[js.Any])
    if (resourceIssues != null) __obj.updateDynamic("resourceIssues")(resourceIssues.asInstanceOf[js.Any])
    if (screenshot != null) __obj.updateDynamic("screenshot")(screenshot.asInstanceOf[js.Any])
    if (testStatus != null) __obj.updateDynamic("testStatus")(testStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RunMobileFriendlyTestResponse]
  }
}

