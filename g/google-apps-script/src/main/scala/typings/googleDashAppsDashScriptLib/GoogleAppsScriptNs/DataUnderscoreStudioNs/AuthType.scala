package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AuthType extends js.Object

@JSGlobal("GoogleAppsScript.Data_Studio.AuthType")
@js.native
object AuthType extends js.Object {
  @js.native
  sealed trait KEY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.AuthType
  
  @js.native
  sealed trait NONE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.AuthType
  
  @js.native
  sealed trait OAUTH2
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.AuthType
  
  @js.native
  sealed trait USER_PASS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.AuthType
  
  @js.native
  sealed trait USER_TOKEN
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.AuthType
  
  val KEY: KEY with java.lang.String = js.native
  val NONE: NONE with java.lang.String = js.native
  val OAUTH2: OAUTH2 with java.lang.String = js.native
  val USER_PASS: USER_PASS with java.lang.String = js.native
  val USER_TOKEN: USER_TOKEN with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.AuthType with java.lang.String
  ] = js.native
}

