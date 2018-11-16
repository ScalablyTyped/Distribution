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
  
  val GROUP: GROUP with java.lang.String = js.native
  val IMAGE: IMAGE with java.lang.String = js.native
  val LINE: LINE with java.lang.String = js.native
  val SHAPE: SHAPE with java.lang.String = js.native
  val SHEETS_CHART: SHEETS_CHART with java.lang.String = js.native
  val TABLE: TABLE with java.lang.String = js.native
  val UNSUPPORTED: UNSUPPORTED with java.lang.String = js.native
  val VIDEO: VIDEO with java.lang.String = js.native
  val WORD_ART: WORD_ART with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageElementType with java.lang.String
  ] = js.native
}

