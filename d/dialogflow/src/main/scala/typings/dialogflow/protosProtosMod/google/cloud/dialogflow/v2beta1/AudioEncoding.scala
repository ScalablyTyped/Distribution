package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioEncoding extends js.Object

/** AudioEncoding enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.AudioEncoding")
@js.native
object AudioEncoding extends js.Object {
  @js.native
  sealed trait AUDIO_ENCODING_AMR extends AudioEncoding
  
  @js.native
  sealed trait AUDIO_ENCODING_AMR_WB extends AudioEncoding
  
  @js.native
  sealed trait AUDIO_ENCODING_FLAC extends AudioEncoding
  
  @js.native
  sealed trait AUDIO_ENCODING_LINEAR_16 extends AudioEncoding
  
  @js.native
  sealed trait AUDIO_ENCODING_MULAW extends AudioEncoding
  
  @js.native
  sealed trait AUDIO_ENCODING_OGG_OPUS extends AudioEncoding
  
  @js.native
  sealed trait AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE extends AudioEncoding
  
  @js.native
  sealed trait AUDIO_ENCODING_UNSPECIFIED extends AudioEncoding
  
  /* 4 */ val AUDIO_ENCODING_AMR: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.AudioEncoding.AUDIO_ENCODING_AMR with Double = js.native
  /* 5 */ val AUDIO_ENCODING_AMR_WB: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.AudioEncoding.AUDIO_ENCODING_AMR_WB with Double = js.native
  /* 2 */ val AUDIO_ENCODING_FLAC: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.AudioEncoding.AUDIO_ENCODING_FLAC with Double = js.native
  /* 1 */ val AUDIO_ENCODING_LINEAR_16: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.AudioEncoding.AUDIO_ENCODING_LINEAR_16 with Double = js.native
  /* 3 */ val AUDIO_ENCODING_MULAW: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.AudioEncoding.AUDIO_ENCODING_MULAW with Double = js.native
  /* 6 */ val AUDIO_ENCODING_OGG_OPUS: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.AudioEncoding.AUDIO_ENCODING_OGG_OPUS with Double = js.native
  /* 7 */ val AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.AudioEncoding.AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE with Double = js.native
  /* 0 */ val AUDIO_ENCODING_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.AudioEncoding.AUDIO_ENCODING_UNSPECIFIED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioEncoding with Double] = js.native
}

