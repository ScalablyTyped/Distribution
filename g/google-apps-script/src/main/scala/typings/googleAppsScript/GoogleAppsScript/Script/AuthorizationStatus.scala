package typings.googleAppsScript.GoogleAppsScript.Script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AuthorizationStatus extends StObject
/**
  * An enumeration denoting the authorization status of a script.
  */
@JSGlobal("GoogleAppsScript.Script.AuthorizationStatus")
@js.native
object AuthorizationStatus extends StObject {
  
  @js.native
  sealed trait NOT_REQUIRED extends AuthorizationStatus
  
  @js.native
  sealed trait REQUIRED extends AuthorizationStatus
}
