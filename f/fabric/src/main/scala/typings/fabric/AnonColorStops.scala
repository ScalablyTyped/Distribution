package typings.fabric

import typings.fabric.fabricImplMod.IGradientOptionsColorStops
import typings.fabric.fabricImplMod.IGradientOptionsCoords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorStops extends js.Object {
  var colorStops: js.UndefOr[IGradientOptionsColorStops] = js.undefined
  var coords: js.UndefOr[IGradientOptionsCoords] = js.undefined
  var gradientUnits: js.UndefOr[js.Any] = js.undefined
  var offsetX: js.UndefOr[js.Any] = js.undefined
  var offsetY: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AnonColorStops {
  @scala.inline
  def apply(
    colorStops: IGradientOptionsColorStops = null,
    coords: IGradientOptionsCoords = null,
    gradientUnits: js.Any = null,
    offsetX: js.Any = null,
    offsetY: js.Any = null,
    `type`: String = null
  ): AnonColorStops = {
    val __obj = js.Dynamic.literal()
    if (colorStops != null) __obj.updateDynamic("colorStops")(colorStops.asInstanceOf[js.Any])
    if (coords != null) __obj.updateDynamic("coords")(coords.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorStops]
  }
}

