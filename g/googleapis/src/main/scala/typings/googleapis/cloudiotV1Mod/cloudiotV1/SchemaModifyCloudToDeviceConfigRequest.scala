package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for `ModifyCloudToDeviceConfig`.
  */
@js.native
trait SchemaModifyCloudToDeviceConfigRequest extends js.Object {
  
  /**
    * The configuration data for the device.
    */
  var binaryData: js.UndefOr[String] = js.native
  
  /**
    * The version number to update. If this value is zero, it will not check
    * the version number of the server and will always update the current
    * version; otherwise, this update will fail if the version number found on
    * the server does not match this version number. This is used to support
    * multiple simultaneous updates without losing data.
    */
  var versionToUpdate: js.UndefOr[String] = js.native
}
object SchemaModifyCloudToDeviceConfigRequest {
  
  @scala.inline
  def apply(): SchemaModifyCloudToDeviceConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyCloudToDeviceConfigRequest]
  }
  
  @scala.inline
  implicit class SchemaModifyCloudToDeviceConfigRequestOps[Self <: SchemaModifyCloudToDeviceConfigRequest] (val x: Self) extends AnyVal {
    
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
    def setBinaryData(value: String): Self = this.set("binaryData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryData: Self = this.set("binaryData", js.undefined)
    
    @scala.inline
    def setVersionToUpdate(value: String): Self = this.set("versionToUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionToUpdate: Self = this.set("versionToUpdate", js.undefined)
  }
}
