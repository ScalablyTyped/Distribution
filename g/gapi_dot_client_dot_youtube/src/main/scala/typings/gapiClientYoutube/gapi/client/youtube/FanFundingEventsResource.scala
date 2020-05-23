package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.PageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FanFundingEventsResource extends js.Object {
  /** Lists fan funding events for a channel. */
  def list(request: PageToken): Request[FanFundingEventListResponse]
}

object FanFundingEventsResource {
  @scala.inline
  def apply(list: PageToken => Request[FanFundingEventListResponse]): FanFundingEventsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[FanFundingEventsResource]
  }
}

