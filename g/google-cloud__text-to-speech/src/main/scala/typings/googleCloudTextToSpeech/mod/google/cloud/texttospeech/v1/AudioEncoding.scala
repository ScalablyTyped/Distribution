package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AudioEncoding extends StObject
/** AudioEncoding enum. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.AudioEncoding")
@js.native
object AudioEncoding extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioEncoding with Double] = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_UNSPECIFIED extends AudioEncoding
  /* 0 */ val AUDIO_ENCODING_UNSPECIFIED: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioEncoding.AUDIO_ENCODING_UNSPECIFIED with Double = js.native
  
  @js.native
  sealed trait LINEAR16 extends AudioEncoding
  /* 1 */ val LINEAR16: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioEncoding.LINEAR16 with Double = js.native
  
  @js.native
  sealed trait MP3 extends AudioEncoding
  /* 2 */ val MP3: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioEncoding.MP3 with Double = js.native
  
  @js.native
  sealed trait OGG_OPUS extends AudioEncoding
  /* 3 */ val OGG_OPUS: typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1.AudioEncoding.OGG_OPUS with Double = js.native
}
