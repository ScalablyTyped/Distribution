package typings.expressDashValidator.srcChainSanitizationDashChainMod

import typings.expressDashValidator.srcBaseMod.Request
import typings.expressDashValidator.srcChainContextDashRunnerMod.ContextRunner
import typings.expressDashValidator.srcChainSanitizersMod.Sanitizers
import typings.expressDashValidator.srcContextDashBuilderMod.ContextBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SanitizationChain
  extends Sanitizers[SanitizationChain]
     with ContextRunner {
  var builder: ContextBuilder = js.native
  def apply(req: Request, res: js.Any, next: js.Function1[/* errors */ js.UndefOr[js.Any], Unit]): Unit = js.native
}

