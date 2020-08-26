package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedService extends js.Object {
  /** ID of the project that produces and owns this service. */
  var producerProjectId: js.UndefOr[String] = js.native
  /**
    * The name of the service. See the [overview](/service-management/overview)
    * for naming requirements.
    */
  var serviceName: js.UndefOr[String] = js.native
}

object ManagedService {
  @scala.inline
  def apply(): ManagedService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedService]
  }
  @scala.inline
  implicit class ManagedServiceOps[Self <: ManagedService] (val x: Self) extends AnyVal {
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
    def setProducerProjectId(value: String): Self = this.set("producerProjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProducerProjectId: Self = this.set("producerProjectId", js.undefined)
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
  }
  
}

