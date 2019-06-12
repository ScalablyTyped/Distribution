package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeValue extends js.Object {
  var `type`: Arm64Shifter
  var value: scala.Double
}

object Anon_TypeValue {
  @scala.inline
  def apply(`type`: Arm64Shifter, value: scala.Double): Anon_TypeValue = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_TypeValue]
  }
}

