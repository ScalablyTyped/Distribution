package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageStyle extends js.Object

@JSGlobal("GoogleAppsScript.Card_Service.ImageStyle")
@js.native
object ImageStyle extends js.Object {
  @js.native
  sealed trait CIRCLE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.ImageStyle
  
  @js.native
  sealed trait SQUARE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.ImageStyle
  
  val CIRCLE: CIRCLE with java.lang.String = js.native
  val SQUARE: SQUARE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.ImageStyle with java.lang.String
  ] = js.native
}

