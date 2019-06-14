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
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.LineCategory
  
  /* 2 */ val BENT: BENT with scala.Double = js.native
  /* 3 */ val CURVED: CURVED with scala.Double = js.native
  /* 1 */ val STRAIGHT: STRAIGHT with scala.Double = js.native
  /* 0 */ val UNSUPPORTED: UNSUPPORTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.LineCategory with scala.Double
  ] = js.native
}

