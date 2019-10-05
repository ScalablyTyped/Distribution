package typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BigQueryParameterType extends js.Object

@JSGlobal("GoogleAppsScript.Data_Studio.BigQueryParameterType")
@js.native
object BigQueryParameterType extends js.Object {
  @js.native
  sealed trait BOOL extends BigQueryParameterType
  
  @js.native
  sealed trait FLOAT64 extends BigQueryParameterType
  
  @js.native
  sealed trait INT64 extends BigQueryParameterType
  
  @js.native
  sealed trait STRING extends BigQueryParameterType
  
  /* 2 */ val BOOL: typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.BigQueryParameterType.BOOL with Double = js.native
  /* 3 */ val FLOAT64: typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.BigQueryParameterType.FLOAT64 with Double = js.native
  /* 1 */ val INT64: typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.BigQueryParameterType.INT64 with Double = js.native
  /* 0 */ val STRING: typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.BigQueryParameterType.STRING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BigQueryParameterType with Double] = js.native
}

