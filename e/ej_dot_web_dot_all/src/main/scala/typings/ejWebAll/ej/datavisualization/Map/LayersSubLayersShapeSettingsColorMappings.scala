package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersSubLayersShapeSettingsColorMappings extends js.Object {
  /** Specifies the equalColorMapping in the shape layer of map.
    * @Default {null}
    */
  var equalColorMapping: js.UndefOr[js.Array[LayersSubLayersShapeSettingsColorMappingsEqualColorMapping]] = js.native
  /** Specifies the range colorMappings in the shape layer of map.
    * @Default {null}
    */
  var rangeColorMapping: js.UndefOr[js.Array[LayersSubLayersShapeSettingsColorMappingsRangeColorMapping]] = js.native
}

object LayersSubLayersShapeSettingsColorMappings {
  @scala.inline
  def apply(): LayersSubLayersShapeSettingsColorMappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersSubLayersShapeSettingsColorMappings]
  }
  @scala.inline
  implicit class LayersSubLayersShapeSettingsColorMappingsOps[Self <: LayersSubLayersShapeSettingsColorMappings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEqualColorMappingVarargs(value: LayersSubLayersShapeSettingsColorMappingsEqualColorMapping*): Self = this.set("equalColorMapping", js.Array(value :_*))
    @scala.inline
    def setEqualColorMapping(value: js.Array[LayersSubLayersShapeSettingsColorMappingsEqualColorMapping]): Self = this.set("equalColorMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEqualColorMapping: Self = this.set("equalColorMapping", js.undefined)
    @scala.inline
    def setRangeColorMappingVarargs(value: LayersSubLayersShapeSettingsColorMappingsRangeColorMapping*): Self = this.set("rangeColorMapping", js.Array(value :_*))
    @scala.inline
    def setRangeColorMapping(value: js.Array[LayersSubLayersShapeSettingsColorMappingsRangeColorMapping]): Self = this.set("rangeColorMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeColorMapping: Self = this.set("rangeColorMapping", js.undefined)
  }
  
}

