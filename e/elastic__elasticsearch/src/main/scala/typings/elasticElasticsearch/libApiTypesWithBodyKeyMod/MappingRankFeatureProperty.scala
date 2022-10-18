package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.rank_feature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingRankFeatureProperty
  extends StObject
     with MappingPropertyBase
     with MappingProperty {
  
  var positive_score_impact: js.UndefOr[Boolean] = js.undefined
  
  var `type`: rank_feature
}
object MappingRankFeatureProperty {
  
  inline def apply(): MappingRankFeatureProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("rank_feature")
    __obj.asInstanceOf[MappingRankFeatureProperty]
  }
  
  extension [Self <: MappingRankFeatureProperty](x: Self) {
    
    inline def setPositive_score_impact(value: Boolean): Self = StObject.set(x, "positive_score_impact", value.asInstanceOf[js.Any])
    
    inline def setPositive_score_impactUndefined: Self = StObject.set(x, "positive_score_impact", js.undefined)
    
    inline def setType(value: rank_feature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
