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
  
  val DATE: DATE with java.lang.String = js.native
  val NUMBER: NUMBER with java.lang.String = js.native
  val STRING: STRING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ColumnType with java.lang.String
  ] = js.native
}

