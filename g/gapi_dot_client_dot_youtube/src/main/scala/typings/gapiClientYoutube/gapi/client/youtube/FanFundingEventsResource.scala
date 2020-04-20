package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonPageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FanFundingEventsResource extends js.Object {
  /** Lists fan funding events for a channel. */
  def list(request: AnonPageToken): Request_[FanFundingEventListResponse]
}

object FanFundingEventsResource {
  @scala.inline
  def apply(list: AnonPageToken => Request_[FanFundingEventListResponse]): FanFundingEventsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[FanFundingEventsResource]
  }
}

