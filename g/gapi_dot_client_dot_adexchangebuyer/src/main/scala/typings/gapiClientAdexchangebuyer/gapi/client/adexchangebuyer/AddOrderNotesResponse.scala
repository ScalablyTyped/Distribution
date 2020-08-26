package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddOrderNotesResponse extends js.Object {
  var notes: js.UndefOr[js.Array[MarketplaceNote]] = js.native
}

object AddOrderNotesResponse {
  @scala.inline
  def apply(): AddOrderNotesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOrderNotesResponse]
  }
  @scala.inline
  implicit class AddOrderNotesResponseOps[Self <: AddOrderNotesResponse] (val x: Self) extends AnyVal {
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
    def setNotesVarargs(value: MarketplaceNote*): Self = this.set("notes", js.Array(value :_*))
    @scala.inline
    def setNotes(value: js.Array[MarketplaceNote]): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
  }
  
}

