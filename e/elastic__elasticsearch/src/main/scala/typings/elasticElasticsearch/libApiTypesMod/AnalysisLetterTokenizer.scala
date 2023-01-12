package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.letter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisLetterTokenizer
  extends StObject
     with AnalysisTokenizerBase
     with AnalysisTokenizerDefinition {
  
  var `type`: letter
}
object AnalysisLetterTokenizer {
  
  inline def apply(): AnalysisLetterTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("letter")
    __obj.asInstanceOf[AnalysisLetterTokenizer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisLetterTokenizer] (val x: Self) extends AnyVal {
    
    inline def setType(value: letter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
