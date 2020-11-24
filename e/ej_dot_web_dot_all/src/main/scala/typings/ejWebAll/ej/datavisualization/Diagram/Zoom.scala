package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Zoom extends js.Object {
  
  /** Used to zoom-in or zoom-out the diagram based on the point.
    */
  var focusPoint: js.UndefOr[ConnectorsSourcePoint] = js.native
  
  /** Used to zoom-in or zoom-out the diagram.
    */
  var zoomCommand: js.UndefOr[ZoomCommand] = js.native
  
  /** Used to increase the zoom-in or zoom-out based on the zoom factor value.
    */
  var zoomFactor: js.UndefOr[Double] = js.native
}
object Zoom {
  
  @scala.inline
  def apply(): Zoom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Zoom]
  }
  
  @scala.inline
  implicit class ZoomOps[Self <: Zoom] (val x: Self) extends AnyVal {
    
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
    def setFocusPoint(value: ConnectorsSourcePoint): Self = this.set("focusPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusPoint: Self = this.set("focusPoint", js.undefined)
    
    @scala.inline
    def setZoomCommand(value: ZoomCommand): Self = this.set("zoomCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomCommand: Self = this.set("zoomCommand", js.undefined)
    
    @scala.inline
    def setZoomFactor(value: Double): Self = this.set("zoomFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomFactor: Self = this.set("zoomFactor", js.undefined)
  }
}
