package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoyaltyPoints extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var pointsValue: js.UndefOr[String] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
}

object LoyaltyPoints {
  @scala.inline
  def apply(name: String = null, pointsValue: String = null, ratio: Int | Double = null): LoyaltyPoints = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (pointsValue != null) __obj.updateDynamic("pointsValue")(pointsValue)
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoyaltyPoints]
  }
}

