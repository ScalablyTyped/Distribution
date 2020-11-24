package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimEvent extends js.Object {
  
  var kind: js.UndefOr[String] = js.native
  
  var reason: js.UndefOr[String] = js.native
  
  var source: js.UndefOr[ClaimEventSource] = js.native
  
  var time: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var typeDetails: js.UndefOr[ClaimEventTypeDetails] = js.native
}
object ClaimEvent {
  
  @scala.inline
  def apply(): ClaimEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimEvent]
  }
  
  @scala.inline
  implicit class ClaimEventOps[Self <: ClaimEvent] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setSource(value: ClaimEventSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeDetails(value: ClaimEventTypeDetails): Self = this.set("typeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeDetails: Self = this.set("typeDetails", js.undefined)
  }
}
