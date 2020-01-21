package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IntentView extends js.Object

/** IntentView enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentView")
@js.native
object IntentView extends js.Object {
  @js.native
  sealed trait INTENT_VIEW_FULL extends IntentView
  
  @js.native
  sealed trait INTENT_VIEW_UNSPECIFIED extends IntentView
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IntentView with Double] = js.native
  /* 1 */ @js.native
  object INTENT_VIEW_FULL extends TopLevel[INTENT_VIEW_FULL with Double]
  
  /* 0 */ @js.native
  object INTENT_VIEW_UNSPECIFIED extends TopLevel[INTENT_VIEW_UNSPECIFIED with Double]
  
}

