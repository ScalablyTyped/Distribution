package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The managed configuration resources for the device.
  */
@js.native
trait SchemaManagedConfigurationsForDeviceListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#managedConfigurationsForDeviceListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A managed configuration for an app on a specific device.
    */
  var managedConfigurationForDevice: js.UndefOr[js.Array[SchemaManagedConfiguration]] = js.native
}
object SchemaManagedConfigurationsForDeviceListResponse {
  
  @scala.inline
  def apply(): SchemaManagedConfigurationsForDeviceListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedConfigurationsForDeviceListResponse]
  }
  
  @scala.inline
  implicit class SchemaManagedConfigurationsForDeviceListResponseMutableBuilder[Self <: SchemaManagedConfigurationsForDeviceListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setManagedConfigurationForDevice(value: js.Array[SchemaManagedConfiguration]): Self = StObject.set(x, "managedConfigurationForDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedConfigurationForDeviceUndefined: Self = StObject.set(x, "managedConfigurationForDevice", js.undefined)
    
    @scala.inline
    def setManagedConfigurationForDeviceVarargs(value: SchemaManagedConfiguration*): Self = StObject.set(x, "managedConfigurationForDevice", js.Array(value :_*))
  }
}
