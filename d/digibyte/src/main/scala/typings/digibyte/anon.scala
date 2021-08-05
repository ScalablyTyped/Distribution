package typings.digibyte

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait PrevHash extends StObject {
    
    var prevHash: String
    
    var time: Double
  }
  object PrevHash {
    
    inline def apply(prevHash: String, time: Double): PrevHash = {
      val __obj = js.Dynamic.literal(prevHash = prevHash.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrevHash]
    }
    
    extension [Self <: PrevHash](x: Self) {
      
      inline def setPrevHash(value: String): Self = StObject.set(x, "prevHash", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reverse extends StObject {
    
    def reverse(a: js.Any): js.Any
  }
  object Reverse {
    
    inline def apply(reverse: js.Any => js.Any): Reverse = {
      val __obj = js.Dynamic.literal(reverse = js.Any.fromFunction1(reverse))
      __obj.asInstanceOf[Reverse]
    }
    
    extension [Self <: Reverse](x: Self) {
      
      inline def setReverse(value: js.Any => js.Any): Self = StObject.set(x, "reverse", js.Any.fromFunction1(value))
    }
  }
}
