package typings.figma.figmaMod._Global_

import typings.figma.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportAPI extends js.Object {
  var center: Anon_X
  var zoom: Double
  def scrollAndZoomIntoView(nodes: js.Array[BaseNode]): Unit
}

object ViewportAPI {
  @scala.inline
  def apply(center: Anon_X, scrollAndZoomIntoView: js.Array[BaseNode] => Unit, zoom: Double): ViewportAPI = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], scrollAndZoomIntoView = js.Any.fromFunction1(scrollAndZoomIntoView), zoom = zoom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViewportAPI]
  }
}

