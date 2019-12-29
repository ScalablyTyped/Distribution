package typings.expressDashValidator

import typings.expressDashValidator.expressDashValidatorBooleans.`true`
import typings.expressDashValidator.srcBaseMod.CustomValidator
import typings.expressDashValidator.srcChainValidationDashChainMod.ValidationChain
import typings.expressDashValidator.srcContextMod.Optional
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/context-handler", JSImport.Namespace)
@js.native
object srcChainContextDashHandlerMod extends js.Object {
  @js.native
  trait ContextHandler[Chain] extends js.Object {
    def bail(): Chain = js.native
    def `if`(condition: CustomValidator): Chain = js.native
    def `if`(condition: ValidationChain): Chain = js.native
    def optional(): Chain = js.native
    def optional(options: Partial[Optional]): Chain = js.native
    @JSName("optional")
    def optional_true(options: `true`): Chain = js.native
  }
  
}

