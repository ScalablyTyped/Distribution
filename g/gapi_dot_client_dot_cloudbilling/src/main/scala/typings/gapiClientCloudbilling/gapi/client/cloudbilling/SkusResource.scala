package typings.gapiClientCloudbilling.gapi.client.cloudbilling

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudbilling.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkusResource extends js.Object {
  /** Lists all publicly available SKUs for a given cloud service. */
  def list(request: Callback): Request[ListSkusResponse] = js.native
}

object SkusResource {
  @scala.inline
  def apply(list: Callback => Request[ListSkusResponse]): SkusResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SkusResource]
  }
  @scala.inline
  implicit class SkusResourceOps[Self <: SkusResource] (val x: Self) extends AnyVal {
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
    def setList(value: Callback => Request[ListSkusResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

