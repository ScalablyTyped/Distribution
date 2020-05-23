package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromIndex extends js.Object {
  var fromIndex: Double
  var toIndex: Double
  var windowId: Double
}

object FromIndex {
  @scala.inline
  def apply(fromIndex: Double, toIndex: Double, windowId: Double): FromIndex = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromIndex]
  }
}

