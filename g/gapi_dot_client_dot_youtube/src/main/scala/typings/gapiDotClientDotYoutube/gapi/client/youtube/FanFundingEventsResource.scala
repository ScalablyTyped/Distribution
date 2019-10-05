package typings.gapiDotClientDotYoutube.gapi.client.youtube

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotYoutube.Anon_AltFieldsHl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FanFundingEventsResource extends js.Object {
  /** Lists fan funding events for a channel. */
  def list(request: Anon_AltFieldsHl): Request[FanFundingEventListResponse]
}

object FanFundingEventsResource {
  @scala.inline
  def apply(list: Anon_AltFieldsHl => Request[FanFundingEventListResponse]): FanFundingEventsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[FanFundingEventsResource]
  }
}

