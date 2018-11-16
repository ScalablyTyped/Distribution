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
  
  val CENTER: CENTER with java.lang.String = js.native
  val END: END with java.lang.String = js.native
  val JUSTIFIED: JUSTIFIED with java.lang.String = js.native
  val START: START with java.lang.String = js.native
  val UNSUPPORTED: UNSUPPORTED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.ParagraphAlignment with java.lang.String
  ] = js.native
}

