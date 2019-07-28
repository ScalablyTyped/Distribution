package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphHeading extends js.Object

@JSGlobal("GoogleAppsScript.Document.ParagraphHeading")
@js.native
object ParagraphHeading extends js.Object {
  @js.native
  sealed trait HEADING1 extends ParagraphHeading
  
  @js.native
  sealed trait HEADING2 extends ParagraphHeading
  
  @js.native
  sealed trait HEADING3 extends ParagraphHeading
  
  @js.native
  sealed trait HEADING4 extends ParagraphHeading
  
  @js.native
  sealed trait HEADING5 extends ParagraphHeading
  
  @js.native
  sealed trait HEADING6 extends ParagraphHeading
  
  @js.native
  sealed trait NORMAL extends ParagraphHeading
  
  @js.native
  sealed trait SUBTITLE extends ParagraphHeading
  
  @js.native
  sealed trait TITLE extends ParagraphHeading
  
  /* 1 */ val HEADING1: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs.ParagraphHeading.HEADING1 with Double = js.native
  /* 2 */ val HEADING2: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs.ParagraphHeading.HEADING2 with Double = js.native
  /* 3 */ val HEADING3: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs.ParagraphHeading.HEADING3 with Double = js.native
  /* 4 */ val HEADING4: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs.ParagraphHeading.HEADING4 with Double = js.native
  /* 5 */ val HEADING5: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs.ParagraphHeading.HEADING5 with Double = js.native
  /* 6 */ val HEADING6: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs.ParagraphHeading.HEADING6 with Double = js.native
  /* 0 */ val NORMAL: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs.ParagraphHeading.NORMAL with Double = js.native
  /* 8 */ val SUBTITLE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs.ParagraphHeading.SUBTITLE with Double = js.native
  /* 7 */ val TITLE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs.ParagraphHeading.TITLE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParagraphHeading with Double] = js.native
}

