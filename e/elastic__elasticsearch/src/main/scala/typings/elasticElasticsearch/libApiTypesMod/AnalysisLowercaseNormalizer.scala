package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.lowercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisLowercaseNormalizer
  extends StObject
     with AnalysisNormalizer {
  
  var `type`: lowercase
}
object AnalysisLowercaseNormalizer {
  
  inline def apply(): AnalysisLowercaseNormalizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("lowercase")
    __obj.asInstanceOf[AnalysisLowercaseNormalizer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisLowercaseNormalizer] (val x: Self) extends AnyVal {
    
    inline def setType(value: lowercase): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
