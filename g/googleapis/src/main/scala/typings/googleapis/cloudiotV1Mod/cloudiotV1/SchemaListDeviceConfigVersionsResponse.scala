package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for `ListDeviceConfigVersions`.
  */
@js.native
trait SchemaListDeviceConfigVersionsResponse extends StObject {
  
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
  implicit class SchemaListDeviceConfigVersionsResponseMutableBuilder[Self <: SchemaListDeviceConfigVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceConfigs(value: js.Array[SchemaDeviceConfig]): Self = StObject.set(x, "deviceConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceConfigsUndefined: Self = StObject.set(x, "deviceConfigs", js.undefined)
    
    @scala.inline
    def setDeviceConfigsVarargs(value: SchemaDeviceConfig*): Self = StObject.set(x, "deviceConfigs", js.Array(value :_*))
  }
}
