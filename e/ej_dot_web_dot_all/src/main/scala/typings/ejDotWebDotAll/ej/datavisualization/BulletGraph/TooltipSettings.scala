package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipSettings extends js.Object {
  /** Specifies template for caption tooltip
    * @Default {null}
    */
  var captionTemplate: js.UndefOr[String] = js.undefined
  /** Toggles the visibility of caption tooltip
    * @Default {false}
    */
  var enableCaptionTooltip: js.UndefOr[Boolean] = js.undefined
  /** Specifies the ID of a div, which is to be displayed as tooltip.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.undefined
  /** Toggles the visibility of tooltip
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object TooltipSettings {
  @scala.inline
  def apply(
    captionTemplate: String = null,
    enableCaptionTooltip: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): TooltipSettings = {
    val __obj = js.Dynamic.literal()
    if (captionTemplate != null) __obj.updateDynamic("captionTemplate")(captionTemplate)
    if (!js.isUndefined(enableCaptionTooltip)) __obj.updateDynamic("enableCaptionTooltip")(enableCaptionTooltip)
    if (template != null) __obj.updateDynamic("template")(template)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[TooltipSettings]
  }
}

