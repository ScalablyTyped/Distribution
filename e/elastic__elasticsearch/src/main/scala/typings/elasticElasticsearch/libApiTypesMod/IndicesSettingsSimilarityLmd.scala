package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.LMDirichlet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSettingsSimilarityLmd extends StObject {
  
  var mu: integer
  
  var `type`: LMDirichlet
}
object IndicesSettingsSimilarityLmd {
  
  inline def apply(mu: integer): IndicesSettingsSimilarityLmd = {
    val __obj = js.Dynamic.literal(mu = mu.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LMDirichlet")
    __obj.asInstanceOf[IndicesSettingsSimilarityLmd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesSettingsSimilarityLmd] (val x: Self) extends AnyVal {
    
    inline def setMu(value: integer): Self = StObject.set(x, "mu", value.asInstanceOf[js.Any])
    
    inline def setType(value: LMDirichlet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
