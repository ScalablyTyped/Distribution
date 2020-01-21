package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GroupControlTogglePosition extends js.Object

/**
  * An enumeration representing the possible positions that a group control toggle can have.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.GroupControlTogglePosition")
@js.native
object GroupControlTogglePosition extends js.Object {
  @js.native
  sealed trait AFTER extends GroupControlTogglePosition
  
  @js.native
  sealed trait BEFORE extends GroupControlTogglePosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupControlTogglePosition with Double] = js.native
  /* 1 */ @js.native
  object AFTER extends TopLevel[AFTER with Double]
  
  /* 0 */ @js.native
  object BEFORE extends TopLevel[BEFORE with Double]
  
}

