package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoSourceType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.VideoSourceType")
@js.native
object VideoSourceType extends js.Object {
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.VideoSourceType
  
  @js.native
  sealed trait YOUTUBE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.VideoSourceType
  
  /* 0 */ val UNSUPPORTED: UNSUPPORTED with scala.Double = js.native
  /* 1 */ val YOUTUBE: YOUTUBE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.VideoSourceType with scala.Double
  ] = js.native
}

