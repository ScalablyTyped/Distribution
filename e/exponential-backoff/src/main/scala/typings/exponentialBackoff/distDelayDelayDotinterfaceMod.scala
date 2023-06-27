package typings.exponentialBackoff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDelayDelayDotinterfaceMod {
  
  trait IDelay extends StObject {
    
    @JSName("apply")
    def apply(): js.Promise[Any]
    
    def setAttemptNumber(attempt: Double): Unit
  }
  object IDelay {
    
    inline def apply(apply: () => js.Promise[Any], setAttemptNumber: Double => Unit): IDelay = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction0(apply), setAttemptNumber = js.Any.fromFunction1(setAttemptNumber))
      __obj.asInstanceOf[IDelay]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDelay] (val x: Self) extends AnyVal {
      
      inline def setApply(value: () => js.Promise[Any]): Self = StObject.set(x, "apply", js.Any.fromFunction0(value))
      
      inline def setSetAttemptNumber(value: Double => Unit): Self = StObject.set(x, "setAttemptNumber", js.Any.fromFunction1(value))
    }
  }
}
