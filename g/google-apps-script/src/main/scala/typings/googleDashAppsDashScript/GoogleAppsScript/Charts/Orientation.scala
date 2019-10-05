package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSGlobal("GoogleAppsScript.Charts.Orientation")
@js.native
object Orientation extends js.Object {
  @js.native
  sealed trait HORIZONTAL extends Orientation
  
  @js.native
  sealed trait VERTICAL extends Orientation
  
  /* 0 */ val HORIZONTAL: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.Orientation.HORIZONTAL with Double = js.native
  /* 1 */ val VERTICAL: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.Orientation.VERTICAL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Orientation with Double] = js.native
}

