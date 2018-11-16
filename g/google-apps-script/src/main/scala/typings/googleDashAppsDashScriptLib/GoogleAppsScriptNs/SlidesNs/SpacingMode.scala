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
  
  val COLLAPSE_LISTS: COLLAPSE_LISTS with java.lang.String = js.native
  val NEVER_COLLAPSE: NEVER_COLLAPSE with java.lang.String = js.native
  val UNSUPPORTED: UNSUPPORTED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SpacingMode with java.lang.String
  ] = js.native
}

