package typings.googleDashAppsDashScript.GoogleAppsScript.Script

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.InstallationSource.APPS_MARKETPLACE_DOMAIN_ADD_ON
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.InstallationSource.NONE
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.InstallationSource.WEB_STORE_ADD_ON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InstallationSource extends js.Object

/**
  * An enumeration that indicates how the script came to be installed as an add-on for the current
  * user.
  */
@JSGlobal("GoogleAppsScript.Script.InstallationSource")
@js.native
object InstallationSource extends js.Object {
  @js.native
  sealed trait APPS_MARKETPLACE_DOMAIN_ADD_ON extends InstallationSource
  
  @js.native
  sealed trait NONE extends InstallationSource
  
  @js.native
  sealed trait WEB_STORE_ADD_ON extends InstallationSource
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InstallationSource with Double] = js.native
  /* 0 */ @js.native
  object APPS_MARKETPLACE_DOMAIN_ADD_ON extends TopLevel[APPS_MARKETPLACE_DOMAIN_ADD_ON with Double]
  
  /* 1 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 2 */ @js.native
  object WEB_STORE_ADD_ON extends TopLevel[WEB_STORE_ADD_ON with Double]
  
}

