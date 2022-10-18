package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesFieldUsageStatsInvertedIndex extends StObject {
  
  var offsets: uint
  
  var payloads: uint
  
  var positions: uint
  
  var postings: uint
  
  var proximity: uint
  
  var term_frequencies: uint
  
  var terms: uint
}
object IndicesFieldUsageStatsInvertedIndex {
  
  inline def apply(
    offsets: uint,
    payloads: uint,
    positions: uint,
    postings: uint,
    proximity: uint,
    term_frequencies: uint,
    terms: uint
  ): IndicesFieldUsageStatsInvertedIndex = {
    val __obj = js.Dynamic.literal(offsets = offsets.asInstanceOf[js.Any], payloads = payloads.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any], postings = postings.asInstanceOf[js.Any], proximity = proximity.asInstanceOf[js.Any], term_frequencies = term_frequencies.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesFieldUsageStatsInvertedIndex]
  }
  
  extension [Self <: IndicesFieldUsageStatsInvertedIndex](x: Self) {
    
    inline def setOffsets(value: uint): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
    
    inline def setPayloads(value: uint): Self = StObject.set(x, "payloads", value.asInstanceOf[js.Any])
    
    inline def setPositions(value: uint): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPostings(value: uint): Self = StObject.set(x, "postings", value.asInstanceOf[js.Any])
    
    inline def setProximity(value: uint): Self = StObject.set(x, "proximity", value.asInstanceOf[js.Any])
    
    inline def setTerm_frequencies(value: uint): Self = StObject.set(x, "term_frequencies", value.asInstanceOf[js.Any])
    
    inline def setTerms(value: uint): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
  }
}
