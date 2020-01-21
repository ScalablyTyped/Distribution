package typings.figma.mod._Global_

import typings.figma.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportAPI extends js.Object {
  var center: AnonX
  var zoom: Double
  def scrollAndZoomIntoView(nodes: js.Array[BaseNode]): Unit
}

object ViewportAPI {
  @scala.inline
  def apply(center: AnonX, scrollAndZoomIntoView: js.Array[BaseNode] => Unit, zoom: Double): ViewportAPI = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], scrollAndZoomIntoView = js.Any.fromFunction1(scrollAndZoomIntoView), zoom = zoom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViewportAPI]
  }
}

