package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AudioEncoding extends StObject
/** AudioEncoding enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.AudioEncoding")
@js.native
object AudioEncoding extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioEncoding & Double] = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_AMR
    extends StObject
       with AudioEncoding
  /* 4 */ val AUDIO_ENCODING_AMR: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_AMR & Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_AMR_WB
    extends StObject
       with AudioEncoding
  /* 5 */ val AUDIO_ENCODING_AMR_WB: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_AMR_WB & Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_FLAC
    extends StObject
       with AudioEncoding
  /* 2 */ val AUDIO_ENCODING_FLAC: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_FLAC & Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_LINEAR_16
    extends StObject
       with AudioEncoding
  /* 1 */ val AUDIO_ENCODING_LINEAR_16: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_LINEAR_16 & Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_MULAW
    extends StObject
       with AudioEncoding
  /* 3 */ val AUDIO_ENCODING_MULAW: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_MULAW & Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_OGG_OPUS
    extends StObject
       with AudioEncoding
  /* 6 */ val AUDIO_ENCODING_OGG_OPUS: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_OGG_OPUS & Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE
    extends StObject
       with AudioEncoding
  /* 7 */ val AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE & Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_UNSPECIFIED
    extends StObject
       with AudioEncoding
  /* 0 */ val AUDIO_ENCODING_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_UNSPECIFIED & Double = js.native
}
