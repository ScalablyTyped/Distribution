package typings.googleDashAppsDashScript.GoogleAppsScript.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Avoid extends js.Object

@JSGlobal("GoogleAppsScript.Maps.Avoid")
@js.native
object Avoid extends js.Object {
  @js.native
  sealed trait HIGHWAYS extends Avoid
  
  @js.native
  sealed trait TOLLS extends Avoid
  
  /* 1 */ val HIGHWAYS: typings.googleDashAppsDashScript.GoogleAppsScript.Maps.Avoid.HIGHWAYS with Double = js.native
  /* 0 */ val TOLLS: typings.googleDashAppsDashScript.GoogleAppsScript.Maps.Avoid.TOLLS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Avoid with Double] = js.native
}

