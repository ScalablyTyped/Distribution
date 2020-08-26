package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddDimensionGroupRequest extends js.Object {
  /** The range over which to create a group. */
  var range: js.UndefOr[DimensionRange] = js.native
}

object AddDimensionGroupRequest {
  @scala.inline
  def apply(): AddDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddDimensionGroupRequest]
  }
  @scala.inline
  implicit class AddDimensionGroupRequestOps[Self <: AddDimensionGroupRequest] (val x: Self) extends AnyVal {
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
    def setRange(value: DimensionRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
  
}

