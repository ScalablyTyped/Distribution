package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromIndex extends js.Object {
  var fromIndex: Double
  var toIndex: Double
  var windowId: Double
}

object AnonFromIndex {
  @scala.inline
  def apply(fromIndex: Double, toIndex: Double, windowId: Double): AnonFromIndex = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFromIndex]
  }
}

