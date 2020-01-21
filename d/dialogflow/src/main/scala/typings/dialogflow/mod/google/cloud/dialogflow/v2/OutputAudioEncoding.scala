package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OutputAudioEncoding extends js.Object

/** OutputAudioEncoding enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.OutputAudioEncoding")
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OutputAudioEncoding with Double] = js.native
  /* 1 */ @js.native
  object OUTPUT_AUDIO_ENCODING_LINEAR_16 extends TopLevel[OUTPUT_AUDIO_ENCODING_LINEAR_16 with Double]
  
  /* 2 */ @js.native
  object OUTPUT_AUDIO_ENCODING_MP3 extends TopLevel[OUTPUT_AUDIO_ENCODING_MP3 with Double]
  
  /* 3 */ @js.native
  object OUTPUT_AUDIO_ENCODING_OGG_OPUS extends TopLevel[OUTPUT_AUDIO_ENCODING_OGG_OPUS with Double]
  
  /* 0 */ @js.native
  object OUTPUT_AUDIO_ENCODING_UNSPECIFIED extends TopLevel[OUTPUT_AUDIO_ENCODING_UNSPECIFIED with Double]
  
}

