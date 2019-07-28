package typings.expressDashValidator.srcChainMod

import typings.expressDashValidator.srcContextDashBuilderMod.ContextBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain", "ValidatorsImpl")
@js.native
class ValidatorsImpl[Chain] protected ()
  extends typings.expressDashValidator.srcChainValidatorsDashImplMod.ValidatorsImpl[Chain] {
  def this(builder: ContextBuilder, chain: Chain) = this()
}

