package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geomatch extends StObject {
  
  var geo_match: js.UndefOr[EnrichPolicy] = js.undefined
  
  var `match`: js.UndefOr[EnrichPolicy] = js.undefined
  
  var range: js.UndefOr[EnrichPolicy] = js.undefined
}
object Geomatch {
  
  inline def apply(): Geomatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Geomatch]
  }
  
  extension [Self <: Geomatch](x: Self) {
    
    inline def setGeo_match(value: EnrichPolicy): Self = StObject.set(x, "geo_match", value.asInstanceOf[js.Any])
    
    inline def setGeo_matchUndefined: Self = StObject.set(x, "geo_match", js.undefined)
    
    inline def setMatch(value: EnrichPolicy): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setRange(value: EnrichPolicy): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
