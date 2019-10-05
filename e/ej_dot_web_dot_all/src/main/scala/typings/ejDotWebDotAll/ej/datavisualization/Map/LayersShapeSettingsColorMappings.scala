package typings.ejDotWebDotAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersShapeSettingsColorMappings extends js.Object {
  /** Specifies the equalColorMapping in the shape layer of map.
    * @Default {null}
    */
  var equalColorMapping: js.UndefOr[js.Array[LayersShapeSettingsColorMappingsEqualColorMapping]] = js.undefined
  /** Specifies the range colorMappings in the shape layer of map.
    * @Default {null}
    */
  var rangeColorMapping: js.UndefOr[js.Array[LayersShapeSettingsColorMappingsRangeColorMapping]] = js.undefined
}

object LayersShapeSettingsColorMappings {
  @scala.inline
  def apply(
    equalColorMapping: js.Array[LayersShapeSettingsColorMappingsEqualColorMapping] = null,
    rangeColorMapping: js.Array[LayersShapeSettingsColorMappingsRangeColorMapping] = null
  ): LayersShapeSettingsColorMappings = {
    val __obj = js.Dynamic.literal()
    if (equalColorMapping != null) __obj.updateDynamic("equalColorMapping")(equalColorMapping)
    if (rangeColorMapping != null) __obj.updateDynamic("rangeColorMapping")(rangeColorMapping)
    __obj.asInstanceOf[LayersShapeSettingsColorMappings]
  }
}

