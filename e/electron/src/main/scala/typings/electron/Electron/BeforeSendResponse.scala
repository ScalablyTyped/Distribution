package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeSendResponse extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.native
  /**
    * When provided, request will be made with these headers.
    */
  var requestHeaders: js.UndefOr[Record[String, String | js.Array[String]]] = js.native
}

object BeforeSendResponse {
  @scala.inline
  def apply(): BeforeSendResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeSendResponse]
  }
  @scala.inline
  implicit class BeforeSendResponseOps[Self <: BeforeSendResponse] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setRequestHeaders(value: Record[String, String | js.Array[String]]): Self = this.set("requestHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestHeaders: Self = this.set("requestHeaders", js.undefined)
  }
  
}

