package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineFillType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.LineFillType")
@js.native
object LineFillType extends js.Object {
  @js.native
  sealed trait NONE extends LineFillType
  
  @js.native
  sealed trait SOLID extends LineFillType
  
  @js.native
  sealed trait UNSUPPORTED extends LineFillType
  
  /* 1 */ val NONE: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.LineFillType.NONE with Double = js.native
  /* 2 */ val SOLID: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.LineFillType.SOLID with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.LineFillType.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LineFillType with Double] = js.native
}

