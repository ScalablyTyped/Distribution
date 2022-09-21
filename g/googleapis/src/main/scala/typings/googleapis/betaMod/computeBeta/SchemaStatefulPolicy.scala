package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStatefulPolicy extends StObject {
  
  var preservedState: js.UndefOr[SchemaStatefulPolicyPreservedState] = js.undefined
}
object SchemaStatefulPolicy {
  
  inline def apply(): SchemaStatefulPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatefulPolicy]
  }
  
  extension [Self <: SchemaStatefulPolicy](x: Self) {
    
    inline def setPreservedState(value: SchemaStatefulPolicyPreservedState): Self = StObject.set(x, "preservedState", value.asInstanceOf[js.Any])
    
    inline def setPreservedStateUndefined: Self = StObject.set(x, "preservedState", js.undefined)
  }
}
