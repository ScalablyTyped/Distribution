package typings.expressValidator

import typings.expressValidator.contextItemMod.ContextItem
import typings.expressValidator.contextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-validator/src/context-items/bail", JSImport.Namespace)
@js.native
object bailMod extends js.Object {
  
  @js.native
  class Bail () extends ContextItem {
    
    def run(context: Context): js.Promise[Unit] = js.native
  }
}
