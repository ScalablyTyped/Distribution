package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAlignment extends js.Object

@JSGlobal("GoogleAppsScript.UI.HorizontalAlignment")
@js.native
object HorizontalAlignment extends js.Object {
  @js.native
  sealed trait CENTER extends HorizontalAlignment
  
  @js.native
  sealed trait DEFAULT extends HorizontalAlignment
  
  @js.native
  sealed trait JUSTIFY extends HorizontalAlignment
  
  @js.native
  sealed trait LEFT extends HorizontalAlignment
  
  @js.native
  sealed trait LOCALE_END extends HorizontalAlignment
  
  @js.native
  sealed trait LOCALE_START extends HorizontalAlignment
  
  @js.native
  sealed trait RIGHT extends HorizontalAlignment
  
  /* 2 */ val CENTER: typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs.HorizontalAlignment.CENTER with Double = js.native
  /* 3 */ val DEFAULT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs.HorizontalAlignment.DEFAULT with Double = js.native
  /* 4 */ val JUSTIFY: typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs.HorizontalAlignment.JUSTIFY with Double = js.native
  /* 0 */ val LEFT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs.HorizontalAlignment.LEFT with Double = js.native
  /* 6 */ val LOCALE_END: typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs.HorizontalAlignment.LOCALE_END with Double = js.native
  /* 5 */ val LOCALE_START: typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs.HorizontalAlignment.LOCALE_START with Double = js.native
  /* 1 */ val RIGHT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs.HorizontalAlignment.RIGHT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalAlignment with Double] = js.native
}

