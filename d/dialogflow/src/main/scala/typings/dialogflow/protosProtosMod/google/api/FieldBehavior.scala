package typings.dialogflow.protosProtosMod.google.api

import org.scalablytyped.runtime.TopLevel
import typings.dialogflow.protosProtosMod.google.api.FieldBehavior.FIELD_BEHAVIOR_UNSPECIFIED
import typings.dialogflow.protosProtosMod.google.api.FieldBehavior.IMMUTABLE
import typings.dialogflow.protosProtosMod.google.api.FieldBehavior.INPUT_ONLY
import typings.dialogflow.protosProtosMod.google.api.FieldBehavior.OPTIONAL
import typings.dialogflow.protosProtosMod.google.api.FieldBehavior.OUTPUT_ONLY
import typings.dialogflow.protosProtosMod.google.api.FieldBehavior.REQUIRED
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldBehavior with Double] = js.native
  /* 0 */ @js.native
  object FIELD_BEHAVIOR_UNSPECIFIED extends TopLevel[FIELD_BEHAVIOR_UNSPECIFIED with Double]
  
  /* 5 */ @js.native
  object IMMUTABLE extends TopLevel[IMMUTABLE with Double]
  
  /* 4 */ @js.native
  object INPUT_ONLY extends TopLevel[INPUT_ONLY with Double]
  
  /* 1 */ @js.native
  object OPTIONAL extends TopLevel[OPTIONAL with Double]
  
  /* 3 */ @js.native
  object OUTPUT_ONLY extends TopLevel[OUTPUT_ONLY with Double]
  
  /* 2 */ @js.native
  object REQUIRED extends TopLevel[REQUIRED with Double]
  
}

