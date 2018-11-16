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
  
  val UNSUPPORTED: UNSUPPORTED with java.lang.String = js.native
  val YOUTUBE: YOUTUBE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.VideoSourceType with java.lang.String
  ] = js.native
}

