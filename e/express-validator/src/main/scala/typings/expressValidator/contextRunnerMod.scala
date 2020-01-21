package typings.expressValidator

import typings.expressValidator.baseMod.Request
import typings.expressValidator.contextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/context-runner", JSImport.Namespace)
@js.native
object contextRunnerMod extends js.Object {
  @js.native
  trait ContextRunner extends js.Object {
    def run(req: Request): js.Promise[Context] = js.native
    def run(req: Request, options: AnonSaveContext): js.Promise[Context] = js.native
  }
  
}

