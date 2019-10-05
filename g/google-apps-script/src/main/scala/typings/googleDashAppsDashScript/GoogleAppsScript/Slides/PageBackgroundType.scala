package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageBackgroundType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.PageBackgroundType")
@js.native
object PageBackgroundType extends js.Object {
  @js.native
  sealed trait NONE extends PageBackgroundType
  
  @js.native
  sealed trait PICTURE extends PageBackgroundType
  
  @js.native
  sealed trait SOLID extends PageBackgroundType
  
  @js.native
  sealed trait UNSUPPORTED extends PageBackgroundType
  
  /* 1 */ val NONE: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PageBackgroundType.NONE with Double = js.native
  /* 3 */ val PICTURE: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PageBackgroundType.PICTURE with Double = js.native
  /* 2 */ val SOLID: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PageBackgroundType.SOLID with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PageBackgroundType.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageBackgroundType with Double] = js.native
}

