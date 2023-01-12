package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageDataTierPhaseStatistics extends StObject {
  
  var doc_count: long
  
  var index_count: long
  
  var node_count: long
  
  var primary_shard_count: long
  
  var primary_shard_size_avg_bytes: long
  
  var primary_shard_size_mad_bytes: long
  
  var primary_shard_size_median_bytes: long
  
  var primary_size_bytes: long
  
  var total_shard_count: long
  
  var total_size_bytes: long
}
object XpackUsageDataTierPhaseStatistics {
  
  inline def apply(
    doc_count: long,
    index_count: long,
    node_count: long,
    primary_shard_count: long,
    primary_shard_size_avg_bytes: long,
    primary_shard_size_mad_bytes: long,
    primary_shard_size_median_bytes: long,
    primary_size_bytes: long,
    total_shard_count: long,
    total_size_bytes: long
  ): XpackUsageDataTierPhaseStatistics = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], index_count = index_count.asInstanceOf[js.Any], node_count = node_count.asInstanceOf[js.Any], primary_shard_count = primary_shard_count.asInstanceOf[js.Any], primary_shard_size_avg_bytes = primary_shard_size_avg_bytes.asInstanceOf[js.Any], primary_shard_size_mad_bytes = primary_shard_size_mad_bytes.asInstanceOf[js.Any], primary_shard_size_median_bytes = primary_shard_size_median_bytes.asInstanceOf[js.Any], primary_size_bytes = primary_size_bytes.asInstanceOf[js.Any], total_shard_count = total_shard_count.asInstanceOf[js.Any], total_size_bytes = total_size_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageDataTierPhaseStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageDataTierPhaseStatistics] (val x: Self) extends AnyVal {
    
    inline def setDoc_count(value: long): Self = StObject.set(x, "doc_count", value.asInstanceOf[js.Any])
    
    inline def setIndex_count(value: long): Self = StObject.set(x, "index_count", value.asInstanceOf[js.Any])
    
    inline def setNode_count(value: long): Self = StObject.set(x, "node_count", value.asInstanceOf[js.Any])
    
    inline def setPrimary_shard_count(value: long): Self = StObject.set(x, "primary_shard_count", value.asInstanceOf[js.Any])
    
    inline def setPrimary_shard_size_avg_bytes(value: long): Self = StObject.set(x, "primary_shard_size_avg_bytes", value.asInstanceOf[js.Any])
    
    inline def setPrimary_shard_size_mad_bytes(value: long): Self = StObject.set(x, "primary_shard_size_mad_bytes", value.asInstanceOf[js.Any])
    
    inline def setPrimary_shard_size_median_bytes(value: long): Self = StObject.set(x, "primary_shard_size_median_bytes", value.asInstanceOf[js.Any])
    
    inline def setPrimary_size_bytes(value: long): Self = StObject.set(x, "primary_size_bytes", value.asInstanceOf[js.Any])
    
    inline def setTotal_shard_count(value: long): Self = StObject.set(x, "total_shard_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_size_bytes(value: long): Self = StObject.set(x, "total_size_bytes", value.asInstanceOf[js.Any])
  }
}
