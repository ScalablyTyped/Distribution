package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoyaltyPoints extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pointsValue: js.UndefOr[java.lang.String] = js.undefined
  var ratio: js.UndefOr[scala.Double] = js.undefined
}

object LoyaltyPoints {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    pointsValue: java.lang.String = null,
    ratio: scala.Int | scala.Double = null
  ): LoyaltyPoints = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (pointsValue != null) __obj.updateDynamic("pointsValue")(pointsValue)
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoyaltyPoints]
  }
}

