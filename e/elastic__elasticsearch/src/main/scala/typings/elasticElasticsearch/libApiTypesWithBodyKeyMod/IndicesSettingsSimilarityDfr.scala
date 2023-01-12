package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.DFR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSettingsSimilarityDfr extends StObject {
  
  var after_effect: DFRAfterEffect
  
  var basic_model: DFRBasicModel
  
  var normalization: Normalization
  
  var `type`: DFR
}
object IndicesSettingsSimilarityDfr {
  
  inline def apply(after_effect: DFRAfterEffect, basic_model: DFRBasicModel, normalization: Normalization): IndicesSettingsSimilarityDfr = {
    val __obj = js.Dynamic.literal(after_effect = after_effect.asInstanceOf[js.Any], basic_model = basic_model.asInstanceOf[js.Any], normalization = normalization.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DFR")
    __obj.asInstanceOf[IndicesSettingsSimilarityDfr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesSettingsSimilarityDfr] (val x: Self) extends AnyVal {
    
    inline def setAfter_effect(value: DFRAfterEffect): Self = StObject.set(x, "after_effect", value.asInstanceOf[js.Any])
    
    inline def setBasic_model(value: DFRBasicModel): Self = StObject.set(x, "basic_model", value.asInstanceOf[js.Any])
    
    inline def setNormalization(value: Normalization): Self = StObject.set(x, "normalization", value.asInstanceOf[js.Any])
    
    inline def setType(value: DFR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
