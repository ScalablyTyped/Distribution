package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageStyle extends js.Object

@JSGlobal("GoogleAppsScript.Card.ImageStyle")
@js.native
object ImageStyle extends js.Object {
  @js.native
  sealed trait CIRCLE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.ImageStyle
  
  @js.native
  sealed trait SQUARE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.ImageStyle
  
  val CIRCLE: CIRCLE with java.lang.String = js.native
  val SQUARE: SQUARE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs.ImageStyle with java.lang.String
  ] = js.native
}

