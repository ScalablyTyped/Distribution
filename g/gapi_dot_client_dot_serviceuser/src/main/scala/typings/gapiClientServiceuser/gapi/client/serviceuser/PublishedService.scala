package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishedService extends js.Object {
  /**
    * The resource name of the service.
    *
    * A valid name would be:
    * - services/serviceuser.googleapis.com
    */
  var name: js.UndefOr[String] = js.native
  /** The service's published configuration. */
  var service: js.UndefOr[Service] = js.native
}

object PublishedService {
  @scala.inline
  def apply(): PublishedService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishedService]
  }
  @scala.inline
  implicit class PublishedServiceOps[Self <: PublishedService] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setService(value: Service): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
  
}

