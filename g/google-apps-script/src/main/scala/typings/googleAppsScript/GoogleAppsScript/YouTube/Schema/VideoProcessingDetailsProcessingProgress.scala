package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoProcessingDetailsProcessingProgress extends js.Object {
  
  var partsProcessed: js.UndefOr[String] = js.native
  
  var partsTotal: js.UndefOr[String] = js.native
  
  var timeLeftMs: js.UndefOr[String] = js.native
}
object VideoProcessingDetailsProcessingProgress {
  
  @scala.inline
  def apply(): VideoProcessingDetailsProcessingProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoProcessingDetailsProcessingProgress]
  }
  
  @scala.inline
  implicit class VideoProcessingDetailsProcessingProgressOps[Self <: VideoProcessingDetailsProcessingProgress] (val x: Self) extends AnyVal {
    
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
    def setPartsProcessed(value: String): Self = this.set("partsProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartsProcessed: Self = this.set("partsProcessed", js.undefined)
    
    @scala.inline
    def setPartsTotal(value: String): Self = this.set("partsTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartsTotal: Self = this.set("partsTotal", js.undefined)
    
    @scala.inline
    def setTimeLeftMs(value: String): Self = this.set("timeLeftMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeLeftMs: Self = this.set("timeLeftMs", js.undefined)
  }
}
