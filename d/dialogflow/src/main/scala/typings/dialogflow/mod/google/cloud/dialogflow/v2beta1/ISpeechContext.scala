package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SpeechContext. */
trait ISpeechContext extends StObject {
  
  /** SpeechContext boost */
  var boost: js.UndefOr[Double | Null] = js.undefined
  
  /** SpeechContext phrases */
  var phrases: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object ISpeechContext {
  
  inline def apply(): ISpeechContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpeechContext]
  }
  
  extension [Self <: ISpeechContext](x: Self) {
    
    inline def setBoost(value: Double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setBoostNull: Self = StObject.set(x, "boost", null)
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def setPhrases(value: js.Array[String]): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
    
    inline def setPhrasesNull: Self = StObject.set(x, "phrases", null)
    
    inline def setPhrasesUndefined: Self = StObject.set(x, "phrases", js.undefined)
    
    inline def setPhrasesVarargs(value: String*): Self = StObject.set(x, "phrases", js.Array(value :_*))
  }
}
