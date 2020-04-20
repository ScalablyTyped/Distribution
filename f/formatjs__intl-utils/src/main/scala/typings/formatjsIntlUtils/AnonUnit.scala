package typings.formatjsIntlUtils

import typings.formatjsIntlUtils.diffMod.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUnit extends js.Object {
  var unit: Unit
  var value: Double
}

object AnonUnit {
  @scala.inline
  def apply(unit: Unit, value: Double): AnonUnit = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUnit]
  }
}

