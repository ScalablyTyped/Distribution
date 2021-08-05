package typings.driftless

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CustomClearTimeout extends StObject {
    
    var customClearTimeout: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  }
  object CustomClearTimeout {
    
    inline def apply(): CustomClearTimeout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomClearTimeout]
    }
    
    extension [Self <: CustomClearTimeout](x: Self) {
      
      inline def setCustomClearTimeout(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "customClearTimeout", js.Any.fromFunction1(value))
      
      inline def setCustomClearTimeoutUndefined: Self = StObject.set(x, "customClearTimeout", js.undefined)
    }
  }
}
