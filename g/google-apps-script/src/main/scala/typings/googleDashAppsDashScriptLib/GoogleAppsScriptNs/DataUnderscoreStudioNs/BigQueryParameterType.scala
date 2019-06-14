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
  
  /* 2 */ val BOOL: BOOL with scala.Double = js.native
  /* 3 */ val FLOAT64: FLOAT64 with scala.Double = js.native
  /* 1 */ val INT64: INT64 with scala.Double = js.native
  /* 0 */ val STRING: STRING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.BigQueryParameterType with scala.Double
  ] = js.native
}

