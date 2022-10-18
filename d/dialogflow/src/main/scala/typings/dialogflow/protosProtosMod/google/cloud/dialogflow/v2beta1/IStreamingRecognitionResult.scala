package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.StreamingRecognitionResult.MessageType
import typings.dialogflow.protosProtosMod.google.protobuf.IDuration
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
  
  inline def apply(): IStreamingRecognitionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreamingRecognitionResult]
  }
  
  extension [Self <: IStreamingRecognitionResult](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setIsFinal(value: Boolean): Self = StObject.set(x, "isFinal", value.asInstanceOf[js.Any])
    
    inline def setIsFinalNull: Self = StObject.set(x, "isFinal", null)
    
    inline def setIsFinalUndefined: Self = StObject.set(x, "isFinal", js.undefined)
    
    inline def setMessageType(
      value: MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.StreamingRecognitionResult.MessageType * / any */ String)
    ): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeNull: Self = StObject.set(x, "messageType", null)
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    inline def setSpeechEndOffset(value: IDuration): Self = StObject.set(x, "speechEndOffset", value.asInstanceOf[js.Any])
    
    inline def setSpeechEndOffsetNull: Self = StObject.set(x, "speechEndOffset", null)
    
    inline def setSpeechEndOffsetUndefined: Self = StObject.set(x, "speechEndOffset", js.undefined)
    
    inline def setSpeechWordInfo(value: js.Array[ISpeechWordInfo]): Self = StObject.set(x, "speechWordInfo", value.asInstanceOf[js.Any])
    
    inline def setSpeechWordInfoNull: Self = StObject.set(x, "speechWordInfo", null)
    
    inline def setSpeechWordInfoUndefined: Self = StObject.set(x, "speechWordInfo", js.undefined)
    
    inline def setSpeechWordInfoVarargs(value: ISpeechWordInfo*): Self = StObject.set(x, "speechWordInfo", js.Array(value*))
    
    inline def setStability(value: Double): Self = StObject.set(x, "stability", value.asInstanceOf[js.Any])
    
    inline def setStabilityNull: Self = StObject.set(x, "stability", null)
    
    inline def setStabilityUndefined: Self = StObject.set(x, "stability", js.undefined)
    
    inline def setTranscript(value: String): Self = StObject.set(x, "transcript", value.asInstanceOf[js.Any])
    
    inline def setTranscriptNull: Self = StObject.set(x, "transcript", null)
    
    inline def setTranscriptUndefined: Self = StObject.set(x, "transcript", js.undefined)
  }
}
