package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpeechModelVariant extends StObject
/** SpeechModelVariant enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.SpeechModelVariant")
@js.native
object SpeechModelVariant extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpeechModelVariant & Double] = js.native
  
  @js.native
  sealed trait SPEECH_MODEL_VARIANT_UNSPECIFIED
    extends StObject
       with SpeechModelVariant
  /* 0 */ val SPEECH_MODEL_VARIANT_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.SpeechModelVariant.SPEECH_MODEL_VARIANT_UNSPECIFIED & Double = js.native
  
  @js.native
  sealed trait USE_BEST_AVAILABLE
    extends StObject
       with SpeechModelVariant
  /* 1 */ val USE_BEST_AVAILABLE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.SpeechModelVariant.USE_BEST_AVAILABLE & Double = js.native
  
  @js.native
  sealed trait USE_ENHANCED
    extends StObject
       with SpeechModelVariant
  /* 3 */ val USE_ENHANCED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.SpeechModelVariant.USE_ENHANCED & Double = js.native
  
  @js.native
  sealed trait USE_STANDARD
    extends StObject
       with SpeechModelVariant
  /* 2 */ val USE_STANDARD: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.SpeechModelVariant.USE_STANDARD & Double = js.native
}
