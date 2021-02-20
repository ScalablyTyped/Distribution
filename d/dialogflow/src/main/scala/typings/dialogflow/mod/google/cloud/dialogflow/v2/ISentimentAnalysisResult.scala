package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SentimentAnalysisResult. */
@js.native
trait ISentimentAnalysisResult extends StObject {
  
  /** SentimentAnalysisResult queryTextSentiment */
  var queryTextSentiment: js.UndefOr[ISentiment | Null] = js.native
}
object ISentimentAnalysisResult {
  
  @scala.inline
  def apply(): ISentimentAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISentimentAnalysisResult]
  }
  
  @scala.inline
  implicit class ISentimentAnalysisResultMutableBuilder[Self <: ISentimentAnalysisResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryTextSentiment(value: ISentiment): Self = StObject.set(x, "queryTextSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryTextSentimentNull: Self = StObject.set(x, "queryTextSentiment", null)
    
    @scala.inline
    def setQueryTextSentimentUndefined: Self = StObject.set(x, "queryTextSentiment", js.undefined)
  }
}
