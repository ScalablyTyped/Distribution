package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.lowercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisLowercaseTokenizer
  extends StObject
     with AnalysisTokenizerBase
     with AnalysisTokenizerDefinition {
  
  var `type`: lowercase
}
object AnalysisLowercaseTokenizer {
  
  inline def apply(): AnalysisLowercaseTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("lowercase")
    __obj.asInstanceOf[AnalysisLowercaseTokenizer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisLowercaseTokenizer] (val x: Self) extends AnyVal {
    
    inline def setType(value: lowercase): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
