package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportAPI extends js.Object {
  val bounds: Rect
  var center: Vector
  var zoom: Double
  def scrollAndZoomIntoView(nodes: js.Array[BaseNode]): Unit
}

object ViewportAPI {
  @scala.inline
  def apply(bounds: Rect, center: Vector, scrollAndZoomIntoView: js.Array[BaseNode] => Unit, zoom: Double): ViewportAPI = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], scrollAndZoomIntoView = js.Any.fromFunction1(scrollAndZoomIntoView), zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportAPI]
  }
}

