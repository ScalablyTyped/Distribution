package typings.devtoolsProtocol.mod.Protocol.DOMStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDOMStorageItemsResponse extends js.Object {
  var entries: js.Array[Item] = js.native
}

object GetDOMStorageItemsResponse {
  @scala.inline
  def apply(entries: js.Array[Item]): GetDOMStorageItemsResponse = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDOMStorageItemsResponse]
  }
  @scala.inline
  implicit class GetDOMStorageItemsResponseOps[Self <: GetDOMStorageItemsResponse] (val x: Self) extends AnyVal {
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
    def setEntriesVarargs(value: Item*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[Item]): Self = this.set("entries", value.asInstanceOf[js.Any])
  }
  
}

