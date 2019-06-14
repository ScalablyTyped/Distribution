package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Charset extends js.Object

@JSGlobal("GoogleAppsScript.Utilities.Charset")
@js.native
object Charset extends js.Object {
  @js.native
  sealed trait US_ASCII
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.Charset
  
  @js.native
  sealed trait UTF_8
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.Charset
  
  /* 0 */ val US_ASCII: US_ASCII with scala.Double = js.native
  /* 1 */ val UTF_8: UTF_8 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.Charset with scala.Double
  ] = js.native
}

