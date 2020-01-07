package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An EMM&#39;s DPC ([device policy
  * controller](http://developer.android.com/work/dpc/build-dpc.html)).
  * Zero-touch enrollment installs a DPC (listed in the `Configuration`) on a
  * device to maintain the customer&#39;s mobile policies. All the DPCs listed
  * by the API support zero-touch enrollment and are available in Google Play.
  */
@js.native
trait Schema$Dpc extends js.Object {
  /**
    * Output only. The title of the DPC app in Google Play. For example,
    * _Google Apps Device Policy_. Useful in an application&#39;s user
    * interface.
    */
  var dpcName: js.UndefOr[String] = js.native
  /**
    * Output only. The API resource name in the format
    * `customers/[CUSTOMER_ID]/dpcs/[DPC_ID]`. Assigned by the server. To
    * maintain a reference to a DPC across customer accounts, persist and match
    * the last path component (`DPC_ID`).
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The DPC&#39;s Android application ID that looks like a Java
    * package name. Zero-touch enrollment installs the DPC app onto a device
    * using this identifier.
    */
  var packageName: js.UndefOr[String] = js.native
}

object Schema$Dpc {
  @scala.inline
  def apply(dpcName: String = null, name: String = null, packageName: String = null): Schema$Dpc = {
    val __obj = js.Dynamic.literal()
    if (dpcName != null) __obj.updateDynamic("dpcName")(dpcName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Dpc]
  }
}

