package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAlignment extends js.Object

@JSGlobal("GoogleAppsScript.Document.TextAlignment")
@js.native
object TextAlignment extends js.Object {
  @js.native
  sealed trait NORMAL extends TextAlignment
  
  @js.native
  sealed trait SUBSCRIPT extends TextAlignment
  
  @js.native
  sealed trait SUPERSCRIPT extends TextAlignment
  
  /* 0 */ val NORMAL: typings.googleDashAppsDashScript.GoogleAppsScript.Document.TextAlignment.NORMAL with Double = js.native
  /* 2 */ val SUBSCRIPT: typings.googleDashAppsDashScript.GoogleAppsScript.Document.TextAlignment.SUBSCRIPT with Double = js.native
  /* 1 */ val SUPERSCRIPT: typings.googleDashAppsDashScript.GoogleAppsScript.Document.TextAlignment.SUPERSCRIPT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextAlignment with Double] = js.native
}

