package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetSearchApplicationSessionStatsResponse extends StObject {
  
  var stats: js.UndefOr[js.Array[SchemaSearchApplicationSessionStats]] = js.undefined
}
object SchemaGetSearchApplicationSessionStatsResponse {
  
  inline def apply(): SchemaGetSearchApplicationSessionStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetSearchApplicationSessionStatsResponse]
  }
  
  extension [Self <: SchemaGetSearchApplicationSessionStatsResponse](x: Self) {
    
    inline def setStats(value: js.Array[SchemaSearchApplicationSessionStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatsVarargs(value: SchemaSearchApplicationSessionStats*): Self = StObject.set(x, "stats", js.Array(value*))
  }
}
