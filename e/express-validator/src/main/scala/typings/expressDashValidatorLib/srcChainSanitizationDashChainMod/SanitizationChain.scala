package typings
package expressDashValidatorLib.srcChainSanitizationDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SanitizationChain
  extends expressDashValidatorLib.srcChainSanitizersMod.Sanitizers[SanitizationChain]
     with expressDashValidatorLib.srcChainContextDashRunnerMod.ContextRunner {
  var builder: expressDashValidatorLib.srcContextDashBuilderMod.ContextBuilder = js.native
  def apply(
    req: expressDashValidatorLib.srcBaseMod.Request,
    res: js.Any,
    next: js.Function1[/* errors */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
}

