package typings.dialogflow.mod.google.cloud.dialogflow.v2

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
  
  @scala.inline
  def apply(): ISpeechContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpeechContext]
  }
  
  @scala.inline
  implicit class ISpeechContextMutableBuilder[Self <: ISpeechContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoost(value: Double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoostNull: Self = StObject.set(x, "boost", null)
    
    @scala.inline
    def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    @scala.inline
    def setPhrases(value: js.Array[String]): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhrasesNull: Self = StObject.set(x, "phrases", null)
    
    @scala.inline
    def setPhrasesUndefined: Self = StObject.set(x, "phrases", js.undefined)
    
    @scala.inline
    def setPhrasesVarargs(value: String*): Self = StObject.set(x, "phrases", js.Array(value :_*))
  }
}
