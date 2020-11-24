package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewportAPI extends js.Object {
  
  val bounds: Rect = js.native
  
  var center: Vector = js.native
  
  def scrollAndZoomIntoView(nodes: js.Array[BaseNode]): Unit = js.native
  
  var zoom: Double = js.native
}
object ViewportAPI {
  
  @scala.inline
  def apply(bounds: Rect, center: Vector, scrollAndZoomIntoView: js.Array[BaseNode] => Unit, zoom: Double): ViewportAPI = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], scrollAndZoomIntoView = js.Any.fromFunction1(scrollAndZoomIntoView), zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportAPI]
  }
  
  @scala.inline
  implicit class ViewportAPIOps[Self <: ViewportAPI] (val x: Self) extends AnyVal {
    
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
    def setBounds(value: Rect): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: Vector): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollAndZoomIntoView(value: js.Array[BaseNode] => Unit): Self = this.set("scrollAndZoomIntoView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
  }
}
