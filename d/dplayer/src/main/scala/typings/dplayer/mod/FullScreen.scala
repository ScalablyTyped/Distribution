package typings.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullScreen extends js.Object {
  def cancel(`type`: FullScreenType): Unit
  def request(`type`: FullScreenType): Unit
}

object FullScreen {
  @scala.inline
  def apply(cancel: FullScreenType => Unit, request: FullScreenType => Unit): FullScreen = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), request = js.Any.fromFunction1(request))
  
    __obj.asInstanceOf[FullScreen]
  }
}

