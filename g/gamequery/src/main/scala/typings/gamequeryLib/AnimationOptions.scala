package typings
package gamequeryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  var delta: js.UndefOr[scala.Double] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  var imageURL: java.lang.String
  var numberOfFrame: js.UndefOr[scala.Double] = js.undefined
  var offsetx: js.UndefOr[scala.Double] = js.undefined
  var offsety: js.UndefOr[scala.Double] = js.undefined
  var rate: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[scala.Double] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(
    imageURL: java.lang.String,
    delta: scala.Int | scala.Double = null,
    distance: scala.Int | scala.Double = null,
    numberOfFrame: scala.Int | scala.Double = null,
    offsetx: scala.Int | scala.Double = null,
    offsety: scala.Int | scala.Double = null,
    rate: scala.Int | scala.Double = null,
    `type`: scala.Int | scala.Double = null
  ): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("imageURL")(imageURL)
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (numberOfFrame != null) __obj.updateDynamic("numberOfFrame")(numberOfFrame.asInstanceOf[js.Any])
    if (offsetx != null) __obj.updateDynamic("offsetx")(offsetx.asInstanceOf[js.Any])
    if (offsety != null) __obj.updateDynamic("offsety")(offsety.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOptions]
  }
}

