package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.analytics.Item
import typings.firebase.mod.analytics.Promotion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contentid
  extends /* key */ StringDictionary[js.Any] {
  var content_id: js.UndefOr[String] = js.native
  var content_type: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[Item]] = js.native
  var promotions: js.UndefOr[js.Array[Promotion]] = js.native
}

object Contentid {
  @scala.inline
  def apply(): Contentid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contentid]
  }
  @scala.inline
  implicit class ContentidOps[Self <: Contentid] (val x: Self) extends AnyVal {
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
    def setContent_id(value: String): Self = this.set("content_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent_id: Self = this.set("content_id", js.undefined)
    @scala.inline
    def setContent_type(value: String): Self = this.set("content_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent_type: Self = this.set("content_type", js.undefined)
    @scala.inline
    def setItemsVarargs(value: Item*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Item]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setPromotionsVarargs(value: Promotion*): Self = this.set("promotions", js.Array(value :_*))
    @scala.inline
    def setPromotions(value: js.Array[Promotion]): Self = this.set("promotions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromotions: Self = this.set("promotions", js.undefined)
  }
  
}

