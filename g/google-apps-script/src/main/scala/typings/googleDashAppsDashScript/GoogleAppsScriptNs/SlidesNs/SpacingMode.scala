package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpacingMode extends js.Object

@JSGlobal("GoogleAppsScript.Slides.SpacingMode")
@js.native
object SpacingMode extends js.Object {
  @js.native
  sealed trait COLLAPSE_LISTS extends SpacingMode
  
  @js.native
  sealed trait NEVER_COLLAPSE extends SpacingMode
  
  @js.native
  sealed trait UNSUPPORTED extends SpacingMode
  
  /* 2 */ val COLLAPSE_LISTS: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SpacingMode.COLLAPSE_LISTS with Double = js.native
  /* 1 */ val NEVER_COLLAPSE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SpacingMode.NEVER_COLLAPSE with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SpacingMode.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpacingMode with Double] = js.native
}

