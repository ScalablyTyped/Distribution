package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OpenAs extends js.Object

@JSGlobal("GoogleAppsScript.Card.OpenAs")
@js.native
object OpenAs extends js.Object {
  @js.native
  sealed trait FULL_SIZE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.OpenAs
  
  @js.native
  sealed trait OVERLAY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.OpenAs
  
  val FULL_SIZE: FULL_SIZE with java.lang.String = js.native
  val OVERLAY: OVERLAY with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.OpenAs with java.lang.String
  ] = js.native
}

