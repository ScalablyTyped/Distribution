package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.protobuf.IDuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SpeechWordInfo. */
trait ISpeechWordInfo extends StObject {
  
  /** SpeechWordInfo confidence */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /** SpeechWordInfo endOffset */
  var endOffset: js.UndefOr[IDuration | Null] = js.undefined
  
  /** SpeechWordInfo startOffset */
  var startOffset: js.UndefOr[IDuration | Null] = js.undefined
  
  /** SpeechWordInfo word */
  var word: js.UndefOr[String | Null] = js.undefined
}
object ISpeechWordInfo {
  
  @scala.inline
  def apply(): ISpeechWordInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpeechWordInfo]
  }
  
  @scala.inline
  implicit class ISpeechWordInfoMutableBuilder[Self <: ISpeechWordInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setEndOffset(value: IDuration): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOffsetNull: Self = StObject.set(x, "endOffset", null)
    
    @scala.inline
    def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
    
    @scala.inline
    def setStartOffset(value: IDuration): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOffsetNull: Self = StObject.set(x, "startOffset", null)
    
    @scala.inline
    def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
    
    @scala.inline
    def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordNull: Self = StObject.set(x, "word", null)
    
    @scala.inline
    def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
  }
}
