package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageElementType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.PageElementType")
@js.native
object PageElementType extends js.Object {
  @js.native
  sealed trait GROUP extends PageElementType
  
  @js.native
  sealed trait IMAGE extends PageElementType
  
  @js.native
  sealed trait LINE extends PageElementType
  
  @js.native
  sealed trait SHAPE extends PageElementType
  
  @js.native
  sealed trait SHEETS_CHART extends PageElementType
  
  @js.native
  sealed trait TABLE extends PageElementType
  
  @js.native
  sealed trait UNSUPPORTED extends PageElementType
  
  @js.native
  sealed trait VIDEO extends PageElementType
  
  @js.native
  sealed trait WORD_ART extends PageElementType
  
  /* 5 */ val GROUP: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.PageElementType.GROUP with Double = js.native
  /* 2 */ val IMAGE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.PageElementType.IMAGE with Double = js.native
  /* 6 */ val LINE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.PageElementType.LINE with Double = js.native
  /* 1 */ val SHAPE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.PageElementType.SHAPE with Double = js.native
  /* 8 */ val SHEETS_CHART: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.PageElementType.SHEETS_CHART with Double = js.native
  /* 4 */ val TABLE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.PageElementType.TABLE with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.PageElementType.UNSUPPORTED with Double = js.native
  /* 3 */ val VIDEO: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.PageElementType.VIDEO with Double = js.native
  /* 7 */ val WORD_ART: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.PageElementType.WORD_ART with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageElementType with Double] = js.native
}

