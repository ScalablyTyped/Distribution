package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionInputType extends js.Object

@JSGlobal("GoogleAppsScript.Card_Service.SelectionInputType")
@js.native
object SelectionInputType extends js.Object {
  @js.native
  sealed trait CHECK_BOX
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.SelectionInputType
  
  @js.native
  sealed trait DROPDOWN
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.SelectionInputType
  
  @js.native
  sealed trait RADIO_BUTTON
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.SelectionInputType
  
  /* 0 */ val CHECK_BOX: CHECK_BOX with scala.Double = js.native
  /* 2 */ val DROPDOWN: DROPDOWN with scala.Double = js.native
  /* 1 */ val RADIO_BUTTON: RADIO_BUTTON with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.SelectionInputType with scala.Double
  ] = js.native
}

