package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BigQueryParameterType extends js.Object

@JSGlobal("GoogleAppsScript.Data_Studio.BigQueryParameterType")
@js.native
object BigQueryParameterType extends js.Object {
  @js.native
  sealed trait BOOL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.BigQueryParameterType
  
  @js.native
  sealed trait FLOAT64
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.BigQueryParameterType
  
  @js.native
  sealed trait INT64
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.BigQueryParameterType
  
  @js.native
  sealed trait STRING
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.BigQueryParameterType
  
  val BOOL: BOOL with java.lang.String = js.native
  val FLOAT64: FLOAT64 with java.lang.String = js.native
  val INT64: INT64 with java.lang.String = js.native
  val STRING: STRING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.BigQueryParameterType with java.lang.String
  ] = js.native
}

