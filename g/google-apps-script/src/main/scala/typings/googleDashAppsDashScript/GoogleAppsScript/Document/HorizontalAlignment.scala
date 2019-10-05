package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAlignment extends js.Object

@JSGlobal("GoogleAppsScript.Document.HorizontalAlignment")
@js.native
object HorizontalAlignment extends js.Object {
  @js.native
  sealed trait CENTER extends HorizontalAlignment
  
  @js.native
  sealed trait JUSTIFY extends HorizontalAlignment
  
  @js.native
  sealed trait LEFT extends HorizontalAlignment
  
  @js.native
  sealed trait RIGHT extends HorizontalAlignment
  
  /* 1 */ val CENTER: typings.googleDashAppsDashScript.GoogleAppsScript.Document.HorizontalAlignment.CENTER with Double = js.native
  /* 3 */ val JUSTIFY: typings.googleDashAppsDashScript.GoogleAppsScript.Document.HorizontalAlignment.JUSTIFY with Double = js.native
  /* 0 */ val LEFT: typings.googleDashAppsDashScript.GoogleAppsScript.Document.HorizontalAlignment.LEFT with Double = js.native
  /* 2 */ val RIGHT: typings.googleDashAppsDashScript.GoogleAppsScript.Document.HorizontalAlignment.RIGHT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalAlignment with Double] = js.native
}

