package typings.googleDashAppsDashScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InstallationSource extends js.Object

@JSGlobal("GoogleAppsScript.Script.InstallationSource")
@js.native
object InstallationSource extends js.Object {
  @js.native
  sealed trait APPS_MARKETPLACE_DOMAIN_ADD_ON extends InstallationSource
  
  @js.native
  sealed trait NONE extends InstallationSource
  
  @js.native
  sealed trait WEB_STORE_ADD_ON extends InstallationSource
  
  /* 0 */ val APPS_MARKETPLACE_DOMAIN_ADD_ON: typings.googleDashAppsDashScript.GoogleAppsScript.Script.InstallationSource.APPS_MARKETPLACE_DOMAIN_ADD_ON with Double = js.native
  /* 1 */ val NONE: typings.googleDashAppsDashScript.GoogleAppsScript.Script.InstallationSource.NONE with Double = js.native
  /* 2 */ val WEB_STORE_ADD_ON: typings.googleDashAppsDashScript.GoogleAppsScript.Script.InstallationSource.WEB_STORE_ADD_ON with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InstallationSource with Double] = js.native
}

