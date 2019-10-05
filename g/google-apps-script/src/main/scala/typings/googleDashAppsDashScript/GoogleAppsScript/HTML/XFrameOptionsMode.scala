package typings.googleDashAppsDashScript.GoogleAppsScript.HTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XFrameOptionsMode extends js.Object

@JSGlobal("GoogleAppsScript.HTML.XFrameOptionsMode")
@js.native
object XFrameOptionsMode extends js.Object {
  @js.native
  sealed trait ALLOWALL extends XFrameOptionsMode
  
  @js.native
  sealed trait DEFAULT extends XFrameOptionsMode
  
  /* 0 */ val ALLOWALL: typings.googleDashAppsDashScript.GoogleAppsScript.HTML.XFrameOptionsMode.ALLOWALL with Double = js.native
  /* 1 */ val DEFAULT: typings.googleDashAppsDashScript.GoogleAppsScript.HTML.XFrameOptionsMode.DEFAULT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XFrameOptionsMode with Double] = js.native
}

