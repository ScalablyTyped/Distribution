package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangeseller.AnonAdClientId
import typings.gapiClientAdexchangeseller.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomchannelsResource extends js.Object {
  /** Get the specified custom channel from the specified ad client. */
  def get(request: AnonAdClientId): Request_[CustomChannel]
  /** List all custom channels in the specified ad client for this Ad Exchange account. */
  def list(request: AnonFields): Request_[CustomChannels]
}

object CustomchannelsResource {
  @scala.inline
  def apply(get: AnonAdClientId => Request_[CustomChannel], list: AnonFields => Request_[CustomChannels]): CustomchannelsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CustomchannelsResource]
  }
}

