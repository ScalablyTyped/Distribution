package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AudioEncoding extends StObject
/** AudioEncoding enum. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.AudioEncoding")
@js.native
object AudioEncoding extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioEncoding & Double] = js.native
  
  @js.native
  sealed trait ALAW
    extends StObject
       with AudioEncoding
  /* 6 */ val ALAW: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioEncoding.ALAW & Double = js.native
  
  @js.native
  sealed trait AUDIO_ENCODING_UNSPECIFIED
    extends StObject
       with AudioEncoding
  /* 0 */ val AUDIO_ENCODING_UNSPECIFIED: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioEncoding.AUDIO_ENCODING_UNSPECIFIED & Double = js.native
  
  @js.native
  sealed trait LINEAR16
    extends StObject
       with AudioEncoding
  /* 1 */ val LINEAR16: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioEncoding.LINEAR16 & Double = js.native
  
  @js.native
  sealed trait MP3
    extends StObject
       with AudioEncoding
  /* 2 */ val MP3: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioEncoding.MP3 & Double = js.native
  
  @js.native
  sealed trait MP3_64_KBPS
    extends StObject
       with AudioEncoding
  /* 4 */ val MP3_64_KBPS: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioEncoding.MP3_64_KBPS & Double = js.native
  
  @js.native
  sealed trait MULAW
    extends StObject
       with AudioEncoding
  /* 5 */ val MULAW: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioEncoding.MULAW & Double = js.native
  
  @js.native
  sealed trait OGG_OPUS
    extends StObject
       with AudioEncoding
  /* 3 */ val OGG_OPUS: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.AudioEncoding.OGG_OPUS & Double = js.native
}
