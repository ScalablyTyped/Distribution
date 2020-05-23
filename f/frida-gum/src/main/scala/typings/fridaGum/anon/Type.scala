package typings.fridaGum.anon

import typings.fridaGum.ArmShifter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: ArmShifter
  var value: Double
}

object Type {
  @scala.inline
  def apply(`type`: ArmShifter, value: Double): Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

