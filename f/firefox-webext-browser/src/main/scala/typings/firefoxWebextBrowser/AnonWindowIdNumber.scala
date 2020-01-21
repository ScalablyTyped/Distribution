package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWindowIdNumber extends js.Object {
  /** The ID of the window the selected tab changed inside of. */
  var windowId: Double
}

object AnonWindowIdNumber {
  @scala.inline
  def apply(windowId: Double): AnonWindowIdNumber = {
    val __obj = js.Dynamic.literal(windowId = windowId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWindowIdNumber]
  }
}

