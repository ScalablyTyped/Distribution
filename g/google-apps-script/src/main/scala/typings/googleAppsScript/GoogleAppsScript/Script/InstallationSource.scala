package typings.googleAppsScript.GoogleAppsScript.Script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InstallationSource extends StObject
/**
  * An enumeration that indicates how the script came to be installed as an add-on for the current
  * user.
  */
@JSGlobal("GoogleAppsScript.Script.InstallationSource")
@js.native
object InstallationSource extends StObject {
  
  @js.native
  sealed trait APPS_MARKETPLACE_DOMAIN_ADD_ON extends InstallationSource
  
  @js.native
  sealed trait NONE extends InstallationSource
  
  @js.native
  sealed trait WEB_STORE_ADD_ON extends InstallationSource
}
