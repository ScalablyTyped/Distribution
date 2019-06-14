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
  
  /* 1 */ val NONE: NONE with scala.Double = js.native
  /* 3 */ val PICTURE: PICTURE with scala.Double = js.native
  /* 2 */ val SOLID: SOLID with scala.Double = js.native
  /* 0 */ val UNSUPPORTED: UNSUPPORTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageBackgroundType with scala.Double
  ] = js.native
}

