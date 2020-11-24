package typings.expressValidator

import typings.expressValidator.anon.DryRun
import typings.expressValidator.anon.ResultanycontextReadonlyC
import typings.expressValidator.baseMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-validator/src/chain/context-runner", JSImport.Namespace)
@js.native
object contextRunnerMod extends js.Object {
  
  @js.native
  trait ContextRunner extends js.Object {
    
    def run(req: Request): js.Promise[ResultanycontextReadonlyC] = js.native
    def run(req: Request, options: DryRun): js.Promise[ResultanycontextReadonlyC] = js.native
  }
}
