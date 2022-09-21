package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetPoolInstanceHealth extends StObject {
  
  var healthStatus: js.UndefOr[js.Array[SchemaHealthStatus]] = js.undefined
  
  /**
    * [Output Only] Type of resource. Always compute#targetPoolInstanceHealth when checking the health of an instance.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaTargetPoolInstanceHealth {
  
  inline def apply(): SchemaTargetPoolInstanceHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetPoolInstanceHealth]
  }
  
  extension [Self <: SchemaTargetPoolInstanceHealth](x: Self) {
    
    inline def setHealthStatus(value: js.Array[SchemaHealthStatus]): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
    
    inline def setHealthStatusVarargs(value: SchemaHealthStatus*): Self = StObject.set(x, "healthStatus", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
