package typings.googleAppsScript.GoogleAppsScript.Slides

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
  
}

