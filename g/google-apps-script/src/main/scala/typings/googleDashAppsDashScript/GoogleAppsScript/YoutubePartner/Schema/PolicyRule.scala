package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyRule extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var conditions: js.UndefOr[Conditions] = js.undefined
  var subaction: js.UndefOr[js.Array[String]] = js.undefined
}

object PolicyRule {
  @scala.inline
  def apply(action: String = null, conditions: Conditions = null, subaction: js.Array[String] = null): PolicyRule = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (subaction != null) __obj.updateDynamic("subaction")(subaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyRule]
  }
}

