package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OpenAs extends js.Object

@JSGlobal("GoogleAppsScript.Card_Service.OpenAs")
@js.native
object OpenAs extends js.Object {
  @js.native
  sealed trait FULL_SIZE extends OpenAs
  
  @js.native
  sealed trait OVERLAY extends OpenAs
  
  /* 0 */ val FULL_SIZE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs.OpenAs.FULL_SIZE with Double = js.native
  /* 1 */ val OVERLAY: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs.OpenAs.OVERLAY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OpenAs with Double] = js.native
}

