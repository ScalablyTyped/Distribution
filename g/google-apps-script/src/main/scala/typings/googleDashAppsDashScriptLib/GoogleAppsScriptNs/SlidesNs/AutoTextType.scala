package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoTextType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.AutoTextType")
@js.native
object AutoTextType extends js.Object {
  @js.native
  sealed trait SLIDE_NUMBER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.AutoTextType
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.AutoTextType
  
  val SLIDE_NUMBER: SLIDE_NUMBER with java.lang.String = js.native
  val UNSUPPORTED: UNSUPPORTED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.AutoTextType with java.lang.String
  ] = js.native
}

