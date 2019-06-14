package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphAlignment extends js.Object

@JSGlobal("GoogleAppsScript.Slides.ParagraphAlignment")
@js.native
object ParagraphAlignment extends js.Object {
  @js.native
  sealed trait CENTER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.ParagraphAlignment
  
  @js.native
  sealed trait END
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.ParagraphAlignment
  
  @js.native
  sealed trait JUSTIFIED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.ParagraphAlignment
  
  @js.native
  sealed trait START
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.ParagraphAlignment
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.ParagraphAlignment
  
  /* 2 */ val CENTER: CENTER with scala.Double = js.native
  /* 3 */ val END: END with scala.Double = js.native
  /* 4 */ val JUSTIFIED: JUSTIFIED with scala.Double = js.native
  /* 1 */ val START: START with scala.Double = js.native
  /* 0 */ val UNSUPPORTED: UNSUPPORTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.ParagraphAlignment with scala.Double
  ] = js.native
}

