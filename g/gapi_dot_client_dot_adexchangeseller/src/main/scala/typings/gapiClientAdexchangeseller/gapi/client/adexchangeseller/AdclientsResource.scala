package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangeseller.AnonAccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdclientsResource extends js.Object {
  /** List all ad clients in this Ad Exchange account. */
  def list(request: AnonAccountId): Request_[AdClients]
}

object AdclientsResource {
  @scala.inline
  def apply(list: AnonAccountId => Request_[AdClients]): AdclientsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AdclientsResource]
  }
}

