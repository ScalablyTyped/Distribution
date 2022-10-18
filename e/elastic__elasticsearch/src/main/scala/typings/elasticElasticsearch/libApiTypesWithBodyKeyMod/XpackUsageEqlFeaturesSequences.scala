package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageEqlFeaturesSequences extends StObject {
  
  var sequence_maxspan: uint
  
  var sequence_queries_five_or_more: uint
  
  var sequence_queries_four: uint
  
  var sequence_queries_three: uint
  
  var sequence_queries_two: uint
  
  var sequence_until: uint
}
object XpackUsageEqlFeaturesSequences {
  
  inline def apply(
    sequence_maxspan: uint,
    sequence_queries_five_or_more: uint,
    sequence_queries_four: uint,
    sequence_queries_three: uint,
    sequence_queries_two: uint,
    sequence_until: uint
  ): XpackUsageEqlFeaturesSequences = {
    val __obj = js.Dynamic.literal(sequence_maxspan = sequence_maxspan.asInstanceOf[js.Any], sequence_queries_five_or_more = sequence_queries_five_or_more.asInstanceOf[js.Any], sequence_queries_four = sequence_queries_four.asInstanceOf[js.Any], sequence_queries_three = sequence_queries_three.asInstanceOf[js.Any], sequence_queries_two = sequence_queries_two.asInstanceOf[js.Any], sequence_until = sequence_until.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageEqlFeaturesSequences]
  }
  
  extension [Self <: XpackUsageEqlFeaturesSequences](x: Self) {
    
    inline def setSequence_maxspan(value: uint): Self = StObject.set(x, "sequence_maxspan", value.asInstanceOf[js.Any])
    
    inline def setSequence_queries_five_or_more(value: uint): Self = StObject.set(x, "sequence_queries_five_or_more", value.asInstanceOf[js.Any])
    
    inline def setSequence_queries_four(value: uint): Self = StObject.set(x, "sequence_queries_four", value.asInstanceOf[js.Any])
    
    inline def setSequence_queries_three(value: uint): Self = StObject.set(x, "sequence_queries_three", value.asInstanceOf[js.Any])
    
    inline def setSequence_queries_two(value: uint): Self = StObject.set(x, "sequence_queries_two", value.asInstanceOf[js.Any])
    
    inline def setSequence_until(value: uint): Self = StObject.set(x, "sequence_until", value.asInstanceOf[js.Any])
  }
}
