package typings.envToObject.mod

import typings.envToObject.envToObjectStrings.boolean
import typings.envToObject.envToObjectStrings.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.envToObject.mod.IntegerMapping
  - typings.envToObject.mod.BooleanMapping
  - typings.envToObject.mod.GenericMapping
*/
trait Mapping extends js.Object

object Mapping {
  @scala.inline
  def IntegerMapping(keypath: String, radix: Double, `type`: integer): Mapping = {
    val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any], radix = radix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping]
  }
  @scala.inline
  def BooleanMapping(strict: Boolean, `type`: boolean): Mapping = {
    val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping]
  }
  @scala.inline
  def GenericMapping(keypath: String): Mapping = {
    val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping]
  }
}

