package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AudioEncoding extends StObject
/** AudioEncoding enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.AudioEncoding")
@js.native
object AudioEncoding extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioEncoding with Double] = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_AMR extends AudioEncoding
  /* 4 */ val AUDIO_ENCODING_AMR: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.AudioEncoding.AUDIO_ENCODING_AMR with Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_AMR_WB extends AudioEncoding
  /* 5 */ val AUDIO_ENCODING_AMR_WB: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.AudioEncoding.AUDIO_ENCODING_AMR_WB with Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_FLAC extends AudioEncoding
  /* 2 */ val AUDIO_ENCODING_FLAC: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.AudioEncoding.AUDIO_ENCODING_FLAC with Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_LINEAR_16 extends AudioEncoding
  /* 1 */ val AUDIO_ENCODING_LINEAR_16: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.AudioEncoding.AUDIO_ENCODING_LINEAR_16 with Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_MULAW extends AudioEncoding
  /* 3 */ val AUDIO_ENCODING_MULAW: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.AudioEncoding.AUDIO_ENCODING_MULAW with Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_OGG_OPUS extends AudioEncoding
  /* 6 */ val AUDIO_ENCODING_OGG_OPUS: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.AudioEncoding.AUDIO_ENCODING_OGG_OPUS with Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE extends AudioEncoding
  /* 7 */ val AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.AudioEncoding.AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE with Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_UNSPECIFIED extends AudioEncoding
  /* 0 */ val AUDIO_ENCODING_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.AudioEncoding.AUDIO_ENCODING_UNSPECIFIED with Double = js.native
}
