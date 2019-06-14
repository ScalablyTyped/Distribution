package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAlignment extends js.Object

@JSGlobal("GoogleAppsScript.UI.HorizontalAlignment")
@js.native
object HorizontalAlignment extends js.Object {
  @js.native
  sealed trait CENTER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs.HorizontalAlignment
  
  @js.native
  sealed trait DEFAULT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs.HorizontalAlignment
  
  @js.native
  sealed trait JUSTIFY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs.HorizontalAlignment
  
  @js.native
  sealed trait LEFT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs.HorizontalAlignment
  
  @js.native
  sealed trait LOCALE_END
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs.HorizontalAlignment
  
  @js.native
  sealed trait LOCALE_START
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs.HorizontalAlignment
  
  @js.native
  sealed trait RIGHT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs.HorizontalAlignment
  
  /* 2 */ val CENTER: CENTER with scala.Double = js.native
  /* 3 */ val DEFAULT: DEFAULT with scala.Double = js.native
  /* 4 */ val JUSTIFY: JUSTIFY with scala.Double = js.native
  /* 0 */ val LEFT: LEFT with scala.Double = js.native
  /* 6 */ val LOCALE_END: LOCALE_END with scala.Double = js.native
  /* 5 */ val LOCALE_START: LOCALE_START with scala.Double = js.native
  /* 1 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs.HorizontalAlignment with scala.Double
  ] = js.native
}

