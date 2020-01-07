package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Devices resource represents a mobile device managed by the EMM and
  * belonging to a specific enterprise user.
  */
@js.native
trait Schema$Device extends js.Object {
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
  var policy: js.UndefOr[Schema$Policy] = js.native
}

object Schema$Device {
  @scala.inline
  def apply(
    androidId: String = null,
    kind: String = null,
    managementType: String = null,
    policy: Schema$Policy = null
  ): Schema$Device = {
    val __obj = js.Dynamic.literal()
    if (androidId != null) __obj.updateDynamic("androidId")(androidId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (managementType != null) __obj.updateDynamic("managementType")(managementType.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Device]
  }
}

