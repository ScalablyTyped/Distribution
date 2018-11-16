package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MatchMode extends js.Object

@JSImport("dialogflow", "MatchMode")
@js.native
object MatchMode extends js.Object {
  @js.native
  sealed trait MATCH_MODE_HYBRID
    extends dialogflowLib.dialogflowMod.MatchMode
  
  @js.native
  sealed trait MATCH_MODE_ML_ONLY
    extends dialogflowLib.dialogflowMod.MatchMode
  
  @js.native
  sealed trait MATCH_MODE_UNSPECIFIED
    extends dialogflowLib.dialogflowMod.MatchMode
  
  /* "MATCH_MODE_HYBRID" */ val MATCH_MODE_HYBRID: MATCH_MODE_HYBRID with java.lang.String = js.native
  /* "MATCH_MODE_ML_ONLY" */ val MATCH_MODE_ML_ONLY: MATCH_MODE_ML_ONLY with java.lang.String = js.native
  /* "MATCH_MODE_UNSPECIFIED" */ val MATCH_MODE_UNSPECIFIED: MATCH_MODE_UNSPECIFIED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[dialogflowLib.dialogflowMod.MatchMode with java.lang.String] = js.native
}

