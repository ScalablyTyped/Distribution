package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionInputType extends js.Object

@JSGlobal("GoogleAppsScript.Card.SelectionInputType")
@js.native
object SelectionInputType extends js.Object {
  @js.native
  sealed trait CHECK_BOX
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.SelectionInputType
  
  @js.native
  sealed trait DROPDOWN
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.SelectionInputType
  
  @js.native
  sealed trait RADIO_BUTTON
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.SelectionInputType
  
  val CHECK_BOX: CHECK_BOX with java.lang.String = js.native
  val DROPDOWN: DROPDOWN with java.lang.String = js.native
  val RADIO_BUTTON: RADIO_BUTTON with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.SelectionInputType with java.lang.String
  ] = js.native
}

