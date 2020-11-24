package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvideoPromotion extends js.Object {
  
  var defaultTiming: js.UndefOr[InvideoTiming] = js.native
  
  var items: js.UndefOr[js.Array[PromotedItem]] = js.native
  
  var position: js.UndefOr[InvideoPosition] = js.native
  
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
