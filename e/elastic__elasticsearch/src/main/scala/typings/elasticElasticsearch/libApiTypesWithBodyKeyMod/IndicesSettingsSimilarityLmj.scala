package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.LMJelinekMercer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSettingsSimilarityLmj extends StObject {
  
  var lambda: double
  
  var `type`: LMJelinekMercer
}
object IndicesSettingsSimilarityLmj {
  
  inline def apply(lambda: double): IndicesSettingsSimilarityLmj = {
    val __obj = js.Dynamic.literal(lambda = lambda.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LMJelinekMercer")
    __obj.asInstanceOf[IndicesSettingsSimilarityLmj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesSettingsSimilarityLmj] (val x: Self) extends AnyVal {
    
    inline def setLambda(value: double): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    inline def setType(value: LMJelinekMercer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
