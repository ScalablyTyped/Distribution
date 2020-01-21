package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SsmlVoiceGender extends js.Object

/** SsmlVoiceGender enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SsmlVoiceGender")
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SsmlVoiceGender with Double] = js.native
  /* 2 */ @js.native
  object SSML_VOICE_GENDER_FEMALE extends TopLevel[SSML_VOICE_GENDER_FEMALE with Double]
  
  /* 1 */ @js.native
  object SSML_VOICE_GENDER_MALE extends TopLevel[SSML_VOICE_GENDER_MALE with Double]
  
  /* 3 */ @js.native
  object SSML_VOICE_GENDER_NEUTRAL extends TopLevel[SSML_VOICE_GENDER_NEUTRAL with Double]
  
  /* 0 */ @js.native
  object SSML_VOICE_GENDER_UNSPECIFIED extends TopLevel[SSML_VOICE_GENDER_UNSPECIFIED with Double]
  
}

