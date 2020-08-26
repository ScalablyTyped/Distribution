package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitConfigSourceResponse extends js.Object {
  /** The generated service configuration. */
  var serviceConfig: js.UndefOr[Service] = js.native
}

object SubmitConfigSourceResponse {
  @scala.inline
  def apply(): SubmitConfigSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitConfigSourceResponse]
  }
  @scala.inline
  implicit class SubmitConfigSourceResponseOps[Self <: SubmitConfigSourceResponse] (val x: Self) extends AnyVal {
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
    def setServiceConfig(value: Service): Self = this.set("serviceConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceConfig: Self = this.set("serviceConfig", js.undefined)
  }
  
}

