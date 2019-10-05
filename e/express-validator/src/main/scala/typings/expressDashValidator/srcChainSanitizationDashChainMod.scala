package typings.expressDashValidator

import typings.expressDashValidator.srcBaseMod.Request
import typings.expressDashValidator.srcChainContextDashRunnerMod.ContextRunner
import typings.expressDashValidator.srcChainSanitizationDashChainMod.SanitizationChain
import typings.expressDashValidator.srcChainSanitizersMod.Sanitizers
import typings.expressDashValidator.srcContextDashBuilderMod.ContextBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/sanitization-chain", JSImport.Namespace)
@js.native
object srcChainSanitizationDashChainMod extends js.Object {
  @js.native
  trait SanitizationChain
    extends Sanitizers[SanitizationChain]
       with ContextRunner {
    var builder: ContextBuilder = js.native
    def apply(req: Request, res: js.Any, next: js.Function1[/* errors */ js.UndefOr[js.Any], Unit]): Unit = js.native
  }
  
}

