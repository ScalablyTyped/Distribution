package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetCustomerSessionStatsResponse extends StObject {
  
  var stats: js.UndefOr[js.Array[SchemaCustomerSessionStats]] = js.undefined
}
object SchemaGetCustomerSessionStatsResponse {
  
  inline def apply(): SchemaGetCustomerSessionStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetCustomerSessionStatsResponse]
  }
  
  extension [Self <: SchemaGetCustomerSessionStatsResponse](x: Self) {
    
    inline def setStats(value: js.Array[SchemaCustomerSessionStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatsVarargs(value: SchemaCustomerSessionStats*): Self = StObject.set(x, "stats", js.Array(value*))
  }
}
