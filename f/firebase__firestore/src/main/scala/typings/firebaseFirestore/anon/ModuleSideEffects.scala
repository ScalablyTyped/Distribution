package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleSideEffects extends StObject {
  
  var moduleSideEffects: Boolean
}
object ModuleSideEffects {
  
  inline def apply(moduleSideEffects: Boolean): ModuleSideEffects = {
    val __obj = js.Dynamic.literal(moduleSideEffects = moduleSideEffects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSideEffects]
  }
  
  extension [Self <: ModuleSideEffects](x: Self) {
    
    inline def setModuleSideEffects(value: Boolean): Self = StObject.set(x, "moduleSideEffects", value.asInstanceOf[js.Any])
  }
}
