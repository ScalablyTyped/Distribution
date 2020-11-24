package typings.doubleclickGpt.googletag.events

import typings.doubleclickGpt.googletag.Slot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotRenderEndedEvent extends Event {
  
  var advertiserId: js.UndefOr[Double] = js.native
  
  var campaignId: js.UndefOr[Double] = js.native
  
  var creativeId: js.UndefOr[Double] = js.native
  
  var isEmpty: Boolean = js.native
  
  var lineItemId: js.UndefOr[Double] = js.native
  
  var size: js.Array[Double] | String = js.native
  
  var sourceAgnosticCreativeId: js.UndefOr[Double] = js.native
  
  var sourceAgnosticLineItemId: js.UndefOr[Double] = js.native
}
object SlotRenderEndedEvent {
  
  @scala.inline
  def apply(isEmpty: Boolean, serviceName: String, size: js.Array[Double] | String, slot: Slot): SlotRenderEndedEvent = {
    val __obj = js.Dynamic.literal(isEmpty = isEmpty.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotRenderEndedEvent]
  }
  
  @scala.inline
  implicit class SlotRenderEndedEventOps[Self <: SlotRenderEndedEvent] (val x: Self) extends AnyVal {
    
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
    def setIsEmpty(value: Boolean): Self = this.set("isEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeVarargs(value: Double*): Self = this.set("size", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: js.Array[Double] | String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserId(value: Double): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setCampaignId(value: Double): Self = this.set("campaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignId: Self = this.set("campaignId", js.undefined)
    
    @scala.inline
    def setCreativeId(value: Double): Self = this.set("creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeId: Self = this.set("creativeId", js.undefined)
    
    @scala.inline
    def setLineItemId(value: Double): Self = this.set("lineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItemId: Self = this.set("lineItemId", js.undefined)
    
    @scala.inline
    def setSourceAgnosticCreativeId(value: Double): Self = this.set("sourceAgnosticCreativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceAgnosticCreativeId: Self = this.set("sourceAgnosticCreativeId", js.undefined)
    
    @scala.inline
    def setSourceAgnosticLineItemId(value: Double): Self = this.set("sourceAgnosticLineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceAgnosticLineItemId: Self = this.set("sourceAgnosticLineItemId", js.undefined)
  }
}
