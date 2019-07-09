package typings
package expressDashValidatorLib.srcChainValidationDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationChain
  extends expressDashValidatorLib.srcChainValidatorsMod.Validators[ValidationChain]
     with expressDashValidatorLib.srcChainSanitizersMod.Sanitizers[ValidationChain]
     with expressDashValidatorLib.srcChainContextDashHandlerMod.ContextHandler[ValidationChain]
     with expressDashValidatorLib.srcChainContextDashRunnerMod.ContextRunner {
  var builder: expressDashValidatorLib.srcContextDashBuilderMod.ContextBuilder = js.native
  def apply(
    req: expressDashValidatorLib.srcBaseMod.Request,
    res: js.Any,
    next: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
}

