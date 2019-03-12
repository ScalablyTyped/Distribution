package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedResource extends js.Object {
  /** Generate an Ad Exchange report based on the saved report ID sent in the query parameters. */
  def generate(request: gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Report]
  /** List all saved reports in this Ad Exchange account. */
  def list(request: gapiDotClientDotAdexchangesellerLib.Anon_AccountId): gapiDotClientLib.gapiNs.clientNs.Request[SavedReports]
}

object SavedResource {
  @scala.inline
  def apply(
    generate: gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Report],
    list: gapiDotClientDotAdexchangesellerLib.Anon_AccountId => gapiDotClientLib.gapiNs.clientNs.Request[SavedReports]
  ): SavedResource = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SavedResource]
  }
}

