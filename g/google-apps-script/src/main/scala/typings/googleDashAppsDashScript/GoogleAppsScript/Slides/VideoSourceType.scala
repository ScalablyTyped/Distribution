package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoSourceType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.VideoSourceType")
@js.native
object VideoSourceType extends js.Object {
  @js.native
  sealed trait UNSUPPORTED extends VideoSourceType
  
  @js.native
  sealed trait YOUTUBE extends VideoSourceType
  
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.VideoSourceType.UNSUPPORTED with Double = js.native
  /* 1 */ val YOUTUBE: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.VideoSourceType.YOUTUBE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VideoSourceType with Double] = js.native
}

