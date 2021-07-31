package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AudioEncoding extends StObject
/** AudioEncoding enum. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.AudioEncoding")
@js.native
object AudioEncoding extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioEncoding & Double] = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_UNSPECIFIED
    extends StObject
       with AudioEncoding
  /* 0 */ val AUDIO_ENCODING_UNSPECIFIED: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioEncoding.AUDIO_ENCODING_UNSPECIFIED & Double = js.native
  
  @js.native
  sealed trait LINEAR16
    extends StObject
       with AudioEncoding
  /* 1 */ val LINEAR16: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioEncoding.LINEAR16 & Double = js.native
  
  @js.native
  sealed trait MP3
    extends StObject
       with AudioEncoding
  /* 2 */ val MP3: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioEncoding.MP3 & Double = js.native
  
  @js.native
  sealed trait OGG_OPUS
    extends StObject
       with AudioEncoding
  /* 3 */ val OGG_OPUS: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioEncoding.OGG_OPUS & Double = js.native
}
