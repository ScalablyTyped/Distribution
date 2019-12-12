package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.ColumnType.DATE
import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.ColumnType.NUMBER
import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.ColumnType.STRING
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnType with Double] = js.native
  /* 0 */ @js.native
  object DATE extends TopLevel[DATE with Double]
  
  /* 1 */ @js.native
  object NUMBER extends TopLevel[NUMBER with Double]
  
  /* 2 */ @js.native
  object STRING extends TopLevel[STRING with Double]
  
}

