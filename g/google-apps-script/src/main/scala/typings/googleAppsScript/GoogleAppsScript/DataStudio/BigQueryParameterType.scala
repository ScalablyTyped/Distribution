package typings.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BigQueryParameterType extends js.Object
/**
  * An enum that defines the BigQuery parameter types that you can set.
  */
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
}
