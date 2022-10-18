package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsTermsPartition extends StObject {
  
  var num_partitions: long
  
  var partition: long
}
object AggregationsTermsPartition {
  
  inline def apply(num_partitions: long, partition: long): AggregationsTermsPartition = {
    val __obj = js.Dynamic.literal(num_partitions = num_partitions.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsTermsPartition]
  }
  
  extension [Self <: AggregationsTermsPartition](x: Self) {
    
    inline def setNum_partitions(value: long): Self = StObject.set(x, "num_partitions", value.asInstanceOf[js.Any])
    
    inline def setPartition(value: long): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
  }
}
