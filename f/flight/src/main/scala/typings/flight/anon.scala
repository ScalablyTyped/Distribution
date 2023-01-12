package typings.flight

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait LogAll extends StObject {
    
    def logAll(): Unit
    
    def logByAction(action: String): Unit
    
    def logByName(name: String): Unit
    
    def logNone(): Unit
  }
  object LogAll {
    
    inline def apply(logAll: () => Unit, logByAction: String => Unit, logByName: String => Unit, logNone: () => Unit): LogAll = {
      val __obj = js.Dynamic.literal(logAll = js.Any.fromFunction0(logAll), logByAction = js.Any.fromFunction1(logByAction), logByName = js.Any.fromFunction1(logByName), logNone = js.Any.fromFunction0(logNone))
      __obj.asInstanceOf[LogAll]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogAll] (val x: Self) extends AnyVal {
      
      inline def setLogAll(value: () => Unit): Self = StObject.set(x, "logAll", js.Any.fromFunction0(value))
      
      inline def setLogByAction(value: String => Unit): Self = StObject.set(x, "logByAction", js.Any.fromFunction1(value))
      
      inline def setLogByName(value: String => Unit): Self = StObject.set(x, "logByName", js.Any.fromFunction1(value))
      
      inline def setLogNone(value: () => Unit): Self = StObject.set(x, "logNone", js.Any.fromFunction0(value))
    }
  }
}
