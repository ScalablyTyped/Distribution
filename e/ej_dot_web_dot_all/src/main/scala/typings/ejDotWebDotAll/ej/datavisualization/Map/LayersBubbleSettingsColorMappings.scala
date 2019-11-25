package typings.ejDotWebDotAll.ej.datavisualization.Map

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
    if (rangeColorMapping != null) __obj.updateDynamic("rangeColorMapping")(rangeColorMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersBubbleSettingsColorMappings]
  }
}

