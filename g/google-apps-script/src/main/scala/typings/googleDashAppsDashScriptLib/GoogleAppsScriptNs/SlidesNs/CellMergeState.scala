package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CellMergeState extends js.Object

@JSGlobal("GoogleAppsScript.Slides.CellMergeState")
@js.native
object CellMergeState extends js.Object {
  @js.native
  sealed trait HEAD
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.CellMergeState
  
  @js.native
  sealed trait MERGED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.CellMergeState
  
  @js.native
  sealed trait NORMAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.CellMergeState
  
  /* 1 */ val HEAD: HEAD with scala.Double = js.native
  /* 2 */ val MERGED: MERGED with scala.Double = js.native
  /* 0 */ val NORMAL: NORMAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.CellMergeState with scala.Double
  ] = js.native
}

