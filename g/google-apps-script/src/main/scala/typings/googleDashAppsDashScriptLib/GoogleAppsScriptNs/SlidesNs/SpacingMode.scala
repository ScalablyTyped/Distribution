package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpacingMode extends js.Object

@JSGlobal("GoogleAppsScript.Slides.SpacingMode")
@js.native
object SpacingMode extends js.Object {
  @js.native
  sealed trait COLLAPSE_LISTS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SpacingMode
  
  @js.native
  sealed trait NEVER_COLLAPSE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SpacingMode
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SpacingMode
  
  /* 2 */ val COLLAPSE_LISTS: COLLAPSE_LISTS with scala.Double = js.native
  /* 1 */ val NEVER_COLLAPSE: NEVER_COLLAPSE with scala.Double = js.native
  /* 0 */ val UNSUPPORTED: UNSUPPORTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SpacingMode with scala.Double
  ] = js.native
}

