package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDebugConfigRequest extends js.Object {
  /**
    * The internal component id for which debug configuration is
    * requested.
    */
  var componentId: js.UndefOr[String] = js.native
  /** The location which contains the job specified by job_id. */
  var location: js.UndefOr[String] = js.native
  /** The worker id, i.e., VM hostname. */
  var workerId: js.UndefOr[String] = js.native
}

object GetDebugConfigRequest {
  @scala.inline
  def apply(): GetDebugConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDebugConfigRequest]
  }
  @scala.inline
  implicit class GetDebugConfigRequestOps[Self <: GetDebugConfigRequest] (val x: Self) extends AnyVal {
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
    def setComponentId(value: String): Self = this.set("componentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentId: Self = this.set("componentId", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setWorkerId(value: String): Self = this.set("workerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerId: Self = this.set("workerId", js.undefined)
  }
  
}

