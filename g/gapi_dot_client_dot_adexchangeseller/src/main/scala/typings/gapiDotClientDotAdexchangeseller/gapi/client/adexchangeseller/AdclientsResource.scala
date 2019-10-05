package typings.gapiDotClientDotAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangeseller.Anon_AccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdclientsResource extends js.Object {
  /** List all ad clients in this Ad Exchange account. */
  def list(request: Anon_AccountId): Request[AdClients]
}

object AdclientsResource {
  @scala.inline
  def apply(list: Anon_AccountId => Request[AdClients]): AdclientsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AdclientsResource]
  }
}

