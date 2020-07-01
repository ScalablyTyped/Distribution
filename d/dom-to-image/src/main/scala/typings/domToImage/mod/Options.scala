package typings.domToImage.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bgcolor: js.UndefOr[String] = js.undefined
  var cacheBust: js.UndefOr[Boolean] = js.undefined
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
    cacheBust: js.UndefOr[Boolean] = js.undefined,
    filter: /* node */ Node => Boolean = null,
    height: js.UndefOr[Double] = js.undefined,
    imagePlaceholder: String = null,
    quality: js.UndefOr[Double] = js.undefined,
    style: js.Object = null,
    width: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheBust)) __obj.updateDynamic("cacheBust")(cacheBust.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (imagePlaceholder != null) __obj.updateDynamic("imagePlaceholder")(imagePlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

