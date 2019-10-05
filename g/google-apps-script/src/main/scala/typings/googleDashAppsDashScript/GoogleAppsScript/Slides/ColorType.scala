package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColorType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.ColorType")
@js.native
object ColorType extends js.Object {
  @js.native
  sealed trait RGB extends ColorType
  
  @js.native
  sealed trait THEME extends ColorType
  
  @js.native
  sealed trait UNSUPPORTED extends ColorType
  
  /* 1 */ val RGB: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ColorType.RGB with Double = js.native
  /* 2 */ val THEME: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ColorType.THEME with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ColorType.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorType with Double] = js.native
}

