package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebhookState extends js.Object

/** WebhookState enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.WebhookState")
@js.native
object WebhookState extends js.Object {
  @js.native
  sealed trait WEBHOOK_STATE_ENABLED extends WebhookState
  
  @js.native
  sealed trait WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING extends WebhookState
  
  @js.native
  sealed trait WEBHOOK_STATE_UNSPECIFIED extends WebhookState
  
  /* 1 */ val WEBHOOK_STATE_ENABLED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.WebhookState.WEBHOOK_STATE_ENABLED with Double = js.native
  /* 2 */ val WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.WebhookState.WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING with Double = js.native
  /* 0 */ val WEBHOOK_STATE_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.WebhookState.WEBHOOK_STATE_UNSPECIFIED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebhookState with Double] = js.native
}

