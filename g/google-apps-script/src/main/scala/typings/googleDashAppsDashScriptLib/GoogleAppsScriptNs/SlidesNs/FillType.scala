package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FillType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.FillType")
@js.native
object FillType extends js.Object {
  @js.native
  sealed trait NONE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.FillType
  
  @js.native
  sealed trait SOLID
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.FillType
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.FillType
  
  val NONE: NONE with java.lang.String = js.native
  val SOLID: SOLID with java.lang.String = js.native
  val UNSUPPORTED: UNSUPPORTED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.FillType with java.lang.String
  ] = js.native
}

