package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BigQueryParameterType with Double] = js.native
  /* 2 */ @js.native
  object BOOL extends TopLevel[BOOL with Double]
  
  /* 3 */ @js.native
  object FLOAT64 extends TopLevel[FLOAT64 with Double]
  
  /* 1 */ @js.native
  object INT64 extends TopLevel[INT64 with Double]
  
  /* 0 */ @js.native
  object STRING extends TopLevel[STRING with Double]
  
}

