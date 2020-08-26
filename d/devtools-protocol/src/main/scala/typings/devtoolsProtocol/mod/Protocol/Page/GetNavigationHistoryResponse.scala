package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNavigationHistoryResponse extends js.Object {
  /**
    * Index of the current navigation history entry.
    */
  var currentIndex: integer = js.native
  /**
    * Array of navigation history entries.
    */
  var entries: js.Array[NavigationEntry] = js.native
}

object GetNavigationHistoryResponse {
  @scala.inline
  def apply(currentIndex: integer, entries: js.Array[NavigationEntry]): GetNavigationHistoryResponse = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNavigationHistoryResponse]
  }
  @scala.inline
  implicit class GetNavigationHistoryResponseOps[Self <: GetNavigationHistoryResponse] (val x: Self) extends AnyVal {
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
    def setCurrentIndex(value: integer): Self = this.set("currentIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntriesVarargs(value: NavigationEntry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[NavigationEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
  }
  
}

