package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The policy for a product.
  */
@js.native
trait SchemaProductPolicy extends js.Object {
  
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
  implicit class SchemaProductPolicyOps[Self <: SchemaProductPolicy] (val x: Self) extends AnyVal {
    
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
    def setAutoInstallPolicy(value: SchemaAutoInstallPolicy): Self = this.set("autoInstallPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoInstallPolicy: Self = this.set("autoInstallPolicy", js.undefined)
    
    @scala.inline
    def setManagedConfiguration(value: SchemaManagedConfiguration): Self = this.set("managedConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedConfiguration: Self = this.set("managedConfiguration", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setTrackIdsVarargs(value: String*): Self = this.set("trackIds", js.Array(value :_*))
    
    @scala.inline
    def setTrackIds(value: js.Array[String]): Self = this.set("trackIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackIds: Self = this.set("trackIds", js.undefined)
    
    @scala.inline
    def setTracksVarargs(value: String*): Self = this.set("tracks", js.Array(value :_*))
    
    @scala.inline
    def setTracks(value: js.Array[String]): Self = this.set("tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracks: Self = this.set("tracks", js.undefined)
  }
}
