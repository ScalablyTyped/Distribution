package typings.googleDashAppsDashScript.GoogleAppsScript.Drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Access extends js.Object

@JSGlobal("GoogleAppsScript.Drive.Access")
@js.native
object Access extends js.Object {
  @js.native
  sealed trait ANYONE extends Access
  
  @js.native
  sealed trait ANYONE_WITH_LINK extends Access
  
  @js.native
  sealed trait DOMAIN extends Access
  
  @js.native
  sealed trait DOMAIN_WITH_LINK extends Access
  
  @js.native
  sealed trait PRIVATE extends Access
  
  /* 0 */ val ANYONE: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Access.ANYONE with Double = js.native
  /* 1 */ val ANYONE_WITH_LINK: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Access.ANYONE_WITH_LINK with Double = js.native
  /* 2 */ val DOMAIN: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Access.DOMAIN with Double = js.native
  /* 3 */ val DOMAIN_WITH_LINK: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Access.DOMAIN_WITH_LINK with Double = js.native
  /* 4 */ val PRIVATE: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Access.PRIVATE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Access with Double] = js.native
}

