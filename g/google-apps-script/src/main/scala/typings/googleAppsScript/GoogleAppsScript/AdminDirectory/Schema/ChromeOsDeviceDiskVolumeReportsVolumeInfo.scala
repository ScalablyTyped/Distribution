package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChromeOsDeviceDiskVolumeReportsVolumeInfo extends js.Object {
  
  var storageFree: js.UndefOr[String] = js.native
  
  var storageTotal: js.UndefOr[String] = js.native
  
  var volumeId: js.UndefOr[String] = js.native
}
object ChromeOsDeviceDiskVolumeReportsVolumeInfo {
  
  @scala.inline
  def apply(): ChromeOsDeviceDiskVolumeReportsVolumeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeOsDeviceDiskVolumeReportsVolumeInfo]
  }
  
  @scala.inline
  implicit class ChromeOsDeviceDiskVolumeReportsVolumeInfoOps[Self <: ChromeOsDeviceDiskVolumeReportsVolumeInfo] (val x: Self) extends AnyVal {
    
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
    def setStorageFree(value: String): Self = this.set("storageFree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageFree: Self = this.set("storageFree", js.undefined)
    
    @scala.inline
    def setStorageTotal(value: String): Self = this.set("storageTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageTotal: Self = this.set("storageTotal", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
  }
}
