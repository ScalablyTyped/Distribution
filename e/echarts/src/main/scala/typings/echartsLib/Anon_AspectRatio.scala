package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AspectRatio extends js.Object {
  var aspectRatio: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var maxAspectRatio: js.UndefOr[scala.Double] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var minAspectRatio: js.UndefOr[scala.Double] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AspectRatio {
  @scala.inline
  def apply(
    aspectRatio: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    maxAspectRatio: scala.Int | scala.Double = null,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    minAspectRatio: scala.Int | scala.Double = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Anon_AspectRatio = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (maxAspectRatio != null) __obj.updateDynamic("maxAspectRatio")(maxAspectRatio.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minAspectRatio != null) __obj.updateDynamic("minAspectRatio")(minAspectRatio.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AspectRatio]
  }
}

