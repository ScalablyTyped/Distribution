package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SlideLinkingMode extends js.Object

@JSGlobal("GoogleAppsScript.Slides.SlideLinkingMode")
@js.native
object SlideLinkingMode extends js.Object {
  @js.native
  sealed trait LINKED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SlideLinkingMode
  
  @js.native
  sealed trait NOT_LINKED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SlideLinkingMode
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SlideLinkingMode
  
  /* 1 */ val LINKED: LINKED with scala.Double = js.native
  /* 2 */ val NOT_LINKED: NOT_LINKED with scala.Double = js.native
  /* 0 */ val UNSUPPORTED: UNSUPPORTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SlideLinkingMode with scala.Double
  ] = js.native
}

