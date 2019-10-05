package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoTextType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.AutoTextType")
@js.native
object AutoTextType extends js.Object {
  @js.native
  sealed trait SLIDE_NUMBER extends AutoTextType
  
  @js.native
  sealed trait UNSUPPORTED extends AutoTextType
  
  /* 1 */ val SLIDE_NUMBER: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.AutoTextType.SLIDE_NUMBER with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.AutoTextType.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AutoTextType with Double] = js.native
}

