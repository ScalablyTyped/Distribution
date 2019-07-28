package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageNavigationType extends js.Object

@JSGlobal("GoogleAppsScript.Forms.PageNavigationType")
@js.native
object PageNavigationType extends js.Object {
  @js.native
  sealed trait CONTINUE extends PageNavigationType
  
  @js.native
  sealed trait GO_TO_PAGE extends PageNavigationType
  
  @js.native
  sealed trait RESTART extends PageNavigationType
  
  @js.native
  sealed trait SUBMIT extends PageNavigationType
  
  /* 0 */ val CONTINUE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs.PageNavigationType.CONTINUE with Double = js.native
  /* 1 */ val GO_TO_PAGE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs.PageNavigationType.GO_TO_PAGE with Double = js.native
  /* 2 */ val RESTART: typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs.PageNavigationType.RESTART with Double = js.native
  /* 3 */ val SUBMIT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs.PageNavigationType.SUBMIT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageNavigationType with Double] = js.native
}

