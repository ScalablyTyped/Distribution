package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Devices resource represents a mobile device managed by the EMM and
  * belonging to a specific enterprise user.
  */
@js.native
trait SchemaDevice extends js.Object {
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
  implicit class SchemaDeviceOps[Self <: SchemaDevice] (val x: Self) extends AnyVal {
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
    def setAndroidId(value: String): Self = this.set("androidId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidId: Self = this.set("androidId", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setManagementType(value: String): Self = this.set("managementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagementType: Self = this.set("managementType", js.undefined)
    @scala.inline
    def setPolicy(value: SchemaPolicy): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
  
}

