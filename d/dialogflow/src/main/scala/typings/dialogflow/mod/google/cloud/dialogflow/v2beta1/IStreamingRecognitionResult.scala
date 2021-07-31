package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.StreamingRecognitionResult.MessageType
import typings.dialogflow.mod.google.protobuf.IDuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StreamingRecognitionResult. */
trait IStreamingRecognitionResult extends StObject {
  
  /** StreamingRecognitionResult confidence */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /** StreamingRecognitionResult isFinal */
  var isFinal: js.UndefOr[Boolean | Null] = js.undefined
  
  /** StreamingRecognitionResult messageType */
  var messageType: js.UndefOr[
    MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.StreamingRecognitionResult.MessageType * / any */ String) | Null
  ] = js.undefined
  
  /** StreamingRecognitionResult speechEndOffset */
  var speechEndOffset: js.UndefOr[IDuration | Null] = js.undefined
  
  /** StreamingRecognitionResult speechWordInfo */
  var speechWordInfo: js.UndefOr[js.Array[ISpeechWordInfo] | Null] = js.undefined
  
  /** StreamingRecognitionResult stability */
  var stability: js.UndefOr[Double | Null] = js.undefined
  
  /** StreamingRecognitionResult transcript */
  var transcript: js.UndefOr[String | Null] = js.undefined
}
object IStreamingRecognitionResult {
  
  @scala.inline
  def apply(): IStreamingRecognitionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreamingRecognitionResult]
  }
  
  @scala.inline
  implicit class IStreamingRecognitionResultMutableBuilder[Self <: IStreamingRecognitionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setIsFinal(value: Boolean): Self = StObject.set(x, "isFinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFinalNull: Self = StObject.set(x, "isFinal", null)
    
    @scala.inline
    def setIsFinalUndefined: Self = StObject.set(x, "isFinal", js.undefined)
    
    @scala.inline
    def setMessageType(
      value: MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.StreamingRecognitionResult.MessageType * / any */ String)
    ): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTypeNull: Self = StObject.set(x, "messageType", null)
    
    @scala.inline
    def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    @scala.inline
    def setSpeechEndOffset(value: IDuration): Self = StObject.set(x, "speechEndOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechEndOffsetNull: Self = StObject.set(x, "speechEndOffset", null)
    
    @scala.inline
    def setSpeechEndOffsetUndefined: Self = StObject.set(x, "speechEndOffset", js.undefined)
    
    @scala.inline
    def setSpeechWordInfo(value: js.Array[ISpeechWordInfo]): Self = StObject.set(x, "speechWordInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechWordInfoNull: Self = StObject.set(x, "speechWordInfo", null)
    
    @scala.inline
    def setSpeechWordInfoUndefined: Self = StObject.set(x, "speechWordInfo", js.undefined)
    
    @scala.inline
    def setSpeechWordInfoVarargs(value: ISpeechWordInfo*): Self = StObject.set(x, "speechWordInfo", js.Array(value :_*))
    
    @scala.inline
    def setStability(value: Double): Self = StObject.set(x, "stability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStabilityNull: Self = StObject.set(x, "stability", null)
    
    @scala.inline
    def setStabilityUndefined: Self = StObject.set(x, "stability", js.undefined)
    
    @scala.inline
    def setTranscript(value: String): Self = StObject.set(x, "transcript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscriptNull: Self = StObject.set(x, "transcript", null)
    
    @scala.inline
    def setTranscriptUndefined: Self = StObject.set(x, "transcript", js.undefined)
  }
}
