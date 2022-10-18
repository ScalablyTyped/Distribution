package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OutputAudioEncoding extends StObject
/** OutputAudioEncoding enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioEncoding")
@js.native
object OutputAudioEncoding extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OutputAudioEncoding & Double] = js.native
  
  @js.native
  sealed trait OUTPUT_AUDIO_ENCODING_LINEAR_16
    extends StObject
       with OutputAudioEncoding
  /* 1 */ val OUTPUT_AUDIO_ENCODING_LINEAR_16: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.OutputAudioEncoding.OUTPUT_AUDIO_ENCODING_LINEAR_16 & Double = js.native
  
  @js.native
  sealed trait OUTPUT_AUDIO_ENCODING_MP3
    extends StObject
       with OutputAudioEncoding
  /* 2 */ val OUTPUT_AUDIO_ENCODING_MP3: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.OutputAudioEncoding.OUTPUT_AUDIO_ENCODING_MP3 & Double = js.native
  
  @js.native
  sealed trait OUTPUT_AUDIO_ENCODING_OGG_OPUS
    extends StObject
       with OutputAudioEncoding
  /* 3 */ val OUTPUT_AUDIO_ENCODING_OGG_OPUS: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.OutputAudioEncoding.OUTPUT_AUDIO_ENCODING_OGG_OPUS & Double = js.native
  
  @js.native
  sealed trait OUTPUT_AUDIO_ENCODING_UNSPECIFIED
    extends StObject
       with OutputAudioEncoding
  /* 0 */ val OUTPUT_AUDIO_ENCODING_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.OutputAudioEncoding.OUTPUT_AUDIO_ENCODING_UNSPECIFIED & Double = js.native
}
