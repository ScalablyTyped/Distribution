package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectRemoteLocationConstraintsSubnetLengthRange extends StObject {
  
  var max: js.UndefOr[Double | Null] = js.undefined
  
  var min: js.UndefOr[Double | Null] = js.undefined
}
object SchemaInterconnectRemoteLocationConstraintsSubnetLengthRange {
  
  inline def apply(): SchemaInterconnectRemoteLocationConstraintsSubnetLengthRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectRemoteLocationConstraintsSubnetLengthRange]
  }
  
  extension [Self <: SchemaInterconnectRemoteLocationConstraintsSubnetLengthRange](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxNull: Self = StObject.set(x, "max", null)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinNull: Self = StObject.set(x, "min", null)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
