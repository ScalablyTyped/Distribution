package typings.envToObject.mod

import typings.envToObject.envToObjectStrings.boolean
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
    val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanMapping]
  }
}

