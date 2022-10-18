package typings.expressValidator

import typings.expressValidator.srcBaseMod.Meta
import typings.expressValidator.srcContextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcContextItemsContextItemMod {
  
  trait ContextItem extends StObject {
    
    def run(context: Context, value: Any, meta: Meta): js.Promise[Unit]
  }
  object ContextItem {
    
    inline def apply(run: (Context, Any, Meta) => js.Promise[Unit]): ContextItem = {
      val __obj = js.Dynamic.literal(run = js.Any.fromFunction3(run))
      __obj.asInstanceOf[ContextItem]
    }
    
    extension [Self <: ContextItem](x: Self) {
      
      inline def setRun(value: (Context, Any, Meta) => js.Promise[Unit]): Self = StObject.set(x, "run", js.Any.fromFunction3(value))
    }
  }
}
