package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OutputAudioEncoding extends js.Object

/** OutputAudioEncoding enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.OutputAudioEncoding")
@js.native
object OutputAudioEncoding extends js.Object {
  @js.native
  sealed trait OUTPUT_AUDIO_ENCODING_LINEAR_16 extends OutputAudioEncoding
  
  @js.native
  sealed trait OUTPUT_AUDIO_ENCODING_MP3 extends OutputAudioEncoding
  
  @js.native
  sealed trait OUTPUT_AUDIO_ENCODING_OGG_OPUS extends OutputAudioEncoding
  
  @js.native
  sealed trait OUTPUT_AUDIO_ENCODING_UNSPECIFIED extends OutputAudioEncoding
  
  /* 1 */ val OUTPUT_AUDIO_ENCODING_LINEAR_16: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.OutputAudioEncoding.OUTPUT_AUDIO_ENCODING_LINEAR_16 with Double = js.native
  /* 2 */ val OUTPUT_AUDIO_ENCODING_MP3: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.OutputAudioEncoding.OUTPUT_AUDIO_ENCODING_MP3 with Double = js.native
  /* 3 */ val OUTPUT_AUDIO_ENCODING_OGG_OPUS: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.OutputAudioEncoding.OUTPUT_AUDIO_ENCODING_OGG_OPUS with Double = js.native
  /* 0 */ val OUTPUT_AUDIO_ENCODING_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.OutputAudioEncoding.OUTPUT_AUDIO_ENCODING_UNSPECIFIED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OutputAudioEncoding with Double] = js.native
}

