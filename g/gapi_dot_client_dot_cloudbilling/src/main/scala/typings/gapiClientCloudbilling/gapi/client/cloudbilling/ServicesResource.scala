package typings.gapiClientCloudbilling.gapi.client.cloudbilling

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudbilling.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServicesResource extends js.Object {
  var skus: SkusResource = js.native
  /** Lists all public cloud services. */
  def list(request: Bearertoken): Request[ListServicesResponse] = js.native
}

object ServicesResource {
  @scala.inline
  def apply(list: Bearertoken => Request[ListServicesResponse], skus: SkusResource): ServicesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), skus = skus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicesResource]
  }
  @scala.inline
  implicit class ServicesResourceOps[Self <: ServicesResource] (val x: Self) extends AnyVal {
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
    def setList(value: Bearertoken => Request[ListServicesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setSkus(value: SkusResource): Self = this.set("skus", value.asInstanceOf[js.Any])
  }
  
}

