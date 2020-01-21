package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebhookState extends js.Object

/** WebhookState enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.WebhookState")
@js.native
object WebhookState extends js.Object {
  @js.native
  sealed trait WEBHOOK_STATE_ENABLED extends WebhookState
  
  @js.native
  sealed trait WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING extends WebhookState
  
  @js.native
  sealed trait WEBHOOK_STATE_UNSPECIFIED extends WebhookState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebhookState with Double] = js.native
  /* 1 */ @js.native
  object WEBHOOK_STATE_ENABLED extends TopLevel[WEBHOOK_STATE_ENABLED with Double]
  
  /* 2 */ @js.native
  object WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING extends TopLevel[WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING with Double]
  
  /* 0 */ @js.native
  object WEBHOOK_STATE_UNSPECIFIED extends TopLevel[WEBHOOK_STATE_UNSPECIFIED with Double]
  
}

