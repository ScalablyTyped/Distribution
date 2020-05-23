package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangeseller.anon.Dimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  var saved: SavedResource
  /**
    * Generate an Ad Exchange report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format
    * specify "alt=csv" as a query parameter.
    */
  def generate(request: Dimension): Request[Report]
}

object ReportsResource {
  @scala.inline
  def apply(generate: Dimension => Request[Report], saved: SavedResource): ReportsResource = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), saved = saved.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportsResource]
  }
}

