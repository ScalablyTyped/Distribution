package typings
package expressDashValidatorLib.srcChainContextDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextHandler[Chain] extends js.Object {
  def `if`(condition: expressDashValidatorLib.srcBaseMod.CustomValidator): Chain = js.native
  def `if`(condition: expressDashValidatorLib.srcChainValidationDashChainMod.ValidationChain): Chain = js.native
  def optional(): Chain = js.native
  def optional(options: stdLib.Partial[expressDashValidatorLib.srcContextMod.Optional]): Chain = js.native
  @JSName("optional")
  def optional_true(options: expressDashValidatorLib.expressDashValidatorLibNumbers.`true`): Chain = js.native
}

