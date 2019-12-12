package typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AuthType.KEY
import typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AuthType.NONE
import typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AuthType.OAUTH2
import typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AuthType.USER_PASS
import typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AuthType.USER_TOKEN
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuthType with Double] = js.native
  /* 3 */ @js.native
  object KEY extends TopLevel[KEY with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 1 */ @js.native
  object OAUTH2 extends TopLevel[OAUTH2 with Double]
  
  /* 2 */ @js.native
  object USER_PASS extends TopLevel[USER_PASS with Double]
  
  /* 4 */ @js.native
  object USER_TOKEN extends TopLevel[USER_TOKEN with Double]
  
}

