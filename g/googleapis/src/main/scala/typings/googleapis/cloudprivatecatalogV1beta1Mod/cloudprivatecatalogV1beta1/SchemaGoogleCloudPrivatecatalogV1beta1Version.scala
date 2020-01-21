package typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The consumer representation of a version which is a child resource under a
  * `Product` with asset data.
  */
@js.native
trait SchemaGoogleCloudPrivatecatalogV1beta1Version extends js.Object {
  /**
    * Output only. The asset which has been validated and is ready to be
    * provisioned. See google.cloud.privatecatalogproducer.v1beta.Version.asset
    * for details.
    */
  var asset: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Output only. The time when the version was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The user-supplied description of the version. Maximum of 256
    * characters.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Output only. The resource name of the version, in the format
    * `catalogs/{catalog_id}/products/{product_id}/versions/a-z*[a-z0-9]&#39;.
    * A unique identifier for the version under a product.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The time when the version was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudPrivatecatalogV1beta1Version {
  @scala.inline
  def apply(
    asset: StringDictionary[js.Any] = null,
    createTime: String = null,
    description: String = null,
    name: String = null,
    updateTime: String = null
  ): SchemaGoogleCloudPrivatecatalogV1beta1Version = {
    val __obj = js.Dynamic.literal()
    if (asset != null) __obj.updateDynamic("asset")(asset.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogV1beta1Version]
  }
}

