package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The policy for a product.
  */
@js.native
trait SchemaProductPolicy extends StObject {
  
  /**
    * The auto-install policy for the product.
    */
  var autoInstallPolicy: js.UndefOr[SchemaAutoInstallPolicy] = js.native
  
  /**
    * The managed configuration for the product.
    */
  var managedConfiguration: js.UndefOr[SchemaManagedConfiguration] = js.native
  
  /**
    * The ID of the product. For example,
    * &quot;app:com.google.android.gm&quot;.
    */
  var productId: js.UndefOr[String] = js.native
  
  /**
    * Grants the device visibility to the specified product release track(s),
    * identified by trackIds. The list of release tracks of a product can be
    * obtained by calling Products.Get.
    */
  var trackIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Deprecated. Use trackIds instead.
    */
  var tracks: js.UndefOr[js.Array[String]] = js.native
}
object SchemaProductPolicy {
  
  @scala.inline
  def apply(): SchemaProductPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductPolicy]
  }
  
  @scala.inline
  implicit class SchemaProductPolicyMutableBuilder[Self <: SchemaProductPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoInstallPolicy(value: SchemaAutoInstallPolicy): Self = StObject.set(x, "autoInstallPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoInstallPolicyUndefined: Self = StObject.set(x, "autoInstallPolicy", js.undefined)
    
    @scala.inline
    def setManagedConfiguration(value: SchemaManagedConfiguration): Self = StObject.set(x, "managedConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedConfigurationUndefined: Self = StObject.set(x, "managedConfiguration", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setTrackIds(value: js.Array[String]): Self = StObject.set(x, "trackIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackIdsUndefined: Self = StObject.set(x, "trackIds", js.undefined)
    
    @scala.inline
    def setTrackIdsVarargs(value: String*): Self = StObject.set(x, "trackIds", js.Array(value :_*))
    
    @scala.inline
    def setTracks(value: js.Array[String]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    @scala.inline
    def setTracksVarargs(value: String*): Self = StObject.set(x, "tracks", js.Array(value :_*))
  }
}
