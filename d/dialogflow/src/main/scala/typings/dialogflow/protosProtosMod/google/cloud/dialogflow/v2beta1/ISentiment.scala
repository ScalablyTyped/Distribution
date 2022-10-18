package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Sentiment. */
trait ISentiment extends StObject {
  
  /** Sentiment magnitude */
  var magnitude: js.UndefOr[Double | Null] = js.undefined
  
  /** Sentiment score */
  var score: js.UndefOr[Double | Null] = js.undefined
}
object ISentiment {
  
  inline def apply(): ISentiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISentiment]
  }
  
  extension [Self <: ISentiment](x: Self) {
    
    inline def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
    
    inline def setMagnitudeNull: Self = StObject.set(x, "magnitude", null)
    
    inline def setMagnitudeUndefined: Self = StObject.set(x, "magnitude", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreNull: Self = StObject.set(x, "score", null)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
