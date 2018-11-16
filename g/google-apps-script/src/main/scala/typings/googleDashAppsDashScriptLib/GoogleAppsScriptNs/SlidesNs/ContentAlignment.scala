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
  
  val BOTTOM: BOTTOM with java.lang.String = js.native
  val MIDDLE: MIDDLE with java.lang.String = js.native
  val TOP: TOP with java.lang.String = js.native
  val UNSUPPORTED: UNSUPPORTED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.ContentAlignment with java.lang.String
  ] = js.native
}

