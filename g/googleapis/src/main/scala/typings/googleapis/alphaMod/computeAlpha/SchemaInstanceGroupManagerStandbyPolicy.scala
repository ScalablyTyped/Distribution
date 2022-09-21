package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagerStandbyPolicy extends StObject {
  
  var initialDelaySec: js.UndefOr[Double | Null] = js.undefined
}
object SchemaInstanceGroupManagerStandbyPolicy {
  
  inline def apply(): SchemaInstanceGroupManagerStandbyPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerStandbyPolicy]
  }
  
  extension [Self <: SchemaInstanceGroupManagerStandbyPolicy](x: Self) {
    
    inline def setInitialDelaySec(value: Double): Self = StObject.set(x, "initialDelaySec", value.asInstanceOf[js.Any])
    
    inline def setInitialDelaySecNull: Self = StObject.set(x, "initialDelaySec", null)
    
    inline def setInitialDelaySecUndefined: Self = StObject.set(x, "initialDelaySec", js.undefined)
  }
}
