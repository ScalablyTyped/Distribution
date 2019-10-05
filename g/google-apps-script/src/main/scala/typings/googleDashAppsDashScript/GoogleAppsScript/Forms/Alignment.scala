package typings.googleDashAppsDashScript.GoogleAppsScript.Forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Alignment extends js.Object

@JSGlobal("GoogleAppsScript.Forms.Alignment")
@js.native
object Alignment extends js.Object {
  @js.native
  sealed trait CENTER extends Alignment
  
  @js.native
  sealed trait LEFT extends Alignment
  
  @js.native
  sealed trait RIGHT extends Alignment
  
  /* 1 */ val CENTER: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.Alignment.CENTER with Double = js.native
  /* 0 */ val LEFT: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.Alignment.LEFT with Double = js.native
  /* 2 */ val RIGHT: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.Alignment.RIGHT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Alignment with Double] = js.native
}

