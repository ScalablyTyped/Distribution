package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageEqlFeaturesJoin extends StObject {
  
  var join_queries_five_or_more: uint
  
  var join_queries_four: uint
  
  var join_queries_three: uint
  
  var join_queries_two: uint
  
  var join_until: uint
}
object XpackUsageEqlFeaturesJoin {
  
  inline def apply(
    join_queries_five_or_more: uint,
    join_queries_four: uint,
    join_queries_three: uint,
    join_queries_two: uint,
    join_until: uint
  ): XpackUsageEqlFeaturesJoin = {
    val __obj = js.Dynamic.literal(join_queries_five_or_more = join_queries_five_or_more.asInstanceOf[js.Any], join_queries_four = join_queries_four.asInstanceOf[js.Any], join_queries_three = join_queries_three.asInstanceOf[js.Any], join_queries_two = join_queries_two.asInstanceOf[js.Any], join_until = join_until.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageEqlFeaturesJoin]
  }
  
  extension [Self <: XpackUsageEqlFeaturesJoin](x: Self) {
    
    inline def setJoin_queries_five_or_more(value: uint): Self = StObject.set(x, "join_queries_five_or_more", value.asInstanceOf[js.Any])
    
    inline def setJoin_queries_four(value: uint): Self = StObject.set(x, "join_queries_four", value.asInstanceOf[js.Any])
    
    inline def setJoin_queries_three(value: uint): Self = StObject.set(x, "join_queries_three", value.asInstanceOf[js.Any])
    
    inline def setJoin_queries_two(value: uint): Self = StObject.set(x, "join_queries_two", value.asInstanceOf[js.Any])
    
    inline def setJoin_until(value: uint): Self = StObject.set(x, "join_until", value.asInstanceOf[js.Any])
  }
}
