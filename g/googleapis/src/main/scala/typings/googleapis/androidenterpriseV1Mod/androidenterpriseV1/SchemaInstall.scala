package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstall extends StObject {
  
  /**
    * Install state. The state "installPending" means that an install request has recently been made and download to the device is in progress. The state "installed" means that the app has been installed. This field is read-only.
    */
  var installState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the product that the install is for. For example, "app:com.google.android.gm".
    */
  var productId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version of the installed product. Guaranteed to be set only if the install state is "installed".
    */
  var versionCode: js.UndefOr[Double | Null] = js.undefined
}
object SchemaInstall {
  
  inline def apply(): SchemaInstall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstall]
  }
  
  extension [Self <: SchemaInstall](x: Self) {
    
    inline def setInstallState(value: String): Self = StObject.set(x, "installState", value.asInstanceOf[js.Any])
    
    inline def setInstallStateNull: Self = StObject.set(x, "installState", null)
    
    inline def setInstallStateUndefined: Self = StObject.set(x, "installState", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    inline def setVersionCodeNull: Self = StObject.set(x, "versionCode", null)
    
    inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
  }
}
