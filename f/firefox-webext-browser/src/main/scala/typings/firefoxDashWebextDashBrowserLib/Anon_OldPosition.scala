package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OldPosition extends js.Object {
  var oldPosition: scala.Double
  var oldWindowId: scala.Double
}

object Anon_OldPosition {
  @scala.inline
  def apply(oldPosition: scala.Double, oldWindowId: scala.Double): Anon_OldPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("oldPosition")(oldPosition)
    __obj.updateDynamic("oldWindowId")(oldWindowId)
    __obj.asInstanceOf[Anon_OldPosition]
  }
}

