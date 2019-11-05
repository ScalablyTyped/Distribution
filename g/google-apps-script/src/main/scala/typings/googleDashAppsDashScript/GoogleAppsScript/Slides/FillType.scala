package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FillType extends js.Object

/**
  * The kinds of fill.
  */
@JSGlobal("GoogleAppsScript.Slides.FillType")
@js.native
object FillType extends js.Object {
  @js.native
  sealed trait NONE extends FillType
  
  @js.native
  sealed trait SOLID extends FillType
  
  @js.native
  sealed trait UNSUPPORTED extends FillType
  
  /* 1 */ val NONE: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.FillType.NONE with Double = js.native
  /* 2 */ val SOLID: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.FillType.SOLID with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.FillType.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FillType with Double] = js.native
}

