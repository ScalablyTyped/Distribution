package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SsmlVoiceGender extends StObject
/** SsmlVoiceGender enum. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SsmlVoiceGender")
@js.native
object SsmlVoiceGender extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SsmlVoiceGender & Double] = js.native
  
  @js.native
  sealed trait FEMALE
    extends StObject
       with SsmlVoiceGender
  /* 2 */ val FEMALE: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.FEMALE & Double = js.native
  
  @js.native
  sealed trait MALE
    extends StObject
       with SsmlVoiceGender
  /* 1 */ val MALE: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.MALE & Double = js.native
  
  @js.native
  sealed trait NEUTRAL
    extends StObject
       with SsmlVoiceGender
  /* 3 */ val NEUTRAL: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.NEUTRAL & Double = js.native
  
  @js.native
  sealed trait SSML_VOICE_GENDER_UNSPECIFIED
    extends StObject
       with SsmlVoiceGender
  /* 0 */ val SSML_VOICE_GENDER_UNSPECIFIED: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SsmlVoiceGender.SSML_VOICE_GENDER_UNSPECIFIED & Double = js.native
}
