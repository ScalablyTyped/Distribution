package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSafebrowsing.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreatListUpdatesResource extends js.Object {
  /**
    * Fetches the most recent threat list updates. A client can request updates
    * for multiple lists at once.
    */
  def fetch(request: Alt): Request[FetchThreatListUpdatesResponse] = js.native
}

object ThreatListUpdatesResource {
  @scala.inline
  def apply(fetch: Alt => Request[FetchThreatListUpdatesResponse]): ThreatListUpdatesResource = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
    __obj.asInstanceOf[ThreatListUpdatesResource]
  }
  @scala.inline
  implicit class ThreatListUpdatesResourceOps[Self <: ThreatListUpdatesResource] (val x: Self) extends AnyVal {
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
    def setFetch(value: Alt => Request[FetchThreatListUpdatesResponse]): Self = this.set("fetch", js.Any.fromFunction1(value))
  }
  
}

