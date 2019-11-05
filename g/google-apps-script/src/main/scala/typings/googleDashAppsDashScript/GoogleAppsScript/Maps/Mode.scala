package typings.googleDashAppsDashScript.GoogleAppsScript.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Mode extends js.Object

/**
  * An enum representing the mode of travel to use when finding directions.
  */
@JSGlobal("GoogleAppsScript.Maps.Mode")
@js.native
object Mode extends js.Object {
  @js.native
  sealed trait BICYCLING extends Mode
  
  @js.native
  sealed trait DRIVING extends Mode
  
  @js.native
  sealed trait TRANSIT extends Mode
  
  @js.native
  sealed trait WALKING extends Mode
  
  /* 2 */ val BICYCLING: typings.googleDashAppsDashScript.GoogleAppsScript.Maps.Mode.BICYCLING with Double = js.native
  /* 0 */ val DRIVING: typings.googleDashAppsDashScript.GoogleAppsScript.Maps.Mode.DRIVING with Double = js.native
  /* 3 */ val TRANSIT: typings.googleDashAppsDashScript.GoogleAppsScript.Maps.Mode.TRANSIT with Double = js.native
  /* 1 */ val WALKING: typings.googleDashAppsDashScript.GoogleAppsScript.Maps.Mode.WALKING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Mode with Double] = js.native
}

