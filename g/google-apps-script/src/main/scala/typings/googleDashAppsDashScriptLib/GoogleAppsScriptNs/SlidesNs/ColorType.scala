package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColorType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.ColorType")
@js.native
object ColorType extends js.Object {
  @js.native
  sealed trait RGB
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.ColorType
  
  @js.native
  sealed trait THEME
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.ColorType
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.ColorType
  
  val RGB: RGB with java.lang.String = js.native
  val THEME: THEME with java.lang.String = js.native
  val UNSUPPORTED: UNSUPPORTED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.ColorType with java.lang.String
  ] = js.native
}

