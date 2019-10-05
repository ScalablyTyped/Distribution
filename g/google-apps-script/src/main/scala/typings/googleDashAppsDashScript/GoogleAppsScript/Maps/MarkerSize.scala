package typings.googleDashAppsDashScript.GoogleAppsScript.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerSize extends js.Object

@JSGlobal("GoogleAppsScript.Maps.MarkerSize")
@js.native
object MarkerSize extends js.Object {
  @js.native
  sealed trait MID extends MarkerSize
  
  @js.native
  sealed trait SMALL extends MarkerSize
  
  @js.native
  sealed trait TINY extends MarkerSize
  
  /* 1 */ val MID: typings.googleDashAppsDashScript.GoogleAppsScript.Maps.MarkerSize.MID with Double = js.native
  /* 2 */ val SMALL: typings.googleDashAppsDashScript.GoogleAppsScript.Maps.MarkerSize.SMALL with Double = js.native
  /* 0 */ val TINY: typings.googleDashAppsDashScript.GoogleAppsScript.Maps.MarkerSize.TINY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerSize with Double] = js.native
}

