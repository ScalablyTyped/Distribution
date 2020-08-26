package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.PageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FanFundingEventsResource extends js.Object {
  /** Lists fan funding events for a channel. */
  def list(request: PageToken): Request[FanFundingEventListResponse] = js.native
}

object FanFundingEventsResource {
  @scala.inline
  def apply(list: PageToken => Request[FanFundingEventListResponse]): FanFundingEventsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[FanFundingEventsResource]
  }
  @scala.inline
  implicit class FanFundingEventsResourceOps[Self <: FanFundingEventsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setList(value: PageToken => Request[FanFundingEventListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

