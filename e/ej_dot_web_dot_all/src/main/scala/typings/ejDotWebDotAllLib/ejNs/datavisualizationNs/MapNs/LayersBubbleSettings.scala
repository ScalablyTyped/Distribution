package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersBubbleSettings extends js.Object {
  /** Specifies the bubble Opacity value of bubbles for shape layer in map
    * @Default {0.9}
    */
  var bubbleOpacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the mouse hover color of the shape layer in map
    * @Default {gray}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the colorMappings of the shape layer in map
    * @Default {null}
    */
  var colorMappings: js.UndefOr[LayersBubbleSettingsColorMappings] = js.undefined
  /** Specifies the bubble color valuePath of the shape layer in map
    * @Default {null}
    */
  var colorValuePath: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the maximum size value of bubbles for shape layer in map
    * @Default {20}
    */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the minimum size value of bubbles for shape layer in map
    * @Default {10}
    */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the showBubble visibility status map
    * @Default {true}
    */
  var showBubble: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the tooltip visibility status of the shape layer in map
    * @Default {false}
    */
  var showTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the bubble tooltip template of the shape layer in map
    * @Default {null}
    */
  var tooltipTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the bubble valuePath of the shape layer in map
    * @Default {null}
    */
  var valuePath: js.UndefOr[java.lang.String] = js.undefined
}

object LayersBubbleSettings {
  @scala.inline
  def apply(
    bubbleOpacity: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    colorMappings: LayersBubbleSettingsColorMappings = null,
    colorValuePath: java.lang.String = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    showBubble: js.UndefOr[scala.Boolean] = js.undefined,
    showTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    tooltipTemplate: java.lang.String = null,
    valuePath: java.lang.String = null
  ): LayersBubbleSettings = {
    val __obj = js.Dynamic.literal()
    if (bubbleOpacity != null) __obj.updateDynamic("bubbleOpacity")(bubbleOpacity.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (colorMappings != null) __obj.updateDynamic("colorMappings")(colorMappings)
    if (colorValuePath != null) __obj.updateDynamic("colorValuePath")(colorValuePath)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (!js.isUndefined(showBubble)) __obj.updateDynamic("showBubble")(showBubble)
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip)
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate)
    if (valuePath != null) __obj.updateDynamic("valuePath")(valuePath)
    __obj.asInstanceOf[LayersBubbleSettings]
  }
}

