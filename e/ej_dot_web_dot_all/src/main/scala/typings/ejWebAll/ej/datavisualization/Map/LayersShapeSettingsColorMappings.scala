package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayersShapeSettingsColorMappings extends js.Object {
  
  /** Specifies the equalColorMapping in the shape layer of map.
    * @Default {null}
    */
  var equalColorMapping: js.UndefOr[js.Array[LayersShapeSettingsColorMappingsEqualColorMapping]] = js.native
  
  /** Specifies the range colorMappings in the shape layer of map.
    * @Default {null}
    */
  var rangeColorMapping: js.UndefOr[js.Array[LayersShapeSettingsColorMappingsRangeColorMapping]] = js.native
}
object LayersShapeSettingsColorMappings {
  
  @scala.inline
  def apply(): LayersShapeSettingsColorMappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersShapeSettingsColorMappings]
  }
  
  @scala.inline
  implicit class LayersShapeSettingsColorMappingsOps[Self <: LayersShapeSettingsColorMappings] (val x: Self) extends AnyVal {
    
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
    def setEqualColorMappingVarargs(value: LayersShapeSettingsColorMappingsEqualColorMapping*): Self = this.set("equalColorMapping", js.Array(value :_*))
    
    @scala.inline
    def setEqualColorMapping(value: js.Array[LayersShapeSettingsColorMappingsEqualColorMapping]): Self = this.set("equalColorMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEqualColorMapping: Self = this.set("equalColorMapping", js.undefined)
    
    @scala.inline
    def setRangeColorMappingVarargs(value: LayersShapeSettingsColorMappingsRangeColorMapping*): Self = this.set("rangeColorMapping", js.Array(value :_*))
    
    @scala.inline
    def setRangeColorMapping(value: js.Array[LayersShapeSettingsColorMappingsRangeColorMapping]): Self = this.set("rangeColorMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeColorMapping: Self = this.set("rangeColorMapping", js.undefined)
  }
}
