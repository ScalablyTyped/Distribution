package typings.envDashToDashObject.envDashToDashObjectMod

import typings.envDashToDashObject.envDashToDashObjectStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanMapping extends Mapping {
  var strict: Boolean
  var `type`: boolean
}

object BooleanMapping {
  @scala.inline
  def apply(strict: Boolean, `type`: boolean): BooleanMapping = {
    val __obj = js.Dynamic.literal(strict = strict)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BooleanMapping]
  }
}

