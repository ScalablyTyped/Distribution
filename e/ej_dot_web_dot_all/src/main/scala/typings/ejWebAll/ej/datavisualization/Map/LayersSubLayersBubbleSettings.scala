package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersSubLayersBubbleSettings extends js.Object {
  /** Specifies the bubble Opacity value of bubbles for shape layer in map
    * @Default {0.9}
    */
  var bubbleOpacity: js.UndefOr[Double] = js.undefined
  /** Specifies the mouse hover color of the shape layer in map
    * @Default {gray}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the colorMappings of the shape layer in map
    * @Default {null}
    */
  var colorMappings: js.UndefOr[LayersSubLayersBubbleSettingsColorMappings] = js.undefined
  /** Specifies the field name in the datasource that contains color values for each bubbles.
    * @Default {null}
    */
  var colorPath: js.UndefOr[String] = js.undefined
  /** Specifies the bubble color valuePath of the shape layer in map
    * @Default {null}
    */
  var colorValuePath: js.UndefOr[String] = js.undefined
  /** Specifies the maximum size value of bubbles for shape layer in map
    * @Default {20}
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** Specifies the minimum size value of bubbles for shape layer in map
    * @Default {10}
    */
  var minValue: js.UndefOr[Double] = js.undefined
  /** Specifies the showBubble visibility status map
    * @Default {true}
    */
  var showBubble: js.UndefOr[Boolean] = js.undefined
  /** Specifies the tooltip visibility status of the shape layer in map
    * @Default {false}
    */
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  /** Specifies the bubble tooltip template of the shape layer in map
    * @Default {null}
    */
  var tooltipTemplate: js.UndefOr[String] = js.undefined
  /** Specifies the bubble valuePath of the shape layer in map
    * @Default {null}
    */
  var valuePath: js.UndefOr[String] = js.undefined
}

object LayersSubLayersBubbleSettings {
  @scala.inline
  def apply(
    bubbleOpacity: Int | Double = null,
    color: String = null,
    colorMappings: LayersSubLayersBubbleSettingsColorMappings = null,
    colorPath: String = null,
    colorValuePath: String = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    showBubble: js.UndefOr[Boolean] = js.undefined,
    showTooltip: js.UndefOr[Boolean] = js.undefined,
    tooltipTemplate: String = null,
    valuePath: String = null
  ): LayersSubLayersBubbleSettings = {
    val __obj = js.Dynamic.literal()
    if (bubbleOpacity != null) __obj.updateDynamic("bubbleOpacity")(bubbleOpacity.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorMappings != null) __obj.updateDynamic("colorMappings")(colorMappings.asInstanceOf[js.Any])
    if (colorPath != null) __obj.updateDynamic("colorPath")(colorPath.asInstanceOf[js.Any])
    if (colorValuePath != null) __obj.updateDynamic("colorValuePath")(colorValuePath.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (!js.isUndefined(showBubble)) __obj.updateDynamic("showBubble")(showBubble.asInstanceOf[js.Any])
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip.asInstanceOf[js.Any])
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate.asInstanceOf[js.Any])
    if (valuePath != null) __obj.updateDynamic("valuePath")(valuePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersSubLayersBubbleSettings]
  }
}

