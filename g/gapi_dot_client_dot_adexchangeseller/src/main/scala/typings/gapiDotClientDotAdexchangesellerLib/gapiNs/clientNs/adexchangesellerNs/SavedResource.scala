package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SavedResource extends js.Object {
  /** Generate an Ad Exchange report based on the saved report ID sent in the query parameters. */
  def generate(request: gapiDotClientDotAdexchangesellerLib.Anon_MaxResultsPrettyPrintAccountId): gapiDotClientLib.gapiNs.clientNs.Request[Report]
  /** List all saved reports in this Ad Exchange account. */
  def list(request: gapiDotClientDotAdexchangesellerLib.Anon_MaxResultsPrettyPrintPageToken): gapiDotClientLib.gapiNs.clientNs.Request[SavedReports]
}

