package typings.domDashToDashImage.domDashToDashImageMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bgcolor: js.UndefOr[String] = js.undefined
  var cachebust: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var imagePlaceholder: js.UndefOr[String] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    bgcolor: String = null,
    cachebust: js.UndefOr[Boolean] = js.undefined,
    filter: /* node */ Node => Boolean = null,
    height: Int | Double = null,
    imagePlaceholder: String = null,
    quality: Int | Double = null,
    style: js.Object = null,
    width: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor)
    if (!js.isUndefined(cachebust)) __obj.updateDynamic("cachebust")(cachebust)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (imagePlaceholder != null) __obj.updateDynamic("imagePlaceholder")(imagePlaceholder)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

