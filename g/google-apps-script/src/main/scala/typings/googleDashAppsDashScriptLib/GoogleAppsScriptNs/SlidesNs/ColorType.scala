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
  
  /* 1 */ val RGB: RGB with scala.Double = js.native
  /* 2 */ val THEME: THEME with scala.Double = js.native
  /* 0 */ val UNSUPPORTED: UNSUPPORTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.ColorType with scala.Double
  ] = js.native
}

