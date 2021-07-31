package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataSourceType extends StObject
/**
  * An enumeration of data source types.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.DataSourceType")
@js.native
object DataSourceType extends StObject {
  
  @js.native
  sealed trait BIGQUERY
    extends StObject
       with DataSourceType
  
  @js.native
  sealed trait DATA_SOURCE_TYPE_UNSUPPORTED
    extends StObject
       with DataSourceType
}
