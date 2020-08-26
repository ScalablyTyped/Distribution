package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

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
trait SchemaDpc extends js.Object {
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

object SchemaDpc {
  @scala.inline
  def apply(): SchemaDpc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDpc]
  }
  @scala.inline
  implicit class SchemaDpcOps[Self <: SchemaDpc] (val x: Self) extends AnyVal {
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
    def setDpcName(value: String): Self = this.set("dpcName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDpcName: Self = this.set("dpcName", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
  }
  
}

