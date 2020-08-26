package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrimWhitespaceRequest extends js.Object {
  /** The range whose cells to trim. */
  var range: js.UndefOr[GridRange] = js.native
}

object TrimWhitespaceRequest {
  @scala.inline
  def apply(): TrimWhitespaceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrimWhitespaceRequest]
  }
  @scala.inline
  implicit class TrimWhitespaceRequestOps[Self <: TrimWhitespaceRequest] (val x: Self) extends AnyVal {
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
    def setRange(value: GridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
  
}

