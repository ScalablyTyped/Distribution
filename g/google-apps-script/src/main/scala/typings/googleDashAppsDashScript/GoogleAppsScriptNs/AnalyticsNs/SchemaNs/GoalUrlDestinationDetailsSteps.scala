package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalUrlDestinationDetailsSteps extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object GoalUrlDestinationDetailsSteps {
  @scala.inline
  def apply(name: String = null, number: Int | Double = null, url: String = null): GoalUrlDestinationDetailsSteps = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GoalUrlDestinationDetailsSteps]
  }
}

