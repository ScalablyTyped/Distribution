package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageElementType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.PageElementType")
@js.native
object PageElementType extends js.Object {
  @js.native
  sealed trait GROUP
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageElementType
  
  @js.native
  sealed trait IMAGE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageElementType
  
  @js.native
  sealed trait LINE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageElementType
  
  @js.native
  sealed trait SHAPE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageElementType
  
  @js.native
  sealed trait SHEETS_CHART
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageElementType
  
  @js.native
  sealed trait TABLE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageElementType
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageElementType
  
  @js.native
  sealed trait VIDEO
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageElementType
  
  @js.native
  sealed trait WORD_ART
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageElementType
  
  /* 5 */ val GROUP: GROUP with scala.Double = js.native
  /* 2 */ val IMAGE: IMAGE with scala.Double = js.native
  /* 6 */ val LINE: LINE with scala.Double = js.native
  /* 1 */ val SHAPE: SHAPE with scala.Double = js.native
  /* 8 */ val SHEETS_CHART: SHEETS_CHART with scala.Double = js.native
  /* 4 */ val TABLE: TABLE with scala.Double = js.native
  /* 0 */ val UNSUPPORTED: UNSUPPORTED with scala.Double = js.native
  /* 3 */ val VIDEO: VIDEO with scala.Double = js.native
  /* 7 */ val WORD_ART: WORD_ART with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageElementType with scala.Double
  ] = js.native
}

