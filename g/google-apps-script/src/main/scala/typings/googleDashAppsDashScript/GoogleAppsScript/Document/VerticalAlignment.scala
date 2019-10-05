package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalAlignment extends js.Object

@JSGlobal("GoogleAppsScript.Document.VerticalAlignment")
@js.native
object VerticalAlignment extends js.Object {
  @js.native
  sealed trait BOTTOM extends VerticalAlignment
  
  @js.native
  sealed trait CENTER extends VerticalAlignment
  
  @js.native
  sealed trait TOP extends VerticalAlignment
  
  /* 0 */ val BOTTOM: typings.googleDashAppsDashScript.GoogleAppsScript.Document.VerticalAlignment.BOTTOM with Double = js.native
  /* 1 */ val CENTER: typings.googleDashAppsDashScript.GoogleAppsScript.Document.VerticalAlignment.CENTER with Double = js.native
  /* 2 */ val TOP: typings.googleDashAppsDashScript.GoogleAppsScript.Document.VerticalAlignment.TOP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalAlignment with Double] = js.native
}

