package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesFieldUsageStatsFieldsUsageBodyKeys extends StObject {
  
  var _shards: ShardStatistics
}
object IndicesFieldUsageStatsFieldsUsageBodyKeys {
  
  inline def apply(_shards: ShardStatistics): IndicesFieldUsageStatsFieldsUsageBodyKeys = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesFieldUsageStatsFieldsUsageBodyKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesFieldUsageStatsFieldsUsageBodyKeys] (val x: Self) extends AnyVal {
    
    inline def set_shards(value: ShardStatistics): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
  }
}
