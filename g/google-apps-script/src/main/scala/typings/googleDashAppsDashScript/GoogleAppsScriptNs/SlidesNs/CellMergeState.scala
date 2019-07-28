package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CellMergeState extends js.Object

@JSGlobal("GoogleAppsScript.Slides.CellMergeState")
@js.native
object CellMergeState extends js.Object {
  @js.native
  sealed trait HEAD extends CellMergeState
  
  @js.native
  sealed trait MERGED extends CellMergeState
  
  @js.native
  sealed trait NORMAL extends CellMergeState
  
  /* 1 */ val HEAD: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.CellMergeState.HEAD with Double = js.native
  /* 2 */ val MERGED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.CellMergeState.MERGED with Double = js.native
  /* 0 */ val NORMAL: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.CellMergeState.NORMAL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CellMergeState with Double] = js.native
}

