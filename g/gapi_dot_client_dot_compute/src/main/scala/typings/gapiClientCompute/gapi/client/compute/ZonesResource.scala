package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.QuotaUserUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZonesResource extends js.Object {
  /** Returns the specified Zone resource. Get a list of available zones by making a list() request. */
  def get(request: QuotaUserUserIp): Request[Zone] = js.native
  /** Retrieves the list of Zone resources available to the specified project. */
  def list(request: Alt): Request[ZoneList] = js.native
}

object ZonesResource {
  @scala.inline
  def apply(get: QuotaUserUserIp => Request[Zone], list: Alt => Request[ZoneList]): ZonesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ZonesResource]
  }
  @scala.inline
  implicit class ZonesResourceOps[Self <: ZonesResource] (val x: Self) extends AnyVal {
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
    def setGet(value: QuotaUserUserIp => Request[Zone]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[ZoneList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

