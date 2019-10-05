package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema.DimensionValueList
import typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema.DimensionValueRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionValuesCollection extends js.Object {
  // Retrieves list of report dimension values for a list of filters.
  def query(resource: DimensionValueRequest, profileId: String): DimensionValueList = js.native
  // Retrieves list of report dimension values for a list of filters.
  def query(resource: DimensionValueRequest, profileId: String, optionalArgs: js.Object): DimensionValueList = js.native
}

