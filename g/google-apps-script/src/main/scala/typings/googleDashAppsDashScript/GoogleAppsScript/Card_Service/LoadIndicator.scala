package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LoadIndicator extends js.Object

/**
  * An enum type that specifies the type of loading or progress indicator to display while an Action is being processed.
  */
@JSGlobal("GoogleAppsScript.Card_Service.LoadIndicator")
@js.native
object LoadIndicator extends js.Object {
  @js.native
  sealed trait NONE extends LoadIndicator
  
  @js.native
  sealed trait SPINNER extends LoadIndicator
  
  /* 1 */ val NONE: typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service.LoadIndicator.NONE with Double = js.native
  /* 0 */ val SPINNER: typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service.LoadIndicator.SPINNER with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LoadIndicator with Double] = js.native
}

