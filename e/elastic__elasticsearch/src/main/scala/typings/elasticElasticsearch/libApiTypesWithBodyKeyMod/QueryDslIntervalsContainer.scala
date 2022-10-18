package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslIntervalsContainer extends StObject {
  
  var all_of: js.UndefOr[QueryDslIntervalsAllOf] = js.undefined
  
  var any_of: js.UndefOr[QueryDslIntervalsAnyOf] = js.undefined
  
  var fuzzy: js.UndefOr[QueryDslIntervalsFuzzy] = js.undefined
  
  var `match`: js.UndefOr[QueryDslIntervalsMatch] = js.undefined
  
  var prefix: js.UndefOr[QueryDslIntervalsPrefix] = js.undefined
  
  var wildcard: js.UndefOr[QueryDslIntervalsWildcard] = js.undefined
}
object QueryDslIntervalsContainer {
  
  inline def apply(): QueryDslIntervalsContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslIntervalsContainer]
  }
  
  extension [Self <: QueryDslIntervalsContainer](x: Self) {
    
    inline def setAll_of(value: QueryDslIntervalsAllOf): Self = StObject.set(x, "all_of", value.asInstanceOf[js.Any])
    
    inline def setAll_ofUndefined: Self = StObject.set(x, "all_of", js.undefined)
    
    inline def setAny_of(value: QueryDslIntervalsAnyOf): Self = StObject.set(x, "any_of", value.asInstanceOf[js.Any])
    
    inline def setAny_ofUndefined: Self = StObject.set(x, "any_of", js.undefined)
    
    inline def setFuzzy(value: QueryDslIntervalsFuzzy): Self = StObject.set(x, "fuzzy", value.asInstanceOf[js.Any])
    
    inline def setFuzzyUndefined: Self = StObject.set(x, "fuzzy", js.undefined)
    
    inline def setMatch(value: QueryDslIntervalsMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setPrefix(value: QueryDslIntervalsPrefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setWildcard(value: QueryDslIntervalsWildcard): Self = StObject.set(x, "wildcard", value.asInstanceOf[js.Any])
    
    inline def setWildcardUndefined: Self = StObject.set(x, "wildcard", js.undefined)
  }
}
