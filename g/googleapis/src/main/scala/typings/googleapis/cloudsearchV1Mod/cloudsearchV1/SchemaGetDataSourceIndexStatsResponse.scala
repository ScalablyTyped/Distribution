package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetDataSourceIndexStatsResponse extends StObject {
  
  /**
    * Summary of indexed item counts, one for each day in the requested range.
    */
  var stats: js.UndefOr[js.Array[SchemaDataSourceIndexStats]] = js.undefined
}
object SchemaGetDataSourceIndexStatsResponse {
  
  inline def apply(): SchemaGetDataSourceIndexStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetDataSourceIndexStatsResponse]
  }
  
  extension [Self <: SchemaGetDataSourceIndexStatsResponse](x: Self) {
    
    inline def setStats(value: js.Array[SchemaDataSourceIndexStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatsVarargs(value: SchemaDataSourceIndexStats*): Self = StObject.set(x, "stats", js.Array(value :_*))
  }
}
