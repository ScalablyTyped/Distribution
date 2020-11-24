package typings.ejWebAll.ej.datavisualization.DigitalGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsSegmentSettings extends js.Object {
  
  /** Set the color for the text segments.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Set the gradient for the text segments.
    * @Default {null}
    */
  var gradient: js.UndefOr[js.Any] = js.native
  
  /** Set the length for the text segments.
    * @Default {2}
    */
  var length: js.UndefOr[Double] = js.native
  
  /** Set the opacity for the text segments.
    * @Default {0}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Set the spacing for the text segments.
    * @Default {1}
    */
  var spacing: js.UndefOr[Double] = js.native
  
  /** Set the width for the text segments.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.native
}
object ItemsSegmentSettings {
  
  @scala.inline
  def apply(): ItemsSegmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsSegmentSettings]
  }
  
  @scala.inline
  implicit class ItemsSegmentSettingsOps[Self <: ItemsSegmentSettings] (val x: Self) extends AnyVal {
    
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
    def setGradient(value: js.Any): Self = this.set("gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradient: Self = this.set("gradient", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
