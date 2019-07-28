package typings.expressDashValidator.srcChainContextDashRunnerMod

import typings.expressDashValidator.Anon_SaveContext
import typings.expressDashValidator.srcBaseMod.Request
import typings.expressDashValidator.srcContextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextRunner extends js.Object {
  def run(req: Request): js.Promise[Context] = js.native
  def run(req: Request, options: Anon_SaveContext): js.Promise[Context] = js.native
}

