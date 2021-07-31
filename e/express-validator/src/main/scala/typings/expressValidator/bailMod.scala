package typings.expressValidator

import typings.expressValidator.baseMod.Meta
import typings.expressValidator.contextItemMod.ContextItem
import typings.expressValidator.contextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bailMod {
  
  @JSImport("express-validator/src/context-items/bail", "Bail")
  @js.native
  class Bail ()
    extends StObject
       with ContextItem {
    
    def run(context: Context): js.Promise[Unit] = js.native
    /* CompleteClass */
    override def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit] = js.native
  }
}
