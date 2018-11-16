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
  
  val US_ASCII: US_ASCII with java.lang.String = js.native
  val UTF_8: UTF_8 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs.Charset with java.lang.String
  ] = js.native
}

