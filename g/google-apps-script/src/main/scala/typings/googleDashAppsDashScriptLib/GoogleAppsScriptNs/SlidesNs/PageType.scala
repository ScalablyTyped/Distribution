package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.PageType")
@js.native
object PageType extends js.Object {
  @js.native
  sealed trait LAYOUT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageType
  
  @js.native
  sealed trait MASTER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageType
  
  @js.native
  sealed trait SLIDE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageType
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageType
  
  /* 2 */ val LAYOUT: LAYOUT with scala.Double = js.native
  /* 3 */ val MASTER: MASTER with scala.Double = js.native
  /* 1 */ val SLIDE: SLIDE with scala.Double = js.native
  /* 0 */ val UNSUPPORTED: UNSUPPORTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageType with scala.Double
  ] = js.native
}

