package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayersBubbleSettingsColorMappingsRangeColorMapping extends js.Object {
  
  /** Color of the bubble layer.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Start range colorMappings in the bubble layer.
    * @Default {null}
    */
  var from: js.UndefOr[Double] = js.native
  
  /** GradientColors in the bubble layer of map.
    */
  var gradientColors: js.UndefOr[js.Array[_]] = js.native
  
  /** End range colorMappings in the bubble layer.
    * @Default {null}
    */
  var to: js.UndefOr[Double] = js.native
}
object LayersBubbleSettingsColorMappingsRangeColorMapping {
  
  @scala.inline
  def apply(): LayersBubbleSettingsColorMappingsRangeColorMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersBubbleSettingsColorMappingsRangeColorMapping]
  }
  
  @scala.inline
  implicit class LayersBubbleSettingsColorMappingsRangeColorMappingOps[Self <: LayersBubbleSettingsColorMappingsRangeColorMapping] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setGradientColorsVarargs(value: js.Any*): Self = this.set("gradientColors", js.Array(value :_*))
    
    @scala.inline
    def setGradientColors(value: js.Array[_]): Self = this.set("gradientColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientColors: Self = this.set("gradientColors", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
