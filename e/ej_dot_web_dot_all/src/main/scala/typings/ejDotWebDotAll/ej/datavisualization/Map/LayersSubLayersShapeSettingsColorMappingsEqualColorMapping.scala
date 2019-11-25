package typings.ejDotWebDotAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersSubLayersShapeSettingsColorMappingsEqualColorMapping extends js.Object {
  /** Specifies the equalColorMapping color in the shape layer of map.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the equalColorMapping value in the shape layer of map.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.undefined
}

object LayersSubLayersShapeSettingsColorMappingsEqualColorMapping {
  @scala.inline
  def apply(color: String = null, value: String = null): LayersSubLayersShapeSettingsColorMappingsEqualColorMapping = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersSubLayersShapeSettingsColorMappingsEqualColorMapping]
  }
}

