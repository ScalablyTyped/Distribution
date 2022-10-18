package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrichConfiguration extends StObject {
  
  var geo_match: js.UndefOr[EnrichPolicy] = js.undefined
  
  var `match`: EnrichPolicy
  
  var range: EnrichPolicy
}
object EnrichConfiguration {
  
  inline def apply(`match`: EnrichPolicy, range: EnrichPolicy): EnrichConfiguration = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichConfiguration]
  }
  
  extension [Self <: EnrichConfiguration](x: Self) {
    
    inline def setGeo_match(value: EnrichPolicy): Self = StObject.set(x, "geo_match", value.asInstanceOf[js.Any])
    
    inline def setGeo_matchUndefined: Self = StObject.set(x, "geo_match", js.undefined)
    
    inline def setMatch(value: EnrichPolicy): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setRange(value: EnrichPolicy): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
