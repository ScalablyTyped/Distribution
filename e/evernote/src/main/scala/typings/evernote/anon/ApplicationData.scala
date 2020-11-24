package typings.evernote.anon

import typings.evernote.mod.Types.LazyMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationData extends js.Object {
  
  var altitude: js.UndefOr[Double] = js.native
  
  var applicationData: js.UndefOr[LazyMap] = js.native
  
  var attachment: js.UndefOr[Boolean] = js.native
  
  var cameraMake: js.UndefOr[String] = js.native
  
  var cameraModel: js.UndefOr[String] = js.native
  
  var clientWillIndex: js.UndefOr[Boolean] = js.native
  
  var fileName: js.UndefOr[String] = js.native
  
  var latitude: js.UndefOr[Double] = js.native
  
  var longitude: js.UndefOr[Double] = js.native
  
  var recoType: js.UndefOr[String] = js.native
  
  var sourceURL: js.UndefOr[String] = js.native
  
  var timestamp: js.UndefOr[Double] = js.native
}
object ApplicationData {
  
  @scala.inline
  def apply(): ApplicationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationData]
  }
  
  @scala.inline
  implicit class ApplicationDataOps[Self <: ApplicationData] (val x: Self) extends AnyVal {
    
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
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    
    @scala.inline
    def setApplicationData(value: LazyMap): Self = this.set("applicationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationData: Self = this.set("applicationData", js.undefined)
    
    @scala.inline
    def setAttachment(value: Boolean): Self = this.set("attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachment: Self = this.set("attachment", js.undefined)
    
    @scala.inline
    def setCameraMake(value: String): Self = this.set("cameraMake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCameraMake: Self = this.set("cameraMake", js.undefined)
    
    @scala.inline
    def setCameraModel(value: String): Self = this.set("cameraModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCameraModel: Self = this.set("cameraModel", js.undefined)
    
    @scala.inline
    def setClientWillIndex(value: Boolean): Self = this.set("clientWillIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientWillIndex: Self = this.set("clientWillIndex", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    
    @scala.inline
    def setRecoType(value: String): Self = this.set("recoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecoType: Self = this.set("recoType", js.undefined)
    
    @scala.inline
    def setSourceURL(value: String): Self = this.set("sourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceURL: Self = this.set("sourceURL", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
}
