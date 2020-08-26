package typings.gapiClientCloudtrace.gapi.client.cloudtrace

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudtrace.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpansResource extends js.Object {
  /** Creates a new Span. */
  def create(request: Accesstoken): Request[Span] = js.native
}

object SpansResource {
  @scala.inline
  def apply(create: Accesstoken => Request[Span]): SpansResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[SpansResource]
  }
  @scala.inline
  implicit class SpansResourceOps[Self <: SpansResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Accesstoken => Request[Span]): Self = this.set("create", js.Any.fromFunction1(value))
  }
  
}

