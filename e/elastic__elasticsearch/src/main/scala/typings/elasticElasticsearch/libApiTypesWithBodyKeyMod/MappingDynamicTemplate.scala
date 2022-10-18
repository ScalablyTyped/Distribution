package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingDynamicTemplate extends StObject {
  
  var mapping: js.UndefOr[MappingProperty] = js.undefined
  
  var `match`: js.UndefOr[String] = js.undefined
  
  var match_mapping_type: js.UndefOr[String] = js.undefined
  
  var match_pattern: js.UndefOr[MappingMatchType] = js.undefined
  
  var path_match: js.UndefOr[String] = js.undefined
  
  var path_unmatch: js.UndefOr[String] = js.undefined
  
  var unmatch: js.UndefOr[String] = js.undefined
}
object MappingDynamicTemplate {
  
  inline def apply(): MappingDynamicTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingDynamicTemplate]
  }
  
  extension [Self <: MappingDynamicTemplate](x: Self) {
    
    inline def setMapping(value: MappingProperty): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setMatch_mapping_type(value: String): Self = StObject.set(x, "match_mapping_type", value.asInstanceOf[js.Any])
    
    inline def setMatch_mapping_typeUndefined: Self = StObject.set(x, "match_mapping_type", js.undefined)
    
    inline def setMatch_pattern(value: MappingMatchType): Self = StObject.set(x, "match_pattern", value.asInstanceOf[js.Any])
    
    inline def setMatch_patternUndefined: Self = StObject.set(x, "match_pattern", js.undefined)
    
    inline def setPath_match(value: String): Self = StObject.set(x, "path_match", value.asInstanceOf[js.Any])
    
    inline def setPath_matchUndefined: Self = StObject.set(x, "path_match", js.undefined)
    
    inline def setPath_unmatch(value: String): Self = StObject.set(x, "path_unmatch", value.asInstanceOf[js.Any])
    
    inline def setPath_unmatchUndefined: Self = StObject.set(x, "path_unmatch", js.undefined)
    
    inline def setUnmatch(value: String): Self = StObject.set(x, "unmatch", value.asInstanceOf[js.Any])
    
    inline def setUnmatchUndefined: Self = StObject.set(x, "unmatch", js.undefined)
  }
}
