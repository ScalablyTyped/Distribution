package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColumnType extends js.Object

@JSGlobal("GoogleAppsScript.Charts.ColumnType")
@js.native
object ColumnType extends js.Object {
  @js.native
  sealed trait DATE extends ColumnType
  
  @js.native
  sealed trait NUMBER extends ColumnType
  
  @js.native
  sealed trait STRING extends ColumnType
  
  /* 0 */ val DATE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.ColumnType.DATE with Double = js.native
  /* 1 */ val NUMBER: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.ColumnType.NUMBER with Double = js.native
  /* 2 */ val STRING: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.ColumnType.STRING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnType with Double] = js.native
}

