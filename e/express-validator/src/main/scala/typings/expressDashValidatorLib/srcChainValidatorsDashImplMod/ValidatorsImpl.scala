package typings
package expressDashValidatorLib.srcChainValidatorsDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/validators-impl", "ValidatorsImpl")
@js.native
class ValidatorsImpl[Chain] protected ()
  extends expressDashValidatorLib.srcChainValidatorsMod.Validators[Chain] {
  def this(builder: expressDashValidatorLib.srcContextDashBuilderMod.ContextBuilder, chain: Chain) = this()
  var addItem: js.Any = js.native
  var addStandardValidation: js.Any = js.native
  val builder: js.Any = js.native
  val chain: js.Any = js.native
  var lastValidator: js.Any = js.native
  var negateNext: js.Any = js.native
  def isByteLength(options: expressDashValidatorLib.srcOptionsMod.MinMaxOptions): Chain = js.native
}

