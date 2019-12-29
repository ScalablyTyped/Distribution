package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpeechModelVariant extends js.Object

/** SpeechModelVariant enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SpeechModelVariant")
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpeechModelVariant with Double] = js.native
  /* 0 */ @js.native
  object SPEECH_MODEL_VARIANT_UNSPECIFIED extends TopLevel[SPEECH_MODEL_VARIANT_UNSPECIFIED with Double]
  
  /* 1 */ @js.native
  object USE_BEST_AVAILABLE extends TopLevel[USE_BEST_AVAILABLE with Double]
  
  /* 3 */ @js.native
  object USE_ENHANCED extends TopLevel[USE_ENHANCED with Double]
  
  /* 2 */ @js.native
  object USE_STANDARD extends TopLevel[USE_STANDARD with Double]
  
}

