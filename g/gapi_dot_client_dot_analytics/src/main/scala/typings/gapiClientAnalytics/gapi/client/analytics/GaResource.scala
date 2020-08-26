package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GaResource extends js.Object {
  /** Returns Analytics data for a view (profile). */
  def get(request: Alt): Request[GaData] = js.native
}

object GaResource {
  @scala.inline
  def apply(get: Alt => Request[GaData]): GaResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[GaResource]
  }
  @scala.inline
  implicit class GaResourceOps[Self <: GaResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Alt => Request[GaData]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

