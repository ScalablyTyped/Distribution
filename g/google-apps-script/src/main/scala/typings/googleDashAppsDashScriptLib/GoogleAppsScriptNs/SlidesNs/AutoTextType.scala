package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoTextType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.AutoTextType")
@js.native
object AutoTextType extends js.Object {
  @js.native
  sealed trait SLIDE_NUMBER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.AutoTextType
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.AutoTextType
  
  /* 1 */ val SLIDE_NUMBER: SLIDE_NUMBER with scala.Double = js.native
  /* 0 */ val UNSUPPORTED: UNSUPPORTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.AutoTextType with scala.Double
  ] = js.native
}

