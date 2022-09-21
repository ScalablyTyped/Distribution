package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductPolicy extends StObject {
  
  /**
    * The auto-install policy for the product.
    */
  var autoInstallPolicy: js.UndefOr[SchemaAutoInstallPolicy] = js.undefined
  
  /**
    * The auto-update mode for the product.
    */
  var autoUpdateMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An authentication URL configuration for the authenticator app of an identity provider. This helps to launch the identity provider's authenticator app during the authentication happening in a private app using Android WebView. Authenticator app should already be the [default handler](https://developer.android.com/training/app-links/verify-site-associations) for the authentication url on the device.
    */
  var enterpriseAuthenticationAppLinkConfigs: js.UndefOr[js.Array[SchemaEnterpriseAuthenticationAppLinkConfig]] = js.undefined
  
  /**
    * The managed configuration for the product.
    */
  var managedConfiguration: js.UndefOr[SchemaManagedConfiguration] = js.undefined
  
  /**
    * The ID of the product. For example, "app:com.google.android.gm".
    */
  var productId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Grants the device visibility to the specified product release track(s), identified by trackIds. The list of release tracks of a product can be obtained by calling Products.Get.
    */
  var trackIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Deprecated. Use trackIds instead.
    */
  var tracks: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaProductPolicy {
  
  inline def apply(): SchemaProductPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductPolicy]
  }
  
  extension [Self <: SchemaProductPolicy](x: Self) {
    
    inline def setAutoInstallPolicy(value: SchemaAutoInstallPolicy): Self = StObject.set(x, "autoInstallPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoInstallPolicyUndefined: Self = StObject.set(x, "autoInstallPolicy", js.undefined)
    
    inline def setAutoUpdateMode(value: String): Self = StObject.set(x, "autoUpdateMode", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateModeNull: Self = StObject.set(x, "autoUpdateMode", null)
    
    inline def setAutoUpdateModeUndefined: Self = StObject.set(x, "autoUpdateMode", js.undefined)
    
    inline def setEnterpriseAuthenticationAppLinkConfigs(value: js.Array[SchemaEnterpriseAuthenticationAppLinkConfig]): Self = StObject.set(x, "enterpriseAuthenticationAppLinkConfigs", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseAuthenticationAppLinkConfigsUndefined: Self = StObject.set(x, "enterpriseAuthenticationAppLinkConfigs", js.undefined)
    
    inline def setEnterpriseAuthenticationAppLinkConfigsVarargs(value: SchemaEnterpriseAuthenticationAppLinkConfig*): Self = StObject.set(x, "enterpriseAuthenticationAppLinkConfigs", js.Array(value*))
    
    inline def setManagedConfiguration(value: SchemaManagedConfiguration): Self = StObject.set(x, "managedConfiguration", value.asInstanceOf[js.Any])
    
    inline def setManagedConfigurationUndefined: Self = StObject.set(x, "managedConfiguration", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setTrackIds(value: js.Array[String]): Self = StObject.set(x, "trackIds", value.asInstanceOf[js.Any])
    
    inline def setTrackIdsNull: Self = StObject.set(x, "trackIds", null)
    
    inline def setTrackIdsUndefined: Self = StObject.set(x, "trackIds", js.undefined)
    
    inline def setTrackIdsVarargs(value: String*): Self = StObject.set(x, "trackIds", js.Array(value*))
    
    inline def setTracks(value: js.Array[String]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksNull: Self = StObject.set(x, "tracks", null)
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: String*): Self = StObject.set(x, "tracks", js.Array(value*))
  }
}
