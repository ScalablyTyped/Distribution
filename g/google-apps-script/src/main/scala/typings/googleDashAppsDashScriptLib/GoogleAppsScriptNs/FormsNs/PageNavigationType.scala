package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageNavigationType extends js.Object

@JSGlobal("GoogleAppsScript.Forms.PageNavigationType")
@js.native
object PageNavigationType extends js.Object {
  @js.native
  sealed trait CONTINUE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.PageNavigationType
  
  @js.native
  sealed trait GO_TO_PAGE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.PageNavigationType
  
  @js.native
  sealed trait RESTART
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.PageNavigationType
  
  @js.native
  sealed trait SUBMIT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.PageNavigationType
  
  /* 0 */ val CONTINUE: CONTINUE with scala.Double = js.native
  /* 1 */ val GO_TO_PAGE: GO_TO_PAGE with scala.Double = js.native
  /* 2 */ val RESTART: RESTART with scala.Double = js.native
  /* 3 */ val SUBMIT: SUBMIT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.PageNavigationType with scala.Double
  ] = js.native
}

