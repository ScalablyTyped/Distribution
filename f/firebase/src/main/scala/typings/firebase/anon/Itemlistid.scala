package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.analytics.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Itemlistid
  extends /* key */ StringDictionary[js.Any] {
  var item_list_id: js.UndefOr[String] = js.native
  var item_list_name: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[Item]] = js.native
}

object Itemlistid {
  @scala.inline
  def apply(): Itemlistid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Itemlistid]
  }
  @scala.inline
  implicit class ItemlistidOps[Self <: Itemlistid] (val x: Self) extends AnyVal {
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
    def setItem_list_id(value: String): Self = this.set("item_list_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem_list_id: Self = this.set("item_list_id", js.undefined)
    @scala.inline
    def setItem_list_name(value: String): Self = this.set("item_list_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem_list_name: Self = this.set("item_list_name", js.undefined)
    @scala.inline
    def setItemsVarargs(value: Item*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Item]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

