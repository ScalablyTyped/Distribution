package typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AuthType extends js.Object

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
  
  /* 3 */ val KEY: typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AuthType.KEY with Double = js.native
  /* 0 */ val NONE: typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AuthType.NONE with Double = js.native
  /* 1 */ val OAUTH2: typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AuthType.OAUTH2 with Double = js.native
  /* 2 */ val USER_PASS: typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AuthType.USER_PASS with Double = js.native
  /* 4 */ val USER_TOKEN: typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AuthType.USER_TOKEN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuthType with Double] = js.native
}

