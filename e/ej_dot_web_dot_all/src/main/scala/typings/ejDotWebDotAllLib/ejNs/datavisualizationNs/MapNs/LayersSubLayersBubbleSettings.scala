package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LayersSubLayersBubbleSettings extends js.Object {
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
  var colorMappings: js.UndefOr[LayersSubLayersBubbleSettingsColorMappings] = js.undefined
  /** Specifies the field name in the datasource that contains color values for each bubbles.
               * @Default {null}
               */
  var colorPath: js.UndefOr[java.lang.String] = js.undefined
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

