package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Zooming extends js.Object {
  
  /** Enables or disables zooming.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  
  /** Enable or disables the differed zooming. When it is enabled, chart is updated only on mouse up action while zooming and panning.
    * @Default {false}
    */
  var enableDeferredZoom: js.UndefOr[Boolean] = js.native
  
  /** Enables/disables the ability to zoom the chart on moving the mouse wheel.
    * @Default {false}
    */
  var enableMouseWheel: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables pinch zooming.
    * @Default {true}
    */
  var enablePinching: js.UndefOr[Boolean] = js.native
  
  /** Toggles the visibility of the scrollbar, which will be displayed while zooming.
    * @Default {false}
    */
  var enableScrollbar: js.UndefOr[Boolean] = js.native
  
  /** To display user specified buttons in zooming toolbar.
    * @Default {[zoomIn, zoomOut, zoom, pan, reset]}
    */
  var toolbarItems: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies whether to allow zooming the chart vertically or horizontally or in both ways.
    * @Default {'x,y'}
    */
  var `type`: js.UndefOr[String] = js.native
}
object Zooming {
  
  @scala.inline
  def apply(): Zooming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Zooming]
  }
  
  @scala.inline
  implicit class ZoomingOps[Self <: Zooming] (val x: Self) extends AnyVal {
    
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setEnableDeferredZoom(value: Boolean): Self = this.set("enableDeferredZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDeferredZoom: Self = this.set("enableDeferredZoom", js.undefined)
    
    @scala.inline
    def setEnableMouseWheel(value: Boolean): Self = this.set("enableMouseWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMouseWheel: Self = this.set("enableMouseWheel", js.undefined)
    
    @scala.inline
    def setEnablePinching(value: Boolean): Self = this.set("enablePinching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePinching: Self = this.set("enablePinching", js.undefined)
    
    @scala.inline
    def setEnableScrollbar(value: Boolean): Self = this.set("enableScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableScrollbar: Self = this.set("enableScrollbar", js.undefined)
    
    @scala.inline
    def setToolbarItemsVarargs(value: js.Any*): Self = this.set("toolbarItems", js.Array(value :_*))
    
    @scala.inline
    def setToolbarItems(value: js.Array[_]): Self = this.set("toolbarItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarItems: Self = this.set("toolbarItems", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
