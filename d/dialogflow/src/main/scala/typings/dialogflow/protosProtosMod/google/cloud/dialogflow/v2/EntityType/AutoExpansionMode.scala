package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.EntityType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoExpansionMode extends js.Object

/** AutoExpansionMode enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityType.AutoExpansionMode")
@js.native
object AutoExpansionMode extends js.Object {
  @js.native
  sealed trait AUTO_EXPANSION_MODE_DEFAULT extends AutoExpansionMode
  
  @js.native
  sealed trait AUTO_EXPANSION_MODE_UNSPECIFIED extends AutoExpansionMode
  
  /* 1 */ val AUTO_EXPANSION_MODE_DEFAULT: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.EntityType.AutoExpansionMode.AUTO_EXPANSION_MODE_DEFAULT with Double = js.native
  /* 0 */ val AUTO_EXPANSION_MODE_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.EntityType.AutoExpansionMode.AUTO_EXPANSION_MODE_UNSPECIFIED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AutoExpansionMode with Double] = js.native
}

