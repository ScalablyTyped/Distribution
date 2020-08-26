package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddNamedRangeResponse extends js.Object {
  /** The named range to add. */
  var namedRange: js.UndefOr[NamedRange] = js.native
}

object AddNamedRangeResponse {
  @scala.inline
  def apply(): AddNamedRangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddNamedRangeResponse]
  }
  @scala.inline
  implicit class AddNamedRangeResponseOps[Self <: AddNamedRangeResponse] (val x: Self) extends AnyVal {
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
    def setNamedRange(value: NamedRange): Self = this.set("namedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedRange: Self = this.set("namedRange", js.undefined)
  }
  
}

