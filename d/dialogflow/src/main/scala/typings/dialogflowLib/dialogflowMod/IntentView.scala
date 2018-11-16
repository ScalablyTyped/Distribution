package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IntentView extends js.Object

@JSImport("dialogflow", "IntentView")
@js.native
object IntentView extends js.Object {
  @js.native
  sealed trait INTENT_VIEW_FULL
    extends dialogflowLib.dialogflowMod.IntentView
  
  @js.native
  sealed trait INTENT_VIEW_UNSPECIFIED
    extends dialogflowLib.dialogflowMod.IntentView
  
  /* "INTENT_VIEW_FULL" */ val INTENT_VIEW_FULL: INTENT_VIEW_FULL with java.lang.String = js.native
  /* "INTENT_VIEW_UNSPECIFIED" */ val INTENT_VIEW_UNSPECIFIED: INTENT_VIEW_UNSPECIFIED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[dialogflowLib.dialogflowMod.IntentView with java.lang.String] = js.native
}

