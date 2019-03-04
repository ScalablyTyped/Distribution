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
    val __obj = js.Dynamic.literal(strict = strict)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BooleanMapping]
  }
}

