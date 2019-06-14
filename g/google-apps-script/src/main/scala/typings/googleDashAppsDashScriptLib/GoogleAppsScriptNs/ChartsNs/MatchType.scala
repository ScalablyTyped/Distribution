package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MatchType extends js.Object

@JSGlobal("GoogleAppsScript.Charts.MatchType")
@js.native
object MatchType extends js.Object {
  @js.native
  sealed trait ANY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.MatchType
  
  @js.native
  sealed trait EXACT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.MatchType
  
  @js.native
  sealed trait PREFIX
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.MatchType
  
  /* 2 */ val ANY: ANY with scala.Double = js.native
  /* 0 */ val EXACT: EXACT with scala.Double = js.native
  /* 1 */ val PREFIX: PREFIX with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.MatchType with scala.Double
  ] = js.native
}

