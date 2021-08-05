package typings.ganacheCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Log extends StObject {
    
    def log(msg: String): Unit
  }
  object Log {
    
    inline def apply(log: String => Unit): Log = {
      val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
      __obj.asInstanceOf[Log]
    }
    
    extension [Self <: Log](x: Self) {
      
      inline def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    }
  }
}
