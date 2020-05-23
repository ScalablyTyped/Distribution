package typings.dompurify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Html extends js.Object {
  var html: js.UndefOr[Boolean] = js.undefined
  var mathMl: js.UndefOr[Boolean] = js.undefined
  var svg: js.UndefOr[Boolean] = js.undefined
  var svgFilters: js.UndefOr[Boolean] = js.undefined
}

object Html {
  @scala.inline
  def apply(
    html: js.UndefOr[Boolean] = js.undefined,
    mathMl: js.UndefOr[Boolean] = js.undefined,
    svg: js.UndefOr[Boolean] = js.undefined,
    svgFilters: js.UndefOr[Boolean] = js.undefined
  ): Html = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mathMl)) __obj.updateDynamic("mathMl")(mathMl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(svg)) __obj.updateDynamic("svg")(svg.get.asInstanceOf[js.Any])
    if (!js.isUndefined(svgFilters)) __obj.updateDynamic("svgFilters")(svgFilters.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Html]
  }
}

