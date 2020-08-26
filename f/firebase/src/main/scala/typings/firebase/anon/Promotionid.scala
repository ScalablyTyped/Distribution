package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.analytics.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promotionid
  extends /* key */ StringDictionary[js.Any] {
  var items: js.UndefOr[js.Array[Item]] = js.native
  var promotion_id: js.UndefOr[String] = js.native
  var promotion_name: js.UndefOr[String] = js.native
}

object Promotionid {
  @scala.inline
  def apply(): Promotionid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Promotionid]
  }
  @scala.inline
  implicit class PromotionidOps[Self <: Promotionid] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Item*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Item]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setPromotion_id(value: String): Self = this.set("promotion_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromotion_id: Self = this.set("promotion_id", js.undefined)
    @scala.inline
    def setPromotion_name(value: String): Self = this.set("promotion_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromotion_name: Self = this.set("promotion_name", js.undefined)
  }
  
}

