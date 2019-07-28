package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionInputType extends js.Object

@JSGlobal("GoogleAppsScript.Card_Service.SelectionInputType")
@js.native
object SelectionInputType extends js.Object {
  @js.native
  sealed trait CHECK_BOX extends SelectionInputType
  
  @js.native
  sealed trait DROPDOWN extends SelectionInputType
  
  @js.native
  sealed trait RADIO_BUTTON extends SelectionInputType
  
  /* 0 */ val CHECK_BOX: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs.SelectionInputType.CHECK_BOX with Double = js.native
  /* 2 */ val DROPDOWN: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs.SelectionInputType.DROPDOWN with Double = js.native
  /* 1 */ val RADIO_BUTTON: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs.SelectionInputType.RADIO_BUTTON with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionInputType with Double] = js.native
}

