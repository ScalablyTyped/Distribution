package typings.googleAppsScript.GoogleAppsScript.Script

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuthorizationStatus with Double] = js.native
  /* 1 */ @js.native
  object NOT_REQUIRED extends TopLevel[NOT_REQUIRED with Double]
  
  /* 0 */ @js.native
  object REQUIRED extends TopLevel[REQUIRED with Double]
  
}

