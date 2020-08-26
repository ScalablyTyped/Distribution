package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointsApiService extends js.Object {
  /** Endpoints service configuration id as specified by the Service Management API. For example "2016-09-19r1" */
  var configId: js.UndefOr[String] = js.native
  /** Endpoints service name which is the name of the "service" resource in the Service Management API. For example "myapi.endpoints.myproject.cloud.goog" */
  var name: js.UndefOr[String] = js.native
}

object EndpointsApiService {
  @scala.inline
  def apply(): EndpointsApiService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointsApiService]
  }
  @scala.inline
  implicit class EndpointsApiServiceOps[Self <: EndpointsApiService] (val x: Self) extends AnyVal {
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
    def setConfigId(value: String): Self = this.set("configId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigId: Self = this.set("configId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

