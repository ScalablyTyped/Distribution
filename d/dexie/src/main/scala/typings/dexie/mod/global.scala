package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  trait SymbolConstructor extends StObject {
    
    val observable: js.Symbol
  }
  object SymbolConstructor {
    
    inline def apply(observable: js.Symbol): SymbolConstructor = {
      val __obj = js.Dynamic.literal(observable = observable.asInstanceOf[js.Any])
      __obj.asInstanceOf[SymbolConstructor]
    }
    
    extension [Self <: SymbolConstructor](x: Self) {
      
      inline def setObservable(value: js.Symbol): Self = StObject.set(x, "observable", value.asInstanceOf[js.Any])
    }
  }
}
