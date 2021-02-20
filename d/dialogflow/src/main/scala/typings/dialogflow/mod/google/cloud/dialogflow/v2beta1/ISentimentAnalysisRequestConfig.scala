package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SentimentAnalysisRequestConfig. */
@js.native
trait ISentimentAnalysisRequestConfig extends StObject {
  
  /** SentimentAnalysisRequestConfig analyzeQueryTextSentiment */
  var analyzeQueryTextSentiment: js.UndefOr[Boolean | Null] = js.native
}
object ISentimentAnalysisRequestConfig {
  
  @scala.inline
  def apply(): ISentimentAnalysisRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISentimentAnalysisRequestConfig]
  }
  
  @scala.inline
  implicit class ISentimentAnalysisRequestConfigMutableBuilder[Self <: ISentimentAnalysisRequestConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzeQueryTextSentiment(value: Boolean): Self = StObject.set(x, "analyzeQueryTextSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzeQueryTextSentimentNull: Self = StObject.set(x, "analyzeQueryTextSentiment", null)
    
    @scala.inline
    def setAnalyzeQueryTextSentimentUndefined: Self = StObject.set(x, "analyzeQueryTextSentiment", js.undefined)
  }
}
