package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitTableTransitTimeRowTransitTimeValue extends js.Object {
  var maxTransitTimeInDays: js.UndefOr[scala.Double] = js.undefined
  var minTransitTimeInDays: js.UndefOr[scala.Double] = js.undefined
}

object TransitTableTransitTimeRowTransitTimeValue {
  @scala.inline
  def apply(
    maxTransitTimeInDays: scala.Int | scala.Double = null,
    minTransitTimeInDays: scala.Int | scala.Double = null
  ): TransitTableTransitTimeRowTransitTimeValue = {
    val __obj = js.Dynamic.literal()
    if (maxTransitTimeInDays != null) __obj.updateDynamic("maxTransitTimeInDays")(maxTransitTimeInDays.asInstanceOf[js.Any])
    if (minTransitTimeInDays != null) __obj.updateDynamic("minTransitTimeInDays")(minTransitTimeInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitTableTransitTimeRowTransitTimeValue]
  }
}

