package typings.dialogflow.protosProtosMod.google.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldBehavior extends js.Object

/** FieldBehavior enum. */
@JSImport("dialogflow/protos/protos", "google.api.FieldBehavior")
@js.native
object FieldBehavior extends js.Object {
  @js.native
  sealed trait FIELD_BEHAVIOR_UNSPECIFIED extends FieldBehavior
  
  @js.native
  sealed trait IMMUTABLE extends FieldBehavior
  
  @js.native
  sealed trait INPUT_ONLY extends FieldBehavior
  
  @js.native
  sealed trait OPTIONAL extends FieldBehavior
  
  @js.native
  sealed trait OUTPUT_ONLY extends FieldBehavior
  
  @js.native
  sealed trait REQUIRED extends FieldBehavior
  
  /* 0 */ val FIELD_BEHAVIOR_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.api.FieldBehavior.FIELD_BEHAVIOR_UNSPECIFIED with Double = js.native
  /* 5 */ val IMMUTABLE: typings.dialogflow.protosProtosMod.google.api.FieldBehavior.IMMUTABLE with Double = js.native
  /* 4 */ val INPUT_ONLY: typings.dialogflow.protosProtosMod.google.api.FieldBehavior.INPUT_ONLY with Double = js.native
  /* 1 */ val OPTIONAL: typings.dialogflow.protosProtosMod.google.api.FieldBehavior.OPTIONAL with Double = js.native
  /* 3 */ val OUTPUT_ONLY: typings.dialogflow.protosProtosMod.google.api.FieldBehavior.OUTPUT_ONLY with Double = js.native
  /* 2 */ val REQUIRED: typings.dialogflow.protosProtosMod.google.api.FieldBehavior.REQUIRED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldBehavior with Double] = js.native
}

