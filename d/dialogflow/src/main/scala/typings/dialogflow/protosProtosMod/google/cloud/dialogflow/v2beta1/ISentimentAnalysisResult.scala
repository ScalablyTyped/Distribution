package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SentimentAnalysisResult. */
trait ISentimentAnalysisResult extends StObject {
  
  /** SentimentAnalysisResult queryTextSentiment */
  var queryTextSentiment: js.UndefOr[ISentiment | Null] = js.undefined
}
object ISentimentAnalysisResult {
  
  inline def apply(): ISentimentAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISentimentAnalysisResult]
  }
  
  extension [Self <: ISentimentAnalysisResult](x: Self) {
    
    inline def setQueryTextSentiment(value: ISentiment): Self = StObject.set(x, "queryTextSentiment", value.asInstanceOf[js.Any])
    
    inline def setQueryTextSentimentNull: Self = StObject.set(x, "queryTextSentiment", null)
    
    inline def setQueryTextSentimentUndefined: Self = StObject.set(x, "queryTextSentiment", js.undefined)
  }
}
