package typings.ejDotWebDotAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersSubLayersBubbleSettingsColorMappings extends js.Object {
  /** Specifies the range colorMappings in the bubble layer.
    * @Default {null}
    */
  var rangeColorMapping: js.UndefOr[js.Array[LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping]] = js.undefined
}

object LayersSubLayersBubbleSettingsColorMappings {
  @scala.inline
  def apply(rangeColorMapping: js.Array[LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping] = null): LayersSubLayersBubbleSettingsColorMappings = {
    val __obj = js.Dynamic.literal()
    if (rangeColorMapping != null) __obj.updateDynamic("rangeColorMapping")(rangeColorMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersSubLayersBubbleSettingsColorMappings]
  }
}

