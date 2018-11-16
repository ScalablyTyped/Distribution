package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageBackgroundType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.PageBackgroundType")
@js.native
object PageBackgroundType extends js.Object {
  @js.native
  sealed trait NONE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageBackgroundType
  
  @js.native
  sealed trait PICTURE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageBackgroundType
  
  @js.native
  sealed trait SOLID
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageBackgroundType
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageBackgroundType
  
  val NONE: NONE with java.lang.String = js.native
  val PICTURE: PICTURE with java.lang.String = js.native
  val SOLID: SOLID with java.lang.String = js.native
  val UNSUPPORTED: UNSUPPORTED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageBackgroundType with java.lang.String
  ] = js.native
}

