package typings.expressValidator

import typings.expressValidator.baseMod.Meta
import typings.expressValidator.contextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextItemMod {
  
  trait ContextItem extends StObject {
    
    def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit]
  }
  object ContextItem {
    
    @scala.inline
    def apply(run: (Context, js.Any, Meta) => js.Promise[Unit]): ContextItem = {
      val __obj = js.Dynamic.literal(run = js.Any.fromFunction3(run))
      __obj.asInstanceOf[ContextItem]
    }
    
    @scala.inline
    implicit class ContextItemMutableBuilder[Self <: ContextItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRun(value: (Context, js.Any, Meta) => js.Promise[Unit]): Self = StObject.set(x, "run", js.Any.fromFunction3(value))
    }
  }
}
