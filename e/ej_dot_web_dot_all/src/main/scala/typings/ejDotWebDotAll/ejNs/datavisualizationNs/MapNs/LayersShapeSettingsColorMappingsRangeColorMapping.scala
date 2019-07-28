package typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersShapeSettingsColorMappingsRangeColorMapping extends js.Object {
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

object LayersShapeSettingsColorMappingsRangeColorMapping {
  @scala.inline
  def apply(from: Int | Double = null, gradientColors: js.Array[_] = null, to: Int | Double = null): LayersShapeSettingsColorMappingsRangeColorMapping = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (gradientColors != null) __obj.updateDynamic("gradientColors")(gradientColors)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersShapeSettingsColorMappingsRangeColorMapping]
  }
}

