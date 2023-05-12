package typings.esbuildRegister

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Unregister extends StObject {
    
    def unregister(): Unit
  }
  object Unregister {
    
    inline def apply(unregister: () => Unit): Unregister = {
      val __obj = js.Dynamic.literal(unregister = js.Any.fromFunction0(unregister))
      __obj.asInstanceOf[Unregister]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Unregister] (val x: Self) extends AnyVal {
      
      inline def setUnregister(value: () => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction0(value))
    }
  }
}
