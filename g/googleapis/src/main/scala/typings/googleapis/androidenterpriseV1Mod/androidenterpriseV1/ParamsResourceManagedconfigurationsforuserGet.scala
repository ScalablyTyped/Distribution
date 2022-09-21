package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagedconfigurationsforuserGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the managed configuration (a product ID), e.g. "app:com.google.android.gm".
    */
  var managedConfigurationForUserId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagedconfigurationsforuserGet {
  
  inline def apply(): ParamsResourceManagedconfigurationsforuserGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagedconfigurationsforuserGet]
  }
  
  extension [Self <: ParamsResourceManagedconfigurationsforuserGet](x: Self) {
    
    inline def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseIdUndefined: Self = StObject.set(x, "enterpriseId", js.undefined)
    
    inline def setManagedConfigurationForUserId(value: String): Self = StObject.set(x, "managedConfigurationForUserId", value.asInstanceOf[js.Any])
    
    inline def setManagedConfigurationForUserIdUndefined: Self = StObject.set(x, "managedConfigurationForUserId", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
