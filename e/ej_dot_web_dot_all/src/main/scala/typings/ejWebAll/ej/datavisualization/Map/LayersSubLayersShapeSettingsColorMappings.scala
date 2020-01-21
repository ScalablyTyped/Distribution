package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersSubLayersShapeSettingsColorMappings extends js.Object {
  /** Specifies the equalColorMapping in the shape layer of map.
    * @Default {null}
    */
  var equalColorMapping: js.UndefOr[js.Array[LayersSubLayersShapeSettingsColorMappingsEqualColorMapping]] = js.undefined
  /** Specifies the range colorMappings in the shape layer of map.
    * @Default {null}
    */
  var rangeColorMapping: js.UndefOr[js.Array[LayersSubLayersShapeSettingsColorMappingsRangeColorMapping]] = js.undefined
}

object LayersSubLayersShapeSettingsColorMappings {
  @scala.inline
  def apply(
    equalColorMapping: js.Array[LayersSubLayersShapeSettingsColorMappingsEqualColorMapping] = null,
    rangeColorMapping: js.Array[LayersSubLayersShapeSettingsColorMappingsRangeColorMapping] = null
  ): LayersSubLayersShapeSettingsColorMappings = {
    val __obj = js.Dynamic.literal()
    if (equalColorMapping != null) __obj.updateDynamic("equalColorMapping")(equalColorMapping.asInstanceOf[js.Any])
    if (rangeColorMapping != null) __obj.updateDynamic("rangeColorMapping")(rangeColorMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersSubLayersShapeSettingsColorMappings]
  }
}

