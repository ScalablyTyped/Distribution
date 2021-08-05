package typings.googleAppsScript.GoogleAppsScript.DataStudio

import typings.googleAppsScript.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * function getData(request: GoogleAppsScript.Data_Studio.Request<YourConnectorParams>)
  *
  * See https://developers.google.com/datastudio/connector/reference#getdata
  */
trait Request[T] extends StObject {
  
  /** An object containing the user provided values for the config parameters defined by the connector. */
  var configParams: T
  
  /**
    * By default, the date range provided will be the last 28 days excluding today.
    * If a user applies a date range filter for a report, then the date range provided will reflect the user selection.
    * When sampleExtraction is set to true, the date two days earlier than today is given as both the start and end date.
    */
  var dateRange: DateRange
  
  /**
    * A nested array of the user selected filters.
    * The innermost arrays should be ORed together, the outermost arrays should be ANDed together.
    */
  var dimensionsFilters: js.Array[js.Array[DimensionsFilters]]
  
  /** The names of the requested fields. */
  var fields: js.Array[Name]
  
  /** An object containing information relevant to connector execution. */
  var scriptParams: ScriptParams
}
object Request {
  
  inline def apply[T](
    configParams: T,
    dateRange: DateRange,
    dimensionsFilters: js.Array[js.Array[DimensionsFilters]],
    fields: js.Array[Name],
    scriptParams: ScriptParams
  ): Request[T] = {
    val __obj = js.Dynamic.literal(configParams = configParams.asInstanceOf[js.Any], dateRange = dateRange.asInstanceOf[js.Any], dimensionsFilters = dimensionsFilters.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], scriptParams = scriptParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request[T]]
  }
  
  extension [Self <: Request[?], T](x: Self & Request[T]) {
    
    inline def setConfigParams(value: T): Self = StObject.set(x, "configParams", value.asInstanceOf[js.Any])
    
    inline def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDimensionsFilters(value: js.Array[js.Array[DimensionsFilters]]): Self = StObject.set(x, "dimensionsFilters", value.asInstanceOf[js.Any])
    
    inline def setDimensionsFiltersVarargs(value: js.Array[DimensionsFilters]*): Self = StObject.set(x, "dimensionsFilters", js.Array(value :_*))
    
    inline def setFields(value: js.Array[Name]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: Name*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setScriptParams(value: ScriptParams): Self = StObject.set(x, "scriptParams", value.asInstanceOf[js.Any])
  }
}
