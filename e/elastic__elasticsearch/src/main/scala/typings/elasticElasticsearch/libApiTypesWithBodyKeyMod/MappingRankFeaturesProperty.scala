package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.rank_features
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingRankFeaturesProperty
  extends StObject
     with MappingPropertyBase
     with MappingProperty {
  
  var `type`: rank_features
}
object MappingRankFeaturesProperty {
  
  inline def apply(): MappingRankFeaturesProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("rank_features")
    __obj.asInstanceOf[MappingRankFeaturesProperty]
  }
  
  extension [Self <: MappingRankFeaturesProperty](x: Self) {
    
    inline def setType(value: rank_features): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
