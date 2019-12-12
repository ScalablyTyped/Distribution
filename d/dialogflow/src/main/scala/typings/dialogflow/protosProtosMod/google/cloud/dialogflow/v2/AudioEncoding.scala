package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.TopLevel
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_AMR
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_AMR_WB
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_FLAC
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_LINEAR_16
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_MULAW
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_OGG_OPUS
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_UNSPECIFIED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioEncoding extends js.Object

/** AudioEncoding enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.AudioEncoding")
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioEncoding with Double] = js.native
  /* 4 */ @js.native
  object AUDIO_ENCODING_AMR extends TopLevel[AUDIO_ENCODING_AMR with Double]
  
  /* 5 */ @js.native
  object AUDIO_ENCODING_AMR_WB extends TopLevel[AUDIO_ENCODING_AMR_WB with Double]
  
  /* 2 */ @js.native
  object AUDIO_ENCODING_FLAC extends TopLevel[AUDIO_ENCODING_FLAC with Double]
  
  /* 1 */ @js.native
  object AUDIO_ENCODING_LINEAR_16 extends TopLevel[AUDIO_ENCODING_LINEAR_16 with Double]
  
  /* 3 */ @js.native
  object AUDIO_ENCODING_MULAW extends TopLevel[AUDIO_ENCODING_MULAW with Double]
  
  /* 6 */ @js.native
  object AUDIO_ENCODING_OGG_OPUS extends TopLevel[AUDIO_ENCODING_OGG_OPUS with Double]
  
  /* 7 */ @js.native
  object AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE extends TopLevel[AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE with Double]
  
  /* 0 */ @js.native
  object AUDIO_ENCODING_UNSPECIFIED extends TopLevel[AUDIO_ENCODING_UNSPECIFIED with Double]
  
}

