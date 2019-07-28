package typings.gapiDotClientDotAdexchangeseller.gapiNs.clientNs.adexchangesellerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAdexchangeseller.Anon_AccountIdAdClientId
import typings.gapiDotClientDotAdexchangeseller.Anon_AccountIdAdClientIdAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomchannelsResource extends js.Object {
  /** Get the specified custom channel from the specified ad client. */
  def get(request: Anon_AccountIdAdClientId): Request[CustomChannel]
  /** List all custom channels in the specified ad client for this Ad Exchange account. */
  def list(request: Anon_AccountIdAdClientIdAlt): Request[CustomChannels]
}

object CustomchannelsResource {
  @scala.inline
  def apply(
    get: Anon_AccountIdAdClientId => Request[CustomChannel],
    list: Anon_AccountIdAdClientIdAlt => Request[CustomChannels]
  ): CustomchannelsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CustomchannelsResource]
  }
}

