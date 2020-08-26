package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGmail.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentsResource extends js.Object {
  /** Gets the specified message attachment. */
  def get(request: Id): Request[MessagePartBody] = js.native
}

object AttachmentsResource {
  @scala.inline
  def apply(get: Id => Request[MessagePartBody]): AttachmentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[AttachmentsResource]
  }
  @scala.inline
  implicit class AttachmentsResourceOps[Self <: AttachmentsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Id => Request[MessagePartBody]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

