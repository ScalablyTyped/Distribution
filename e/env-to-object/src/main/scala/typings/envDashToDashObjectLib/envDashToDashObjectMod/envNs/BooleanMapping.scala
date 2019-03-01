package typings
package envDashToDashObjectLib.envDashToDashObjectMod.envNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanMapping extends Mapping {
  var strict: scala.Boolean
  var `type`: envDashToDashObjectLib.envDashToDashObjectLibStrings.boolean
}

object BooleanMapping {
  @scala.inline
  def apply(strict: scala.Boolean, `type`: envDashToDashObjectLib.envDashToDashObjectLibStrings.boolean): BooleanMapping = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[BooleanMapping]
  }
}

