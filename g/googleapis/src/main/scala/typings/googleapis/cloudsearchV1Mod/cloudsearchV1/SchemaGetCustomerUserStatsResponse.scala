package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetCustomerUserStatsResponse extends StObject {
  
  var stats: js.UndefOr[js.Array[SchemaCustomerUserStats]] = js.undefined
}
object SchemaGetCustomerUserStatsResponse {
  
  inline def apply(): SchemaGetCustomerUserStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetCustomerUserStatsResponse]
  }
  
  extension [Self <: SchemaGetCustomerUserStatsResponse](x: Self) {
    
    inline def setStats(value: js.Array[SchemaCustomerUserStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatsVarargs(value: SchemaCustomerUserStats*): Self = StObject.set(x, "stats", js.Array(value*))
  }
}
