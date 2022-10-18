package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesStatsShardCommit extends StObject {
  
  var generation: integer
  
  var id: Id
  
  var num_docs: long
  
  var user_data: Record[String, String]
}
object IndicesStatsShardCommit {
  
  inline def apply(generation: integer, id: Id, num_docs: long, user_data: Record[String, String]): IndicesStatsShardCommit = {
    val __obj = js.Dynamic.literal(generation = generation.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], num_docs = num_docs.asInstanceOf[js.Any], user_data = user_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesStatsShardCommit]
  }
  
  extension [Self <: IndicesStatsShardCommit](x: Self) {
    
    inline def setGeneration(value: integer): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNum_docs(value: long): Self = StObject.set(x, "num_docs", value.asInstanceOf[js.Any])
    
    inline def setUser_data(value: Record[String, String]): Self = StObject.set(x, "user_data", value.asInstanceOf[js.Any])
  }
}
