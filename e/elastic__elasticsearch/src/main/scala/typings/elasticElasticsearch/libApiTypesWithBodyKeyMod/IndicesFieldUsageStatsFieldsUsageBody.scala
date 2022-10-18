package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesFieldUsageStatsFieldsUsageBody
  extends StObject
     with IndicesFieldUsageStatsFieldsUsageBodyKeys
     with /* property */ StringDictionary[IndicesFieldUsageStatsUsageStatsIndex | ShardStatistics]
object IndicesFieldUsageStatsFieldsUsageBody {
  
  inline def apply(_shards: ShardStatistics): IndicesFieldUsageStatsFieldsUsageBody = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesFieldUsageStatsFieldsUsageBody]
  }
}
