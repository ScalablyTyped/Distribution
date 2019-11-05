package typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio

import typings.googleDashAppsDashScript.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * function getData(request: GoogleAppsScript.Data_Studio.Request<YourConnectorParams>)
  *
  * See https://developers.google.com/datastudio/connector/reference#getdata
  */
trait Request[T] extends js.Object {
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
  var fields: js.Array[Anon_Name]
  /** An object containing information relevant to connector execution. */
  var scriptParams: ScriptParams
}

object Request {
  @scala.inline
  def apply[T](
    configParams: T,
    dateRange: DateRange,
    dimensionsFilters: js.Array[js.Array[DimensionsFilters]],
    fields: js.Array[Anon_Name],
    scriptParams: ScriptParams
  ): Request[T] = {
    val __obj = js.Dynamic.literal(configParams = configParams.asInstanceOf[js.Any], dateRange = dateRange, dimensionsFilters = dimensionsFilters, fields = fields, scriptParams = scriptParams)
  
    __obj.asInstanceOf[Request[T]]
  }
}

