package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Button extends js.Object

@JSGlobal("GoogleAppsScript.Base.Button")
@js.native
object Button extends js.Object {
  @js.native
  sealed trait CANCEL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Button
  
  @js.native
  sealed trait CLOSE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Button
  
  @js.native
  sealed trait NO
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Button
  
  @js.native
  sealed trait OK
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Button
  
  @js.native
  sealed trait YES
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Button
  
  val CANCEL: CANCEL with java.lang.String = js.native
  val CLOSE: CLOSE with java.lang.String = js.native
  val NO: NO with java.lang.String = js.native
  val OK: OK with java.lang.String = js.native
  val YES: YES with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Button with java.lang.String
  ] = js.native
}

