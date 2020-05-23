package typings.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AuthType extends js.Object

/**
  * An enum that defines the authentication types that can be set for a connector.
  */
@JSGlobal("GoogleAppsScript.Data_Studio.AuthType")
@js.native
object AuthType extends js.Object {
  @js.native
  sealed trait KEY extends AuthType
  
  @js.native
  sealed trait NONE extends AuthType
  
  @js.native
  sealed trait OAUTH2 extends AuthType
  
  @js.native
  sealed trait USER_PASS extends AuthType
  
  @js.native
  sealed trait USER_TOKEN extends AuthType
  
}

