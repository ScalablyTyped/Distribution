package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    autoInstallPolicy: SchemaAutoInstallPolicy = null,
    managedConfiguration: SchemaManagedConfiguration = null,
    productId: String = null,
    trackIds: js.Array[String] = null,
    tracks: js.Array[String] = null
  ): SchemaProductPolicy = {
    val __obj = js.Dynamic.literal()
    if (autoInstallPolicy != null) __obj.updateDynamic("autoInstallPolicy")(autoInstallPolicy.asInstanceOf[js.Any])
    if (managedConfiguration != null) __obj.updateDynamic("managedConfiguration")(managedConfiguration.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (trackIds != null) __obj.updateDynamic("trackIds")(trackIds.asInstanceOf[js.Any])
    if (tracks != null) __obj.updateDynamic("tracks")(tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProductPolicy]
  }
}

