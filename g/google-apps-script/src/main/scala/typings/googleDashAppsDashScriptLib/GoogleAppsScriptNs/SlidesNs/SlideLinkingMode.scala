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
  
  val LINKED: LINKED with java.lang.String = js.native
  val NOT_LINKED: NOT_LINKED with java.lang.String = js.native
  val UNSUPPORTED: UNSUPPORTED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SlideLinkingMode with java.lang.String
  ] = js.native
}

