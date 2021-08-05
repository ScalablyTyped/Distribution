package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The policy for a product.
  */
trait SchemaProductPolicy extends StObject {
  
  /**
    * The auto-install policy for the product.
    */
  var autoInstallPolicy: js.UndefOr[SchemaAutoInstallPolicy] = js.undefined
  
  /**
    * The managed configuration for the product.
    */
  var managedConfiguration: js.UndefOr[SchemaManagedConfiguration] = js.undefined
  
  /**
    * The ID of the product. For example,
    * &quot;app:com.google.android.gm&quot;.
    */
  var productId: js.UndefOr[String] = js.undefined
  
  /**
    * Grants the device visibility to the specified product release track(s),
    * identified by trackIds. The list of release tracks of a product can be
    * obtained by calling Products.Get.
    */
  var trackIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Deprecated. Use trackIds instead.
    */
  var tracks: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaProductPolicy {
  
  inline def apply(): SchemaProductPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductPolicy]
  }
  
  extension [Self <: SchemaProductPolicy](x: Self) {
    
    inline def setAutoInstallPolicy(value: SchemaAutoInstallPolicy): Self = StObject.set(x, "autoInstallPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoInstallPolicyUndefined: Self = StObject.set(x, "autoInstallPolicy", js.undefined)
    
    inline def setManagedConfiguration(value: SchemaManagedConfiguration): Self = StObject.set(x, "managedConfiguration", value.asInstanceOf[js.Any])
    
    inline def setManagedConfigurationUndefined: Self = StObject.set(x, "managedConfiguration", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setTrackIds(value: js.Array[String]): Self = StObject.set(x, "trackIds", value.asInstanceOf[js.Any])
    
    inline def setTrackIdsUndefined: Self = StObject.set(x, "trackIds", js.undefined)
    
    inline def setTrackIdsVarargs(value: String*): Self = StObject.set(x, "trackIds", js.Array(value :_*))
    
    inline def setTracks(value: js.Array[String]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: String*): Self = StObject.set(x, "tracks", js.Array(value :_*))
  }
}
