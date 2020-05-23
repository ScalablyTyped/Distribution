package typings.googleAppsScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColumnType extends js.Object

/**
  * An enumeration of the valid data types for columns in a DataTable.
  */
@JSGlobal("GoogleAppsScript.Charts.ColumnType")
@js.native
object ColumnType extends js.Object {
  @js.native
  sealed trait DATE extends ColumnType
  
  @js.native
  sealed trait NUMBER extends ColumnType
  
  @js.native
  sealed trait STRING extends ColumnType
  
}

