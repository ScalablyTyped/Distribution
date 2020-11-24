package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for `ListDeviceConfigVersions`.
  */
@js.native
trait SchemaListDeviceConfigVersionsResponse extends js.Object {
  
  /**
    * The device configuration for the last few versions. Versions are listed
    * in decreasing order, starting from the most recent one.
    */
  var deviceConfigs: js.UndefOr[js.Array[SchemaDeviceConfig]] = js.native
}
object SchemaListDeviceConfigVersionsResponse {
  
  @scala.inline
  def apply(): SchemaListDeviceConfigVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDeviceConfigVersionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListDeviceConfigVersionsResponseOps[Self <: SchemaListDeviceConfigVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setDeviceConfigsVarargs(value: SchemaDeviceConfig*): Self = this.set("deviceConfigs", js.Array(value :_*))
    
    @scala.inline
    def setDeviceConfigs(value: js.Array[SchemaDeviceConfig]): Self = this.set("deviceConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceConfigs: Self = this.set("deviceConfigs", js.undefined)
  }
}
