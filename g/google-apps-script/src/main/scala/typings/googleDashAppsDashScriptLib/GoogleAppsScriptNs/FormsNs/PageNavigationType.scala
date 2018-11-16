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
  
  val CONTINUE: CONTINUE with java.lang.String = js.native
  val GO_TO_PAGE: GO_TO_PAGE with java.lang.String = js.native
  val RESTART: RESTART with java.lang.String = js.native
  val SUBMIT: SUBMIT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.PageNavigationType with java.lang.String
  ] = js.native
}

