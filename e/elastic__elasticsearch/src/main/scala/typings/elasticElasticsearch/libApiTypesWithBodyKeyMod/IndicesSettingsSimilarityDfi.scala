package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.DFI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSettingsSimilarityDfi extends StObject {
  
  var independence_measure: DFIIndependenceMeasure
  
  var `type`: DFI
}
object IndicesSettingsSimilarityDfi {
  
  inline def apply(independence_measure: DFIIndependenceMeasure): IndicesSettingsSimilarityDfi = {
    val __obj = js.Dynamic.literal(independence_measure = independence_measure.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DFI")
    __obj.asInstanceOf[IndicesSettingsSimilarityDfi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesSettingsSimilarityDfi] (val x: Self) extends AnyVal {
    
    inline def setIndependence_measure(value: DFIIndependenceMeasure): Self = StObject.set(x, "independence_measure", value.asInstanceOf[js.Any])
    
    inline def setType(value: DFI): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
