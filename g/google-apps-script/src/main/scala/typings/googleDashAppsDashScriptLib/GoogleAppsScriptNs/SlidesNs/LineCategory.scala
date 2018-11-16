package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineCategory extends js.Object

@JSGlobal("GoogleAppsScript.Slides.LineCategory")
@js.native
object LineCategory extends js.Object {
  @js.native
  sealed trait BENT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.LineCategory
  
  @js.native
  sealed trait CURVED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.LineCategory
  
  @js.native
  sealed trait STRAIGHT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.LineCategory
  
  val BENT: BENT with java.lang.String = js.native
  val CURVED: CURVED with java.lang.String = js.native
  val STRAIGHT: STRAIGHT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.LineCategory with java.lang.String
  ] = js.native
}

