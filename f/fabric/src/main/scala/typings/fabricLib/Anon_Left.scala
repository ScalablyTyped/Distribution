package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Left extends js.Object {
  var left: scala.Double
  var top: scala.Double
}

object Anon_Left {
  @scala.inline
  def apply(left: scala.Double, top: scala.Double): Anon_Left = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[Anon_Left]
  }
}

