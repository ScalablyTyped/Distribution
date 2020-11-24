package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvideoTiming extends js.Object {
  
  var durationMs: js.UndefOr[String] = js.native
  
  var offsetMs: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object InvideoTiming {
  
  @scala.inline
  def apply(): InvideoTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvideoTiming]
  }
  
  @scala.inline
  implicit class InvideoTimingOps[Self <: InvideoTiming] (val x: Self) extends AnyVal {
    
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
    def setDurationMs(value: String): Self = this.set("durationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationMs: Self = this.set("durationMs", js.undefined)
    
    @scala.inline
    def setOffsetMs(value: String): Self = this.set("offsetMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetMs: Self = this.set("offsetMs", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
