package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FillType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.FillType")
@js.native
object FillType extends js.Object {
  @js.native
  sealed trait NONE extends FillType
  
  @js.native
  sealed trait SOLID extends FillType
  
  @js.native
  sealed trait UNSUPPORTED extends FillType
  
  /* 1 */ val NONE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.FillType.NONE with Double = js.native
  /* 2 */ val SOLID: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.FillType.SOLID with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.FillType.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FillType with Double] = js.native
}

