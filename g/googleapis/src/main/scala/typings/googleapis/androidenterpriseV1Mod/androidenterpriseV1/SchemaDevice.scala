package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Devices resource represents a mobile device managed by the EMM and
  * belonging to a specific enterprise user.
  */
@js.native
trait SchemaDevice extends StObject {
  
  /**
    * The Google Play Services Android ID for the device encoded as a lowercase
    * hex string. For example, &quot;123456789abcdef0&quot;.
    */
  var androidId: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#device&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Identifies the extent to which the device is controlled by a managed
    * Google Play EMM in various deployment configurations.  Possible values
    * include:  - &quot;managedDevice&quot;, a device that has the EMM&#39;s
    * device policy controller (DPC) as the device owner.  -
    * &quot;managedProfile&quot;, a device that has a profile managed by the
    * DPC (DPC is profile owner) in addition to a separate, personal profile
    * that is unavailable to the DPC.  - &quot;containerApp&quot;, no longer
    * used (deprecated).  - &quot;unmanagedProfile&quot;, a device that has
    * been allowed (by the domain&#39;s admin, using the Admin Console to
    * enable the privilege) to use managed Google Play, but the profile is
    * itself not owned by a DPC.
    */
  var managementType: js.UndefOr[String] = js.native
  
  /**
    * The policy enforced on the device.
    */
  var policy: js.UndefOr[SchemaPolicy] = js.native
}
object SchemaDevice {
  
  @scala.inline
  def apply(): SchemaDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDevice]
  }
  
  @scala.inline
  implicit class SchemaDeviceMutableBuilder[Self <: SchemaDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidId(value: String): Self = StObject.set(x, "androidId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidIdUndefined: Self = StObject.set(x, "androidId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setManagementType(value: String): Self = StObject.set(x, "managementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagementTypeUndefined: Self = StObject.set(x, "managementType", js.undefined)
    
    @scala.inline
    def setPolicy(value: SchemaPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
