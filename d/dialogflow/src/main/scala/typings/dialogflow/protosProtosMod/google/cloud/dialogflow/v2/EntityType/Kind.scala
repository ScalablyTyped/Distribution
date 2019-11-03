package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.EntityType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Kind extends js.Object

/** Kind enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityType.Kind")
@js.native
object Kind extends js.Object {
  @js.native
  sealed trait KIND_LIST extends Kind
  
  @js.native
  sealed trait KIND_MAP extends Kind
  
  @js.native
  sealed trait KIND_REGEXP extends Kind
  
  @js.native
  sealed trait KIND_UNSPECIFIED extends Kind
  
  /* 2 */ val KIND_LIST: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.EntityType.Kind.KIND_LIST with Double = js.native
  /* 1 */ val KIND_MAP: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.EntityType.Kind.KIND_MAP with Double = js.native
  /* 3 */ val KIND_REGEXP: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.EntityType.Kind.KIND_REGEXP with Double = js.native
  /* 0 */ val KIND_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.EntityType.Kind.KIND_UNSPECIFIED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Kind with Double] = js.native
}

