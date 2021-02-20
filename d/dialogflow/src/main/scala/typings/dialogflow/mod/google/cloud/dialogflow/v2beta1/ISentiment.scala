package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Sentiment. */
@js.native
trait ISentiment extends StObject {
  
  /** Sentiment magnitude */
  var magnitude: js.UndefOr[Double | Null] = js.native
  
  /** Sentiment score */
  var score: js.UndefOr[Double | Null] = js.native
}
object ISentiment {
  
  @scala.inline
  def apply(): ISentiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISentiment]
  }
  
  @scala.inline
  implicit class ISentimentMutableBuilder[Self <: ISentiment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagnitudeNull: Self = StObject.set(x, "magnitude", null)
    
    @scala.inline
    def setMagnitudeUndefined: Self = StObject.set(x, "magnitude", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreNull: Self = StObject.set(x, "score", null)
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
