package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TransitTableTransitTimeRowTransitTimeValue extends js.Object {
  /**
    * Must be greater than or equal to minTransitTimeInDays.
    */
  var maxTransitTimeInDays: js.UndefOr[Double] = js.native
  /**
    * Transit time range (min-max) in business days. 0 means same day delivery,
    * 1 means next day delivery.
    */
  var minTransitTimeInDays: js.UndefOr[Double] = js.native
}

object Schema$TransitTableTransitTimeRowTransitTimeValue {
  @scala.inline
  def apply(maxTransitTimeInDays: Int | Double = null, minTransitTimeInDays: Int | Double = null): Schema$TransitTableTransitTimeRowTransitTimeValue = {
    val __obj = js.Dynamic.literal()
    if (maxTransitTimeInDays != null) __obj.updateDynamic("maxTransitTimeInDays")(maxTransitTimeInDays.asInstanceOf[js.Any])
    if (minTransitTimeInDays != null) __obj.updateDynamic("minTransitTimeInDays")(minTransitTimeInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TransitTableTransitTimeRowTransitTimeValue]
  }
}

