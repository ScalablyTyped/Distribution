package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Visibility extends js.Object

@JSGlobal("GoogleAppsScript.Calendar.Visibility")
@js.native
object Visibility extends js.Object {
  @js.native
  sealed trait CONFIDENTIAL extends Visibility
  
  @js.native
  sealed trait DEFAULT extends Visibility
  
  @js.native
  sealed trait PRIVATE extends Visibility
  
  @js.native
  sealed trait PUBLIC extends Visibility
  
  /* 0 */ val CONFIDENTIAL: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Visibility.CONFIDENTIAL with Double = js.native
  /* 1 */ val DEFAULT: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Visibility.DEFAULT with Double = js.native
  /* 2 */ val PRIVATE: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Visibility.PRIVATE with Double = js.native
  /* 3 */ val PUBLIC: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Visibility.PUBLIC with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Visibility with Double] = js.native
}

