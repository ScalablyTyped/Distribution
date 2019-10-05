package typings.googleDashAppsDashScript.GoogleAppsScript.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Charset extends js.Object

@JSGlobal("GoogleAppsScript.Utilities.Charset")
@js.native
object Charset extends js.Object {
  @js.native
  sealed trait US_ASCII extends Charset
  
  @js.native
  sealed trait UTF_8 extends Charset
  
  /* 0 */ val US_ASCII: typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.Charset.US_ASCII with Double = js.native
  /* 1 */ val UTF_8: typings.googleDashAppsDashScript.GoogleAppsScript.Utilities.Charset.UTF_8 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Charset with Double] = js.native
}

