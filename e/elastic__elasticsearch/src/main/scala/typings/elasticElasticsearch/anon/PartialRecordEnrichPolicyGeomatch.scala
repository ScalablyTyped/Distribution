package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<@elastic/elasticsearch.@elastic/elasticsearch/lib/api/typesWithBodyKey.EnrichPolicyType, @elastic/elasticsearch.@elastic/elasticsearch/lib/api/typesWithBodyKey.EnrichPolicy>> */
trait PartialRecordEnrichPolicyGeomatch extends StObject {
  
  var geo_match: js.UndefOr[EnrichPolicy] = js.undefined
  
  var `match`: js.UndefOr[EnrichPolicy] = js.undefined
  
  var range: js.UndefOr[EnrichPolicy] = js.undefined
}
object PartialRecordEnrichPolicyGeomatch {
  
  inline def apply(): PartialRecordEnrichPolicyGeomatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordEnrichPolicyGeomatch]
  }
  
  extension [Self <: PartialRecordEnrichPolicyGeomatch](x: Self) {
    
    inline def setGeo_match(value: EnrichPolicy): Self = StObject.set(x, "geo_match", value.asInstanceOf[js.Any])
    
    inline def setGeo_matchUndefined: Self = StObject.set(x, "geo_match", js.undefined)
    
    inline def setMatch(value: EnrichPolicy): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setRange(value: EnrichPolicy): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
