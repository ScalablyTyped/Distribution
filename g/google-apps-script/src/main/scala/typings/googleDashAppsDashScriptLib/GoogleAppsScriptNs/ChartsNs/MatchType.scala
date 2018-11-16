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
  
  val ANY: ANY with java.lang.String = js.native
  val EXACT: EXACT with java.lang.String = js.native
  val PREFIX: PREFIX with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.MatchType with java.lang.String
  ] = js.native
}

