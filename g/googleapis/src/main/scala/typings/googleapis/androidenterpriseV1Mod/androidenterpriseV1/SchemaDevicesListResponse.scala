package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The device resources for the user.
  */
@js.native
trait SchemaDevicesListResponse extends StObject {
  
  /**
    * A managed device.
    */
  var device: js.UndefOr[js.Array[SchemaDevice]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#devicesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaDevicesListResponse {
  
  @scala.inline
  def apply(): SchemaDevicesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDevicesListResponse]
  }
  
  @scala.inline
  implicit class SchemaDevicesListResponseMutableBuilder[Self <: SchemaDevicesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: js.Array[SchemaDevice]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setDeviceVarargs(value: SchemaDevice*): Self = StObject.set(x, "device", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
