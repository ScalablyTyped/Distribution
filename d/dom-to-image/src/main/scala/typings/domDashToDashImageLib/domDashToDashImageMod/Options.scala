package typings
package domDashToDashImageLib.domDashToDashImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bgcolor: js.UndefOr[java.lang.String] = js.undefined
  var cachebust: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[js.Function1[/* node */ stdLib.Node, scala.Boolean]] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var imagePlaceholder: js.UndefOr[java.lang.String] = js.undefined
  var quality: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    bgcolor: java.lang.String = null,
    cachebust: js.UndefOr[scala.Boolean] = js.undefined,
    filter: js.Function1[/* node */ stdLib.Node, scala.Boolean] = null,
    height: scala.Int | scala.Double = null,
    imagePlaceholder: java.lang.String = null,
    quality: scala.Int | scala.Double = null,
    style: js.Object = null,
    width: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor)
    if (!js.isUndefined(cachebust)) __obj.updateDynamic("cachebust")(cachebust)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (imagePlaceholder != null) __obj.updateDynamic("imagePlaceholder")(imagePlaceholder)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

