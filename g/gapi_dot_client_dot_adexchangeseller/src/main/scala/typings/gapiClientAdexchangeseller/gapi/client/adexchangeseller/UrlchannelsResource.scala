package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangeseller.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlchannelsResource extends js.Object {
  /** List all URL channels in the specified ad client for this Ad Exchange account. */
  def list(request: AnonFields): Request_[UrlChannels]
}

object UrlchannelsResource {
  @scala.inline
  def apply(list: AnonFields => Request_[UrlChannels]): UrlchannelsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UrlchannelsResource]
  }
}

