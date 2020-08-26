package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvideoPromotion extends js.Object {
  /** The default temporal position within the video where the promoted item will be displayed. Can be overriden by more specific timing in the item. */
  var defaultTiming: js.UndefOr[InvideoTiming] = js.native
  /** List of promoted items in decreasing priority. */
  var items: js.UndefOr[js.Array[PromotedItem]] = js.native
  /** The spatial position within the video where the promoted item will be displayed. */
  var position: js.UndefOr[InvideoPosition] = js.native
  /**
    * Indicates whether the channel's promotional campaign uses "smart timing." This feature attempts to show promotions at a point in the video when they
    * are more likely to be clicked and less likely to disrupt the viewing experience. This feature also picks up a single promotion to show on each video.
    */
  var useSmartTiming: js.UndefOr[Boolean] = js.native
}

object InvideoPromotion {
  @scala.inline
  def apply(): InvideoPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvideoPromotion]
  }
  @scala.inline
  implicit class InvideoPromotionOps[Self <: InvideoPromotion] (val x: Self) extends AnyVal {
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
    def setDefaultTiming(value: InvideoTiming): Self = this.set("defaultTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTiming: Self = this.set("defaultTiming", js.undefined)
    @scala.inline
    def setItemsVarargs(value: PromotedItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[PromotedItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setPosition(value: InvideoPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setUseSmartTiming(value: Boolean): Self = this.set("useSmartTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSmartTiming: Self = this.set("useSmartTiming", js.undefined)
  }
  
}

