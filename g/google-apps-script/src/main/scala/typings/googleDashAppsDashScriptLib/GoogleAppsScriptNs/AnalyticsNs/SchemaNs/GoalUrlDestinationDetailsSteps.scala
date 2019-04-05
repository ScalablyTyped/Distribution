package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalUrlDestinationDetailsSteps extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var number: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object GoalUrlDestinationDetailsSteps {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    number: scala.Int | scala.Double = null,
    url: java.lang.String = null
  ): GoalUrlDestinationDetailsSteps = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GoalUrlDestinationDetailsSteps]
  }
}

