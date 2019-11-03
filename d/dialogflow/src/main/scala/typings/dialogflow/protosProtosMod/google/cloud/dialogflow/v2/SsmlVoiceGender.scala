package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SsmlVoiceGender extends js.Object

/** SsmlVoiceGender enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SsmlVoiceGender")
@js.native
object SsmlVoiceGender extends js.Object {
  @js.native
  sealed trait SSML_VOICE_GENDER_FEMALE extends SsmlVoiceGender
  
  @js.native
  sealed trait SSML_VOICE_GENDER_MALE extends SsmlVoiceGender
  
  @js.native
  sealed trait SSML_VOICE_GENDER_NEUTRAL extends SsmlVoiceGender
  
  @js.native
  sealed trait SSML_VOICE_GENDER_UNSPECIFIED extends SsmlVoiceGender
  
  /* 2 */ val SSML_VOICE_GENDER_FEMALE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.SsmlVoiceGender.SSML_VOICE_GENDER_FEMALE with Double = js.native
  /* 1 */ val SSML_VOICE_GENDER_MALE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.SsmlVoiceGender.SSML_VOICE_GENDER_MALE with Double = js.native
  /* 3 */ val SSML_VOICE_GENDER_NEUTRAL: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.SsmlVoiceGender.SSML_VOICE_GENDER_NEUTRAL with Double = js.native
  /* 0 */ val SSML_VOICE_GENDER_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.SsmlVoiceGender.SSML_VOICE_GENDER_UNSPECIFIED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SsmlVoiceGender with Double] = js.native
}

