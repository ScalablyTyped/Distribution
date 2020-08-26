package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigateToHistoryEntryRequest extends js.Object {
  /**
    * Unique id of the entry to navigate to.
    */
  var entryId: integer = js.native
}

object NavigateToHistoryEntryRequest {
  @scala.inline
  def apply(entryId: integer): NavigateToHistoryEntryRequest = {
    val __obj = js.Dynamic.literal(entryId = entryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToHistoryEntryRequest]
  }
  @scala.inline
  implicit class NavigateToHistoryEntryRequestOps[Self <: NavigateToHistoryEntryRequest] (val x: Self) extends AnyVal {
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
    def setEntryId(value: integer): Self = this.set("entryId", value.asInstanceOf[js.Any])
  }
  
}

