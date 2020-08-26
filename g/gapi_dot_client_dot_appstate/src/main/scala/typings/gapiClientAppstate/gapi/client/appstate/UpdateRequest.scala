package typings.gapiClientAppstate.gapi.client.appstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRequest extends js.Object {
  /** The new app state data that your application is trying to update with. */
  var data: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string appstate#updateRequest. */
  var kind: js.UndefOr[String] = js.native
}

object UpdateRequest {
  @scala.inline
  def apply(): UpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRequest]
  }
  @scala.inline
  implicit class UpdateRequestOps[Self <: UpdateRequest] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

