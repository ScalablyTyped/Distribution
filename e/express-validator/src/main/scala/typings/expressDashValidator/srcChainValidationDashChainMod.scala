package typings.expressDashValidator

import typings.expressDashValidator.srcBaseMod.Request
import typings.expressDashValidator.srcChainContextDashHandlerMod.ContextHandler
import typings.expressDashValidator.srcChainContextDashRunnerMod.ContextRunner
import typings.expressDashValidator.srcChainSanitizersMod.Sanitizers
import typings.expressDashValidator.srcChainValidatorsMod.Validators
import typings.expressDashValidator.srcContextDashBuilderMod.ContextBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/validation-chain", JSImport.Namespace)
@js.native
object srcChainValidationDashChainMod extends js.Object {
  @js.native
  trait ValidationChain
    extends Validators[ValidationChain]
       with Sanitizers[ValidationChain]
       with ContextHandler[ValidationChain]
       with ContextRunner {
    var builder: ContextBuilder = js.native
    def apply(req: Request, res: js.Any, next: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
  }
  
}

