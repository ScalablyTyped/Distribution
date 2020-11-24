package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayersBubbleSettingsColorMappings extends js.Object {
  
  /** Specifies the range colorMappings in the bubble layer.
    * @Default {null}
    */
  var rangeColorMapping: js.UndefOr[js.Array[LayersBubbleSettingsColorMappingsRangeColorMapping]] = js.native
}
object LayersBubbleSettingsColorMappings {
  
  @scala.inline
  def apply(): LayersBubbleSettingsColorMappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersBubbleSettingsColorMappings]
  }
  
  @scala.inline
  implicit class LayersBubbleSettingsColorMappingsOps[Self <: LayersBubbleSettingsColorMappings] (val x: Self) extends AnyVal {
    
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
    def setRangeColorMappingVarargs(value: LayersBubbleSettingsColorMappingsRangeColorMapping*): Self = this.set("rangeColorMapping", js.Array(value :_*))
    
    @scala.inline
    def setRangeColorMapping(value: js.Array[LayersBubbleSettingsColorMappingsRangeColorMapping]): Self = this.set("rangeColorMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeColorMapping: Self = this.set("rangeColorMapping", js.undefined)
  }
}
