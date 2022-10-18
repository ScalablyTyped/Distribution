package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAggregationBreakdown extends StObject {
  
  var build_aggregation: long
  
  var build_aggregation_count: long
  
  var build_leaf_collector: long
  
  var build_leaf_collector_count: long
  
  var collect: long
  
  var collect_count: long
  
  var initialize: long
  
  var initialize_count: long
  
  var post_collection: js.UndefOr[long] = js.undefined
  
  var post_collection_count: js.UndefOr[long] = js.undefined
  
  var reduce: long
  
  var reduce_count: long
}
object SearchAggregationBreakdown {
  
  inline def apply(
    build_aggregation: long,
    build_aggregation_count: long,
    build_leaf_collector: long,
    build_leaf_collector_count: long,
    collect: long,
    collect_count: long,
    initialize: long,
    initialize_count: long,
    reduce: long,
    reduce_count: long
  ): SearchAggregationBreakdown = {
    val __obj = js.Dynamic.literal(build_aggregation = build_aggregation.asInstanceOf[js.Any], build_aggregation_count = build_aggregation_count.asInstanceOf[js.Any], build_leaf_collector = build_leaf_collector.asInstanceOf[js.Any], build_leaf_collector_count = build_leaf_collector_count.asInstanceOf[js.Any], collect = collect.asInstanceOf[js.Any], collect_count = collect_count.asInstanceOf[js.Any], initialize = initialize.asInstanceOf[js.Any], initialize_count = initialize_count.asInstanceOf[js.Any], reduce = reduce.asInstanceOf[js.Any], reduce_count = reduce_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAggregationBreakdown]
  }
  
  extension [Self <: SearchAggregationBreakdown](x: Self) {
    
    inline def setBuild_aggregation(value: long): Self = StObject.set(x, "build_aggregation", value.asInstanceOf[js.Any])
    
    inline def setBuild_aggregation_count(value: long): Self = StObject.set(x, "build_aggregation_count", value.asInstanceOf[js.Any])
    
    inline def setBuild_leaf_collector(value: long): Self = StObject.set(x, "build_leaf_collector", value.asInstanceOf[js.Any])
    
    inline def setBuild_leaf_collector_count(value: long): Self = StObject.set(x, "build_leaf_collector_count", value.asInstanceOf[js.Any])
    
    inline def setCollect(value: long): Self = StObject.set(x, "collect", value.asInstanceOf[js.Any])
    
    inline def setCollect_count(value: long): Self = StObject.set(x, "collect_count", value.asInstanceOf[js.Any])
    
    inline def setInitialize(value: long): Self = StObject.set(x, "initialize", value.asInstanceOf[js.Any])
    
    inline def setInitialize_count(value: long): Self = StObject.set(x, "initialize_count", value.asInstanceOf[js.Any])
    
    inline def setPost_collection(value: long): Self = StObject.set(x, "post_collection", value.asInstanceOf[js.Any])
    
    inline def setPost_collectionUndefined: Self = StObject.set(x, "post_collection", js.undefined)
    
    inline def setPost_collection_count(value: long): Self = StObject.set(x, "post_collection_count", value.asInstanceOf[js.Any])
    
    inline def setPost_collection_countUndefined: Self = StObject.set(x, "post_collection_count", js.undefined)
    
    inline def setReduce(value: long): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
    
    inline def setReduce_count(value: long): Self = StObject.set(x, "reduce_count", value.asInstanceOf[js.Any])
  }
}
