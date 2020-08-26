package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimeResource extends js.Object {
  /** Returns real time data for a view (profile). */
  def get(request: Fields): Request[RealtimeData] = js.native
}

object RealtimeResource {
  @scala.inline
  def apply(get: Fields => Request[RealtimeData]): RealtimeResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[RealtimeResource]
  }
  @scala.inline
  implicit class RealtimeResourceOps[Self <: RealtimeResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[RealtimeData]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

