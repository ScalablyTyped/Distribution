package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineCategory extends js.Object

@JSGlobal("GoogleAppsScript.Slides.LineCategory")
@js.native
object LineCategory extends js.Object {
  @js.native
  sealed trait BENT extends LineCategory
  
  @js.native
  sealed trait CURVED extends LineCategory
  
  @js.native
  sealed trait STRAIGHT extends LineCategory
  
  @js.native
  sealed trait UNSUPPORTED extends LineCategory
  
  /* 2 */ val BENT: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.LineCategory.BENT with Double = js.native
  /* 3 */ val CURVED: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.LineCategory.CURVED with Double = js.native
  /* 1 */ val STRAIGHT: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.LineCategory.STRAIGHT with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.LineCategory.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LineCategory with Double] = js.native
}

