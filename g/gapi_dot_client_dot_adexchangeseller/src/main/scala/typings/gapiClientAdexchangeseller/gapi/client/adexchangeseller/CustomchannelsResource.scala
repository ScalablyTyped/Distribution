package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangeseller.anon.AdClientId
import typings.gapiClientAdexchangeseller.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomchannelsResource extends js.Object {
  /** Get the specified custom channel from the specified ad client. */
  def get(request: AdClientId): Request[CustomChannel]
  /** List all custom channels in the specified ad client for this Ad Exchange account. */
  def list(request: Fields): Request[CustomChannels]
}

object CustomchannelsResource {
  @scala.inline
  def apply(get: AdClientId => Request[CustomChannel], list: Fields => Request[CustomChannels]): CustomchannelsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CustomchannelsResource]
  }
}

