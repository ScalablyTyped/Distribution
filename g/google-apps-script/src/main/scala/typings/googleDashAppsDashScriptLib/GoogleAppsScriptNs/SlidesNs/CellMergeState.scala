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
  
  val HEAD: HEAD with java.lang.String = js.native
  val MERGED: MERGED with java.lang.String = js.native
  val NORMAL: NORMAL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.CellMergeState with java.lang.String
  ] = js.native
}

