package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesFieldUsageStatsShardsStats extends StObject {
  
  var all_fields: IndicesFieldUsageStatsFieldSummary
  
  var fields: Record[Field, IndicesFieldUsageStatsFieldSummary]
}
object IndicesFieldUsageStatsShardsStats {
  
  inline def apply(
    all_fields: IndicesFieldUsageStatsFieldSummary,
    fields: Record[Field, IndicesFieldUsageStatsFieldSummary]
  ): IndicesFieldUsageStatsShardsStats = {
    val __obj = js.Dynamic.literal(all_fields = all_fields.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesFieldUsageStatsShardsStats]
  }
  
  extension [Self <: IndicesFieldUsageStatsShardsStats](x: Self) {
    
    inline def setAll_fields(value: IndicesFieldUsageStatsFieldSummary): Self = StObject.set(x, "all_fields", value.asInstanceOf[js.Any])
    
    inline def setFields(value: Record[Field, IndicesFieldUsageStatsFieldSummary]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
  }
}
