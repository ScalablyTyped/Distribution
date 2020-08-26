package typings.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedColumnList extends js.Object {
  /** The saved columns being requested. */
  var items: js.UndefOr[js.Array[SavedColumn]] = js.native
  /** Identifies this as a SavedColumnList resource. Value: the fixed string doubleclicksearch#savedColumnList. */
  var kind: js.UndefOr[String] = js.native
}

object SavedColumnList {
  @scala.inline
  def apply(): SavedColumnList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavedColumnList]
  }
  @scala.inline
  implicit class SavedColumnListOps[Self <: SavedColumnList] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SavedColumn*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SavedColumn]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

