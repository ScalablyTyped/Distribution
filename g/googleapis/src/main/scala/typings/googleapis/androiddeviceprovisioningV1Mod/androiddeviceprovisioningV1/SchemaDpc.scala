package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An EMM&#39;s DPC ([device policy
  * controller](http://developer.android.com/work/dpc/build-dpc.html)).
  * Zero-touch enrollment installs a DPC (listed in the `Configuration`) on a
  * device to maintain the customer&#39;s mobile policies. All the DPCs listed
  * by the API support zero-touch enrollment and are available in Google Play.
  */
@js.native
trait SchemaDpc extends StObject {
  
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
  implicit class SchemaDpcMutableBuilder[Self <: SchemaDpc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDpcName(value: String): Self = StObject.set(x, "dpcName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpcNameUndefined: Self = StObject.set(x, "dpcName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
