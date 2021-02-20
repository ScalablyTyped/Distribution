package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for `ModifyCloudToDeviceConfig`.
  */
@js.native
trait SchemaModifyCloudToDeviceConfigRequest extends StObject {
  
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
  implicit class SchemaModifyCloudToDeviceConfigRequestMutableBuilder[Self <: SchemaModifyCloudToDeviceConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryData(value: String): Self = StObject.set(x, "binaryData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryDataUndefined: Self = StObject.set(x, "binaryData", js.undefined)
    
    @scala.inline
    def setVersionToUpdate(value: String): Self = StObject.set(x, "versionToUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionToUpdateUndefined: Self = StObject.set(x, "versionToUpdate", js.undefined)
  }
}
