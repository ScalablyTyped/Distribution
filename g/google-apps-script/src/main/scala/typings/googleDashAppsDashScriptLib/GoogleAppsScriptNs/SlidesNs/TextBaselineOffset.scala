package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextBaselineOffset extends js.Object

@JSGlobal("GoogleAppsScript.Slides.TextBaselineOffset")
@js.native
object TextBaselineOffset extends js.Object {
  @js.native
  sealed trait NONE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.TextBaselineOffset
  
  @js.native
  sealed trait SUBSCRIPT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.TextBaselineOffset
  
  @js.native
  sealed trait SUPERSCRIPT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.TextBaselineOffset
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.TextBaselineOffset
  
  val NONE: NONE with java.lang.String = js.native
  val SUBSCRIPT: SUBSCRIPT with java.lang.String = js.native
  val SUPERSCRIPT: SUPERSCRIPT with java.lang.String = js.native
  val UNSUPPORTED: UNSUPPORTED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.TextBaselineOffset with java.lang.String
  ] = js.native
}

