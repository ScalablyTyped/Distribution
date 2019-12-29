package typings.googleDashAppsDashScript.GoogleAppsScript.Events

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SheetsOnChangeChangeType extends js.Object

@JSGlobal("GoogleAppsScript.Events.SheetsOnChangeChangeType")
@js.native
object SheetsOnChangeChangeType extends js.Object {
  @js.native
  sealed trait EDIT extends SheetsOnChangeChangeType
  
  @js.native
  sealed trait FORMAT extends SheetsOnChangeChangeType
  
  @js.native
  sealed trait INSERT_COLUMN extends SheetsOnChangeChangeType
  
  @js.native
  sealed trait INSERT_GRID extends SheetsOnChangeChangeType
  
  @js.native
  sealed trait INSERT_ROW extends SheetsOnChangeChangeType
  
  @js.native
  sealed trait OTHER extends SheetsOnChangeChangeType
  
  @js.native
  sealed trait REMOVE_COLUMN extends SheetsOnChangeChangeType
  
  @js.native
  sealed trait REMOVE_GRID extends SheetsOnChangeChangeType
  
  @js.native
  sealed trait REMOVE_ROW extends SheetsOnChangeChangeType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SheetsOnChangeChangeType with Double] = js.native
  /* 0 */ @js.native
  object EDIT extends TopLevel[EDIT with Double]
  
  /* 7 */ @js.native
  object FORMAT extends TopLevel[FORMAT with Double]
  
  /* 2 */ @js.native
  object INSERT_COLUMN extends TopLevel[INSERT_COLUMN with Double]
  
  /* 5 */ @js.native
  object INSERT_GRID extends TopLevel[INSERT_GRID with Double]
  
  /* 1 */ @js.native
  object INSERT_ROW extends TopLevel[INSERT_ROW with Double]
  
  /* 8 */ @js.native
  object OTHER extends TopLevel[OTHER with Double]
  
  /* 4 */ @js.native
  object REMOVE_COLUMN extends TopLevel[REMOVE_COLUMN with Double]
  
  /* 6 */ @js.native
  object REMOVE_GRID extends TopLevel[REMOVE_GRID with Double]
  
  /* 3 */ @js.native
  object REMOVE_ROW extends TopLevel[REMOVE_ROW with Double]
  
}

