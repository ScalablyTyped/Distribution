package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SheetsChartEmbedType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.SheetsChartEmbedType")
@js.native
object SheetsChartEmbedType extends js.Object {
  @js.native
  sealed trait IMAGE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SheetsChartEmbedType
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SheetsChartEmbedType
  
  val IMAGE: IMAGE with java.lang.String = js.native
  val UNSUPPORTED: UNSUPPORTED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SheetsChartEmbedType with java.lang.String
  ] = js.native
}

