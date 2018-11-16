package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoSource extends js.Object

// The video sources.
@JSGlobal("GoogleAppsScript.Slides_v1.VideoSource")
@js.native
object VideoSource extends js.Object {
  // The video source is Google Drive.
  @js.native
  sealed trait DRIVE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.VideoSource
  
  // The video source is unspecified.
  @js.native
  sealed trait SOURCE_UNSPECIFIED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.VideoSource
  
  // The video source is YouTube.
  @js.native
  sealed trait YOUTUBE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.VideoSource
  
  val DRIVE: DRIVE with java.lang.String = js.native
  val SOURCE_UNSPECIFIED: SOURCE_UNSPECIFIED with java.lang.String = js.native
  val YOUTUBE: YOUTUBE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.VideoSource with java.lang.String
  ] = js.native
}

