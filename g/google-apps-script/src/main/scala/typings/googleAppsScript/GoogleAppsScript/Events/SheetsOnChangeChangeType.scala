package typings.googleAppsScript.GoogleAppsScript.Events

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
  
}

