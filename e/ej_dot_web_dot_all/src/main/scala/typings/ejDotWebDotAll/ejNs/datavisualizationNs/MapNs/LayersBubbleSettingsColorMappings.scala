package typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersBubbleSettingsColorMappings extends js.Object {
  /** Specifies the range colorMappings in the bubble layer.
    * @Default {null}
    */
  var rangeColorMapping: js.UndefOr[js.Array[LayersBubbleSettingsColorMappingsRangeColorMapping]] = js.undefined
}

object LayersBubbleSettingsColorMappings {
  @scala.inline
  def apply(rangeColorMapping: js.Array[LayersBubbleSettingsColorMappingsRangeColorMapping] = null): LayersBubbleSettingsColorMappings = {
    val __obj = js.Dynamic.literal()
    if (rangeColorMapping != null) __obj.updateDynamic("rangeColorMapping")(rangeColorMapping)
    __obj.asInstanceOf[LayersBubbleSettingsColorMappings]
  }
}

