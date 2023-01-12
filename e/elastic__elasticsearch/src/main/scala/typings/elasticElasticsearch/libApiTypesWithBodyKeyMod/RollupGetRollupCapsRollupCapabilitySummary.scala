package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupGetRollupCapsRollupCapabilitySummary extends StObject {
  
  var fields: Record[Field, Record[String, Any]]
  
  var index_pattern: String
  
  var job_id: String
  
  var rollup_index: String
}
object RollupGetRollupCapsRollupCapabilitySummary {
  
  inline def apply(
    fields: Record[Field, Record[String, Any]],
    index_pattern: String,
    job_id: String,
    rollup_index: String
  ): RollupGetRollupCapsRollupCapabilitySummary = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], index_pattern = index_pattern.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], rollup_index = rollup_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupGetRollupCapsRollupCapabilitySummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RollupGetRollupCapsRollupCapabilitySummary] (val x: Self) extends AnyVal {
    
    inline def setFields(value: Record[Field, Record[String, Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setIndex_pattern(value: String): Self = StObject.set(x, "index_pattern", value.asInstanceOf[js.Any])
    
    inline def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setRollup_index(value: String): Self = StObject.set(x, "rollup_index", value.asInstanceOf[js.Any])
  }
}
