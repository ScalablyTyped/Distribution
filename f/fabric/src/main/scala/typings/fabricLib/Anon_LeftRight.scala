package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LeftRight extends js.Object {
  var left: scala.Double
  var right: scala.Double
}

object Anon_LeftRight {
  @scala.inline
  def apply(left: scala.Double, right: scala.Double): Anon_LeftRight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[Anon_LeftRight]
  }
}

