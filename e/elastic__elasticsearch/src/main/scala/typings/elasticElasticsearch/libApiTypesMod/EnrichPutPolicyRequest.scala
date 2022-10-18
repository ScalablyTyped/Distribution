package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrichPutPolicyRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var geo_match: js.UndefOr[EnrichPolicy] = js.undefined
  
  var `match`: js.UndefOr[EnrichPolicy] = js.undefined
  
  var name: Name
  
  var range: js.UndefOr[EnrichPolicy] = js.undefined
}
object EnrichPutPolicyRequest {
  
  inline def apply(name: Name): EnrichPutPolicyRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichPutPolicyRequest]
  }
  
  extension [Self <: EnrichPutPolicyRequest](x: Self) {
    
    inline def setGeo_match(value: EnrichPolicy): Self = StObject.set(x, "geo_match", value.asInstanceOf[js.Any])
    
    inline def setGeo_matchUndefined: Self = StObject.set(x, "geo_match", js.undefined)
    
    inline def setMatch(value: EnrichPolicy): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRange(value: EnrichPolicy): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
