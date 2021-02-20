package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewportAPI extends StObject {
  
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
  implicit class ViewportAPIMutableBuilder[Self <: ViewportAPI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: Rect): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: Vector): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollAndZoomIntoView(value: js.Array[BaseNode] => Unit): Self = StObject.set(x, "scrollAndZoomIntoView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
