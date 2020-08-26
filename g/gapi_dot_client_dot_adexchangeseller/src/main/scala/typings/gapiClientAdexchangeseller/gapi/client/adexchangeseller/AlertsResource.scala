package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangeseller.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertsResource extends js.Object {
  /** List the alerts for this Ad Exchange account. */
  def list(request: Alt): Request[Alerts] = js.native
}

object AlertsResource {
  @scala.inline
  def apply(list: Alt => Request[Alerts]): AlertsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AlertsResource]
  }
  @scala.inline
  implicit class AlertsResourceOps[Self <: AlertsResource] (val x: Self) extends AnyVal {
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
    def setList(value: Alt => Request[Alerts]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

