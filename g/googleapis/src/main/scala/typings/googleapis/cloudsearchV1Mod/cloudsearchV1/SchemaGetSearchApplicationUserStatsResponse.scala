package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetSearchApplicationUserStatsResponse extends StObject {
  
  var stats: js.UndefOr[js.Array[SchemaSearchApplicationUserStats]] = js.undefined
}
object SchemaGetSearchApplicationUserStatsResponse {
  
  inline def apply(): SchemaGetSearchApplicationUserStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetSearchApplicationUserStatsResponse]
  }
  
  extension [Self <: SchemaGetSearchApplicationUserStatsResponse](x: Self) {
    
    inline def setStats(value: js.Array[SchemaSearchApplicationUserStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatsVarargs(value: SchemaSearchApplicationUserStats*): Self = StObject.set(x, "stats", js.Array(value*))
  }
}
