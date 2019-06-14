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
  
  /* 3 */ val KEY: KEY with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 1 */ val OAUTH2: OAUTH2 with scala.Double = js.native
  /* 2 */ val USER_PASS: USER_PASS with scala.Double = js.native
  /* 4 */ val USER_TOKEN: USER_TOKEN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.AuthType with scala.Double
  ] = js.native
}

