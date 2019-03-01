package typings
package flotLib.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait offset extends js.Object {
  var left: scala.Double
  var top: scala.Double
}

object offset {
  @scala.inline
  def apply(left: scala.Double, top: scala.Double): offset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[offset]
  }
}

