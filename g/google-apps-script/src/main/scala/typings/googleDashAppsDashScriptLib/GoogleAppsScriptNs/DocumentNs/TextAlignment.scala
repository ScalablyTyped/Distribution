package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAlignment extends js.Object

@JSGlobal("GoogleAppsScript.Document.TextAlignment")
@js.native
object TextAlignment extends js.Object {
  @js.native
  sealed trait NORMAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.TextAlignment
  
  @js.native
  sealed trait SUBSCRIPT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.TextAlignment
  
  @js.native
  sealed trait SUPERSCRIPT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.TextAlignment
  
  val NORMAL: NORMAL with java.lang.String = js.native
  val SUBSCRIPT: SUBSCRIPT with java.lang.String = js.native
  val SUPERSCRIPT: SUPERSCRIPT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.TextAlignment with java.lang.String
  ] = js.native
}

