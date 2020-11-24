package typings.googleAppsScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AuthorizationStatus extends js.Object
/**
  * An enumeration denoting the authorization status of a script.
  */
@JSGlobal("GoogleAppsScript.Script.AuthorizationStatus")
@js.native
object AuthorizationStatus extends js.Object {
  
  @js.native
  sealed trait NOT_REQUIRED extends AuthorizationStatus
  
  @js.native
  sealed trait REQUIRED extends AuthorizationStatus
}
