package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  var saved: SavedResource
  /**
    * Generate an Ad Exchange report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format
    * specify "alt=csv" as a query parameter.
    */
  def generate(request: gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAltDimension): gapiDotClientLib.gapiNs.clientNs.Request[Report]
}

object ReportsResource {
  @scala.inline
  def apply(
    generate: js.Function1[
      gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAltDimension, 
      gapiDotClientLib.gapiNs.clientNs.Request[Report]
    ],
    saved: SavedResource
  ): ReportsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generate")(generate)
    __obj.updateDynamic("saved")(saved)
    __obj.asInstanceOf[ReportsResource]
  }
}

