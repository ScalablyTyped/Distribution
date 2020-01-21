package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangeseller.AnonAccountId
import typings.gapiClientAdexchangeseller.AnonAccountIdAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedResource extends js.Object {
  /** Generate an Ad Exchange report based on the saved report ID sent in the query parameters. */
  def generate(request: AnonAccountIdAltFieldsKey): Request_[Report]
  /** List all saved reports in this Ad Exchange account. */
  def list(request: AnonAccountId): Request_[SavedReports]
}

object SavedResource {
  @scala.inline
  def apply(
    generate: AnonAccountIdAltFieldsKey => Request_[Report],
    list: AnonAccountId => Request_[SavedReports]
  ): SavedResource = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SavedResource]
  }
}

