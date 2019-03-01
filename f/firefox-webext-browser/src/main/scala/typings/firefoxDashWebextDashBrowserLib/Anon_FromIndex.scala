package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromIndex extends js.Object {
  var fromIndex: scala.Double
  var toIndex: scala.Double
  var windowId: scala.Double
}

object Anon_FromIndex {
  @scala.inline
  def apply(fromIndex: scala.Double, toIndex: scala.Double, windowId: scala.Double): Anon_FromIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromIndex")(fromIndex)
    __obj.updateDynamic("toIndex")(toIndex)
    __obj.updateDynamic("windowId")(windowId)
    __obj.asInstanceOf[Anon_FromIndex]
  }
}

