package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldBehavior extends StObject
/** FieldBehavior enum. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.api.FieldBehavior")
@js.native
object FieldBehavior extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldBehavior & Double] = js.native
  
  @js.native
  sealed trait FIELD_BEHAVIOR_UNSPECIFIED
    extends StObject
       with FieldBehavior
  /* 0 */ val FIELD_BEHAVIOR_UNSPECIFIED: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.api.FieldBehavior.FIELD_BEHAVIOR_UNSPECIFIED & Double = js.native
  
  @js.native
  sealed trait IMMUTABLE
    extends StObject
       with FieldBehavior
  /* 5 */ val IMMUTABLE: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.api.FieldBehavior.IMMUTABLE & Double = js.native
  
  @js.native
  sealed trait INPUT_ONLY
    extends StObject
       with FieldBehavior
  /* 4 */ val INPUT_ONLY: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.api.FieldBehavior.INPUT_ONLY & Double = js.native
  
  @js.native
  sealed trait NON_EMPTY_DEFAULT
    extends StObject
       with FieldBehavior
  /* 7 */ val NON_EMPTY_DEFAULT: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.api.FieldBehavior.NON_EMPTY_DEFAULT & Double = js.native
  
  @js.native
  sealed trait OPTIONAL
    extends StObject
       with FieldBehavior
  /* 1 */ val OPTIONAL: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.api.FieldBehavior.OPTIONAL & Double = js.native
  
  @js.native
  sealed trait OUTPUT_ONLY
    extends StObject
       with FieldBehavior
  /* 3 */ val OUTPUT_ONLY: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.api.FieldBehavior.OUTPUT_ONLY & Double = js.native
  
  @js.native
  sealed trait REQUIRED
    extends StObject
       with FieldBehavior
  /* 2 */ val REQUIRED: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.api.FieldBehavior.REQUIRED & Double = js.native
  
  @js.native
  sealed trait UNORDERED_LIST
    extends StObject
       with FieldBehavior
  /* 6 */ val UNORDERED_LIST: typings.googleCloudTextToSpeech.buildProtosProtosMod.google.api.FieldBehavior.UNORDERED_LIST & Double = js.native
}
