package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesStatsShardRetentionLeases extends StObject {
  
  var leases: js.Array[IndicesStatsShardLease]
  
  var primary_term: long
  
  var version: VersionNumber
}
object IndicesStatsShardRetentionLeases {
  
  inline def apply(leases: js.Array[IndicesStatsShardLease], primary_term: long, version: VersionNumber): IndicesStatsShardRetentionLeases = {
    val __obj = js.Dynamic.literal(leases = leases.asInstanceOf[js.Any], primary_term = primary_term.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesStatsShardRetentionLeases]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesStatsShardRetentionLeases] (val x: Self) extends AnyVal {
    
    inline def setLeases(value: js.Array[IndicesStatsShardLease]): Self = StObject.set(x, "leases", value.asInstanceOf[js.Any])
    
    inline def setLeasesVarargs(value: IndicesStatsShardLease*): Self = StObject.set(x, "leases", js.Array(value*))
    
    inline def setPrimary_term(value: long): Self = StObject.set(x, "primary_term", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
