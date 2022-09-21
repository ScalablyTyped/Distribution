package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDpc extends StObject {
  
  /**
    * Output only. The title of the DPC app in Google Play. For example, _Google Apps Device Policy_. Useful in an application's user interface.
    */
  var dpcName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The API resource name in the format `customers/[CUSTOMER_ID]/dpcs/[DPC_ID]`. Assigned by the server. To maintain a reference to a DPC across customer accounts, persist and match the last path component (`DPC_ID`).
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The DPC's Android application ID that looks like a Java package name. Zero-touch enrollment installs the DPC app onto a device using this identifier.
    */
  var packageName: js.UndefOr[String | Null] = js.undefined
}
object SchemaDpc {
  
  inline def apply(): SchemaDpc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDpc]
  }
  
  extension [Self <: SchemaDpc](x: Self) {
    
    inline def setDpcName(value: String): Self = StObject.set(x, "dpcName", value.asInstanceOf[js.Any])
    
    inline def setDpcNameNull: Self = StObject.set(x, "dpcName", null)
    
    inline def setDpcNameUndefined: Self = StObject.set(x, "dpcName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
