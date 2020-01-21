package typings.figma.mod._Global_

import typings.figma.figmaStrings.SVG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSettingsSVG extends ExportSettings {
  val contentsOnly: js.UndefOr[Boolean] = js.undefined
  val format: SVG
   // defaults to true
  val suffix: js.UndefOr[String] = js.undefined
   // defaults to true
  val svgIdAttribute: js.UndefOr[Boolean] = js.undefined
  val svgOutlineText: js.UndefOr[Boolean] = js.undefined
   // defaults to false
  val svgSimplifyStroke: js.UndefOr[Boolean] = js.undefined
}

object ExportSettingsSVG {
  @scala.inline
  def apply(
    format: SVG,
    contentsOnly: js.UndefOr[Boolean] = js.undefined,
    suffix: String = null,
    svgIdAttribute: js.UndefOr[Boolean] = js.undefined,
    svgOutlineText: js.UndefOr[Boolean] = js.undefined,
    svgSimplifyStroke: js.UndefOr[Boolean] = js.undefined
  ): ExportSettingsSVG = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (!js.isUndefined(contentsOnly)) __obj.updateDynamic("contentsOnly")(contentsOnly.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (!js.isUndefined(svgIdAttribute)) __obj.updateDynamic("svgIdAttribute")(svgIdAttribute.asInstanceOf[js.Any])
    if (!js.isUndefined(svgOutlineText)) __obj.updateDynamic("svgOutlineText")(svgOutlineText.asInstanceOf[js.Any])
    if (!js.isUndefined(svgSimplifyStroke)) __obj.updateDynamic("svgSimplifyStroke")(svgSimplifyStroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettingsSVG]
  }
}

