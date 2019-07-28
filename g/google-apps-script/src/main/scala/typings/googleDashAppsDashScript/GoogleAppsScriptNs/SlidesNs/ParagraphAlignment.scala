package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphAlignment extends js.Object

@JSGlobal("GoogleAppsScript.Slides.ParagraphAlignment")
@js.native
object ParagraphAlignment extends js.Object {
  @js.native
  sealed trait CENTER extends ParagraphAlignment
  
  @js.native
  sealed trait END extends ParagraphAlignment
  
  @js.native
  sealed trait JUSTIFIED extends ParagraphAlignment
  
  @js.native
  sealed trait START extends ParagraphAlignment
  
  @js.native
  sealed trait UNSUPPORTED extends ParagraphAlignment
  
  /* 2 */ val CENTER: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.ParagraphAlignment.CENTER with Double = js.native
  /* 3 */ val END: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.ParagraphAlignment.END with Double = js.native
  /* 4 */ val JUSTIFIED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.ParagraphAlignment.JUSTIFIED with Double = js.native
  /* 1 */ val START: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.ParagraphAlignment.START with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.ParagraphAlignment.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParagraphAlignment with Double] = js.native
}

