package typings.expressDashValidator

import typings.expressDashValidator.srcBaseMod.Request
import typings.expressDashValidator.srcContextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/context-runner", JSImport.Namespace)
@js.native
object srcChainContextDashRunnerMod extends js.Object {
  @js.native
  trait ContextRunner extends js.Object {
    def run(req: Request): js.Promise[Context] = js.native
    def run(req: Request, options: Anon_SaveContext): js.Promise[Context] = js.native
  }
  
}

