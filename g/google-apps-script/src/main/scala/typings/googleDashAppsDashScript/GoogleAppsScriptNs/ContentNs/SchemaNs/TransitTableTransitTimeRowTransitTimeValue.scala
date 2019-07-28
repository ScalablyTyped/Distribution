package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitTableTransitTimeRowTransitTimeValue extends js.Object {
  var maxTransitTimeInDays: js.UndefOr[Double] = js.undefined
  var minTransitTimeInDays: js.UndefOr[Double] = js.undefined
}

object TransitTableTransitTimeRowTransitTimeValue {
  @scala.inline
  def apply(maxTransitTimeInDays: Int | Double = null, minTransitTimeInDays: Int | Double = null): TransitTableTransitTimeRowTransitTimeValue = {
    val __obj = js.Dynamic.literal()
    if (maxTransitTimeInDays != null) __obj.updateDynamic("maxTransitTimeInDays")(maxTransitTimeInDays.asInstanceOf[js.Any])
    if (minTransitTimeInDays != null) __obj.updateDynamic("minTransitTimeInDays")(minTransitTimeInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitTableTransitTimeRowTransitTimeValue]
  }
}

