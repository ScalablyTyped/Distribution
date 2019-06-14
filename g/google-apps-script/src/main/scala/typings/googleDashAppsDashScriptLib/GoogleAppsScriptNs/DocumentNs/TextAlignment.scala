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
  
  /* 0 */ val NORMAL: NORMAL with scala.Double = js.native
  /* 2 */ val SUBSCRIPT: SUBSCRIPT with scala.Double = js.native
  /* 1 */ val SUPERSCRIPT: SUPERSCRIPT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.TextAlignment with scala.Double
  ] = js.native
}

