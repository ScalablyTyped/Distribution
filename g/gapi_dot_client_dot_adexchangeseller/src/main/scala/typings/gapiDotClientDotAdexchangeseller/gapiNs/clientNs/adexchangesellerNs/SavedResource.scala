package typings.gapiDotClientDotAdexchangeseller.gapiNs.clientNs.adexchangesellerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAdexchangeseller.Anon_AccountId
import typings.gapiDotClientDotAdexchangeseller.Anon_AccountIdAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedResource extends js.Object {
  /** Generate an Ad Exchange report based on the saved report ID sent in the query parameters. */
  def generate(request: Anon_AccountIdAltFieldsKey): Request[Report]
  /** List all saved reports in this Ad Exchange account. */
  def list(request: Anon_AccountId): Request[SavedReports]
}

object SavedResource {
  @scala.inline
  def apply(
    generate: Anon_AccountIdAltFieldsKey => Request[Report],
    list: Anon_AccountId => Request[SavedReports]
  ): SavedResource = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SavedResource]
  }
}

