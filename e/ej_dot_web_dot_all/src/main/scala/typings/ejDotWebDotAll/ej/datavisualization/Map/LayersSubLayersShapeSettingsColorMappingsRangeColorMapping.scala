package typings.ejDotWebDotAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersSubLayersShapeSettingsColorMappingsRangeColorMapping extends js.Object {
  /** Specifies the start range colorMappings in the shape layer of map.
    * @Default {null}
    */
  var from: js.UndefOr[Double] = js.undefined
  /** Specifies the gradientColors in the shape layer of map.
    * @Default {null}
    */
  var gradientColors: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the to range colorMappings in the shape layer of map.
    * @Default {null}
    */
  var to: js.UndefOr[Double] = js.undefined
}

object LayersSubLayersShapeSettingsColorMappingsRangeColorMapping {
  @scala.inline
  def apply(from: Int | Double = null, gradientColors: js.Array[_] = null, to: Int | Double = null): LayersSubLayersShapeSettingsColorMappingsRangeColorMapping = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (gradientColors != null) __obj.updateDynamic("gradientColors")(gradientColors.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersSubLayersShapeSettingsColorMappingsRangeColorMapping]
  }
}

