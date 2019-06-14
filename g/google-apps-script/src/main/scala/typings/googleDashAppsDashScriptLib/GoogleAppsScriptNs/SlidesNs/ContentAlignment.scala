package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentAlignment extends js.Object

@JSGlobal("GoogleAppsScript.Slides.ContentAlignment")
@js.native
object ContentAlignment extends js.Object {
  @js.native
  sealed trait BOTTOM
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.ContentAlignment
  
  @js.native
  sealed trait MIDDLE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.ContentAlignment
  
  @js.native
  sealed trait TOP
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.ContentAlignment
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.ContentAlignment
  
  /* 3 */ val BOTTOM: BOTTOM with scala.Double = js.native
  /* 2 */ val MIDDLE: MIDDLE with scala.Double = js.native
  /* 1 */ val TOP: TOP with scala.Double = js.native
  /* 0 */ val UNSUPPORTED: UNSUPPORTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.ContentAlignment with scala.Double
  ] = js.native
}

