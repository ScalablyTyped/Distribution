package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IntentView extends StObject
/** IntentView enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.IntentView")
@js.native
object IntentView extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IntentView & Double] = js.native
  
  @js.native
  sealed trait INTENT_VIEW_FULL
    extends StObject
       with IntentView
  /* 1 */ val INTENT_VIEW_FULL: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.IntentView.INTENT_VIEW_FULL & Double = js.native
  
  @js.native
  sealed trait INTENT_VIEW_UNSPECIFIED
    extends StObject
       with IntentView
  /* 0 */ val INTENT_VIEW_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.IntentView.INTENT_VIEW_UNSPECIFIED & Double = js.native
}
