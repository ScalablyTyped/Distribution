package typings.expressValidator

import typings.expressValidator.anon.DryRun
import typings.expressValidator.anon.ResultanycontextReadonlyC
import typings.expressValidator.baseMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextRunnerMod {
  
  @js.native
  trait ContextRunner extends StObject {
    
    def run(req: Request): js.Promise[ResultanycontextReadonlyC] = js.native
    def run(req: Request, options: DryRun): js.Promise[ResultanycontextReadonlyC] = js.native
  }
}
