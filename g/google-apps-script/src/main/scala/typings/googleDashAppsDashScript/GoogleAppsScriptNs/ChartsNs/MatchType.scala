package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MatchType extends js.Object

@JSGlobal("GoogleAppsScript.Charts.MatchType")
@js.native
object MatchType extends js.Object {
  @js.native
  sealed trait ANY extends MatchType
  
  @js.native
  sealed trait EXACT extends MatchType
  
  @js.native
  sealed trait PREFIX extends MatchType
  
  /* 2 */ val ANY: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.MatchType.ANY with Double = js.native
  /* 0 */ val EXACT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.MatchType.EXACT with Double = js.native
  /* 1 */ val PREFIX: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.MatchType.PREFIX with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MatchType with Double] = js.native
}

