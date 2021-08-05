package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SentimentAnalysisRequestConfig. */
trait ISentimentAnalysisRequestConfig extends StObject {
  
  /** SentimentAnalysisRequestConfig analyzeQueryTextSentiment */
  var analyzeQueryTextSentiment: js.UndefOr[Boolean | Null] = js.undefined
}
object ISentimentAnalysisRequestConfig {
  
  inline def apply(): ISentimentAnalysisRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISentimentAnalysisRequestConfig]
  }
  
  extension [Self <: ISentimentAnalysisRequestConfig](x: Self) {
    
    inline def setAnalyzeQueryTextSentiment(value: Boolean): Self = StObject.set(x, "analyzeQueryTextSentiment", value.asInstanceOf[js.Any])
    
    inline def setAnalyzeQueryTextSentimentNull: Self = StObject.set(x, "analyzeQueryTextSentiment", null)
    
    inline def setAnalyzeQueryTextSentimentUndefined: Self = StObject.set(x, "analyzeQueryTextSentiment", js.undefined)
  }
}
