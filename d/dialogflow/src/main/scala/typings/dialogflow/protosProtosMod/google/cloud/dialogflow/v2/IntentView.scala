package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IntentView extends js.Object

/** IntentView enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.IntentView")
@js.native
object IntentView extends js.Object {
  @js.native
  sealed trait INTENT_VIEW_FULL extends IntentView
  
  @js.native
  sealed trait INTENT_VIEW_UNSPECIFIED extends IntentView
  
  /* 1 */ val INTENT_VIEW_FULL: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.IntentView.INTENT_VIEW_FULL with Double = js.native
  /* 0 */ val INTENT_VIEW_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.IntentView.INTENT_VIEW_UNSPECIFIED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IntentView with Double] = js.native
}

