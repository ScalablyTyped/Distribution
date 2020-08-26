package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserStatesResponse extends js.Object {
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.native
  /** User's states. */
  var userStates: js.UndefOr[js.Array[String]] = js.native
}

object ListUserStatesResponse {
  @scala.inline
  def apply(): ListUserStatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserStatesResponse]
  }
  @scala.inline
  implicit class ListUserStatesResponseOps[Self <: ListUserStatesResponse] (val x: Self) extends AnyVal {
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
    def setResponseMetadata(value: ResponseMetadata): Self = this.set("responseMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseMetadata: Self = this.set("responseMetadata", js.undefined)
    @scala.inline
    def setUserStatesVarargs(value: String*): Self = this.set("userStates", js.Array(value :_*))
    @scala.inline
    def setUserStates(value: js.Array[String]): Self = this.set("userStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserStates: Self = this.set("userStates", js.undefined)
  }
  
}

