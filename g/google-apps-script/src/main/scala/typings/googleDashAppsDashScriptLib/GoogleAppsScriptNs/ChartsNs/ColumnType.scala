package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColumnType extends js.Object

@JSGlobal("GoogleAppsScript.Charts.ColumnType")
@js.native
object ColumnType extends js.Object {
  @js.native
  sealed trait DATE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ColumnType
  
  @js.native
  sealed trait NUMBER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ColumnType
  
  @js.native
  sealed trait STRING
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ColumnType
  
  /* 0 */ val DATE: DATE with scala.Double = js.native
  /* 1 */ val NUMBER: NUMBER with scala.Double = js.native
  /* 2 */ val STRING: STRING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ColumnType with scala.Double
  ] = js.native
}

