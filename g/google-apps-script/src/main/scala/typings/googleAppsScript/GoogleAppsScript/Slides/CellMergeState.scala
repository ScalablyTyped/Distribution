package typings.googleAppsScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CellMergeState extends js.Object

/**
  * The table cell merge states.
  */
@JSGlobal("GoogleAppsScript.Slides.CellMergeState")
@js.native
object CellMergeState extends js.Object {
  @js.native
  sealed trait HEAD extends CellMergeState
  
  @js.native
  sealed trait MERGED extends CellMergeState
  
  @js.native
  sealed trait NORMAL extends CellMergeState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CellMergeState with Double] = js.native
  /* 1 */ @js.native
  object HEAD extends TopLevel[HEAD with Double]
  
  /* 2 */ @js.native
  object MERGED extends TopLevel[MERGED with Double]
  
  /* 0 */ @js.native
  object NORMAL extends TopLevel[NORMAL with Double]
  
}

