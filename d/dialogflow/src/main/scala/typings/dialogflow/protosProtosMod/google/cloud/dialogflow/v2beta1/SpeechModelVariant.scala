package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpeechModelVariant extends js.Object

/** SpeechModelVariant enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechModelVariant")
@js.native
object SpeechModelVariant extends js.Object {
  @js.native
  sealed trait SPEECH_MODEL_VARIANT_UNSPECIFIED extends SpeechModelVariant
  
  @js.native
  sealed trait USE_BEST_AVAILABLE extends SpeechModelVariant
  
  @js.native
  sealed trait USE_ENHANCED extends SpeechModelVariant
  
  @js.native
  sealed trait USE_STANDARD extends SpeechModelVariant
  
  /* 0 */ val SPEECH_MODEL_VARIANT_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.SpeechModelVariant.SPEECH_MODEL_VARIANT_UNSPECIFIED with Double = js.native
  /* 1 */ val USE_BEST_AVAILABLE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.SpeechModelVariant.USE_BEST_AVAILABLE with Double = js.native
  /* 3 */ val USE_ENHANCED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.SpeechModelVariant.USE_ENHANCED with Double = js.native
  /* 2 */ val USE_STANDARD: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.SpeechModelVariant.USE_STANDARD with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpeechModelVariant with Double] = js.native
}

