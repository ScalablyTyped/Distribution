package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.captivePortal.UndefinedState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  /** The current captive portal state. */
  var state: UndefinedState
}

object State {
  @scala.inline
  def apply(state: UndefinedState): State = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

