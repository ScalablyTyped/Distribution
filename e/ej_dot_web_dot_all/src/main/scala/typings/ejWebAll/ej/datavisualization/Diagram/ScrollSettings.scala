package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollSettings extends js.Object {
  
  /** Allows to read the zoom value of diagram
    * @Default {0}
    */
  var currentZoom: js.UndefOr[Double] = js.native
  
  /** Sets the horizontal scroll offset
    * @Default {0}
    */
  var horizontalOffset: js.UndefOr[Double] = js.native
  
  /** Allows to extend the scrollable region that is based on the scroll limit
    * @Default {{left: 0, right: 0, top:0, bottom: 0}}
    */
  var padding: js.UndefOr[js.Any] = js.native
  
  /** Sets the vertical scroll offset
    * @Default {0}
    */
  var verticalOffset: js.UndefOr[Double] = js.native
  
  /** Allows to read the view port height of the diagram
    * @Default {0}
    */
  var viewPortHeight: js.UndefOr[Double] = js.native
  
  /** Allows to read the view port width of the diagram
    * @Default {0}
    */
  var viewPortWidth: js.UndefOr[Double] = js.native
}
object ScrollSettings {
  
  @scala.inline
  def apply(): ScrollSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollSettings]
  }
  
  @scala.inline
  implicit class ScrollSettingsOps[Self <: ScrollSettings] (val x: Self) extends AnyVal {
    
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
    def setCurrentZoom(value: Double): Self = this.set("currentZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentZoom: Self = this.set("currentZoom", js.undefined)
    
    @scala.inline
    def setHorizontalOffset(value: Double): Self = this.set("horizontalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalOffset: Self = this.set("horizontalOffset", js.undefined)
    
    @scala.inline
    def setPadding(value: js.Any): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setVerticalOffset(value: Double): Self = this.set("verticalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalOffset: Self = this.set("verticalOffset", js.undefined)
    
    @scala.inline
    def setViewPortHeight(value: Double): Self = this.set("viewPortHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewPortHeight: Self = this.set("viewPortHeight", js.undefined)
    
    @scala.inline
    def setViewPortWidth(value: Double): Self = this.set("viewPortWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewPortWidth: Self = this.set("viewPortWidth", js.undefined)
  }
}
