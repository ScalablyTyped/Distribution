package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoRecordingDetails extends js.Object {
  
  var location: js.UndefOr[GeoPoint] = js.native
  
  var locationDescription: js.UndefOr[String] = js.native
  
  var recordingDate: js.UndefOr[String] = js.native
}
object VideoRecordingDetails {
  
  @scala.inline
  def apply(): VideoRecordingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoRecordingDetails]
  }
  
  @scala.inline
  implicit class VideoRecordingDetailsOps[Self <: VideoRecordingDetails] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: GeoPoint): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLocationDescription(value: String): Self = this.set("locationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationDescription: Self = this.set("locationDescription", js.undefined)
    
    @scala.inline
    def setRecordingDate(value: String): Self = this.set("recordingDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordingDate: Self = this.set("recordingDate", js.undefined)
  }
}
