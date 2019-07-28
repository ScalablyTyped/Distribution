package typings.gapiDotClientDotAdexchangeseller.gapiNs.clientNs.adexchangesellerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAdexchangeseller.Anon_AccountIdAdClientIdAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlchannelsResource extends js.Object {
  /** List all URL channels in the specified ad client for this Ad Exchange account. */
  def list(request: Anon_AccountIdAdClientIdAlt): Request[UrlChannels]
}

object UrlchannelsResource {
  @scala.inline
  def apply(list: Anon_AccountIdAdClientIdAlt => Request[UrlChannels]): UrlchannelsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[UrlchannelsResource]
  }
}

