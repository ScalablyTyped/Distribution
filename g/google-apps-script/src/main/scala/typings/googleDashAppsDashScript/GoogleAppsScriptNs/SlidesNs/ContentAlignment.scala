package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentAlignment extends js.Object

@JSGlobal("GoogleAppsScript.Slides.ContentAlignment")
@js.native
object ContentAlignment extends js.Object {
  @js.native
  sealed trait BOTTOM extends ContentAlignment
  
  @js.native
  sealed trait MIDDLE extends ContentAlignment
  
  @js.native
  sealed trait TOP extends ContentAlignment
  
  @js.native
  sealed trait UNSUPPORTED extends ContentAlignment
  
  /* 3 */ val BOTTOM: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.ContentAlignment.BOTTOM with Double = js.native
  /* 2 */ val MIDDLE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.ContentAlignment.MIDDLE with Double = js.native
  /* 1 */ val TOP: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.ContentAlignment.TOP with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.ContentAlignment.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentAlignment with Double] = js.native
}

