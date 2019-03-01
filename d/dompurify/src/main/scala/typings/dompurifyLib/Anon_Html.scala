package typings
package dompurifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Html extends js.Object {
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var mathMl: js.UndefOr[scala.Boolean] = js.undefined
  var svg: js.UndefOr[scala.Boolean] = js.undefined
  var svgFilters: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Html {
  @scala.inline
  def apply(
    html: js.UndefOr[scala.Boolean] = js.undefined,
    mathMl: js.UndefOr[scala.Boolean] = js.undefined,
    svg: js.UndefOr[scala.Boolean] = js.undefined,
    svgFilters: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Html = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (!js.isUndefined(mathMl)) __obj.updateDynamic("mathMl")(mathMl)
    if (!js.isUndefined(svg)) __obj.updateDynamic("svg")(svg)
    if (!js.isUndefined(svgFilters)) __obj.updateDynamic("svgFilters")(svgFilters)
    __obj.asInstanceOf[Anon_Html]
  }
}

