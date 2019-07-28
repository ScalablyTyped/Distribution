package typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping extends js.Object {
  /** Color of the bubble layer.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Start range colorMappings in the bubble layer.
    * @Default {null}
    */
  var from: js.UndefOr[Double] = js.undefined
  /** GradientColors in the bubble layer of map.
    */
  var gradientColors: js.UndefOr[js.Array[_]] = js.undefined
  /** End range colorMappings in the bubble layer.
    * @Default {null}
    */
  var to: js.UndefOr[Double] = js.undefined
}

object LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping {
  @scala.inline
  def apply(
    color: String = null,
    from: Int | Double = null,
    gradientColors: js.Array[_] = null,
    to: Int | Double = null
  ): LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (gradientColors != null) __obj.updateDynamic("gradientColors")(gradientColors)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping]
  }
}

