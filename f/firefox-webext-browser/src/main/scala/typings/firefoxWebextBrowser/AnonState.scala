package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.captivePortal.UndefinedState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonState extends js.Object {
  /** The current captive portal state. */
  var state: UndefinedState
}

object AnonState {
  @scala.inline
  def apply(state: UndefinedState): AnonState = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonState]
  }
}

