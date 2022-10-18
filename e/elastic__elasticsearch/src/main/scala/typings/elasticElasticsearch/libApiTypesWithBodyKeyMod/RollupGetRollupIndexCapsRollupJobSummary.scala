package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupGetRollupIndexCapsRollupJobSummary extends StObject {
  
  var fields: Record[Field, js.Array[RollupGetRollupIndexCapsRollupJobSummaryField]]
  
  var index_pattern: String
  
  var job_id: Id
  
  var rollup_index: IndexName
}
object RollupGetRollupIndexCapsRollupJobSummary {
  
  inline def apply(
    fields: Record[Field, js.Array[RollupGetRollupIndexCapsRollupJobSummaryField]],
    index_pattern: String,
    job_id: Id,
    rollup_index: IndexName
  ): RollupGetRollupIndexCapsRollupJobSummary = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], index_pattern = index_pattern.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], rollup_index = rollup_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupGetRollupIndexCapsRollupJobSummary]
  }
  
  extension [Self <: RollupGetRollupIndexCapsRollupJobSummary](x: Self) {
    
    inline def setFields(value: Record[Field, js.Array[RollupGetRollupIndexCapsRollupJobSummaryField]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setIndex_pattern(value: String): Self = StObject.set(x, "index_pattern", value.asInstanceOf[js.Any])
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setRollup_index(value: IndexName): Self = StObject.set(x, "rollup_index", value.asInstanceOf[js.Any])
  }
}
