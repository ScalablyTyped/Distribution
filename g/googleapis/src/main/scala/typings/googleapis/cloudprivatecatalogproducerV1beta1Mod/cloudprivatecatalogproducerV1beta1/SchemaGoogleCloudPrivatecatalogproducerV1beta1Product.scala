package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The producer representation of a product which is a child resource of
  * `Catalog` with display metadata and a list of `Version` resources.
  */
@js.native
trait SchemaGoogleCloudPrivatecatalogproducerV1beta1Product extends js.Object {
  /**
    * Required. The type of the product asset, which cannot be changed after
    * the product is created. It supports the values
    * `google.deploymentmanager.Template` and
    * `google.cloudprivatecatalog.ListingOnly`. Other values will be rejected
    * by the server. Read only after creation.  The following fields or
    * resource types have different validation rules under each `asset_type`
    * values:  * Product.display_metadata has different validation schema for
    * each asset type value. See its comment for details. * Version resource
    * isn&#39;t allowed to be added under the
    * `google.cloudprivatecatalog.ListingOnly` type.
    */
  var assetType: js.UndefOr[String] = js.native
  /**
    * Output only. The time when the product was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The user-supplied display metadata to describe the product. The JSON
    * schema of the metadata differs by Product.asset_type. When the type is
    * `google.deploymentmanager.Template`, the schema is as follows:  ```
    * &quot;$schema&quot;: http://json-schema.org/draft-04/schema# type: object
    * properties:   name:     type: string     minLength: 1     maxLength: 64
    * description:     type: string     minLength: 1     maxLength: 2048
    * tagline:     type: string     minLength: 1     maxLength: 100
    * support_info:     type: string     minLength: 1     maxLength: 2048
    * creator:     type: string     minLength: 1     maxLength: 100
    * documentation:     type: array     items:       type: object properties:
    * url:           type: string           pattern:
    * &quot;^(https?)://[-a-zA-Z0-9+&amp;@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&amp;@#/%=~_|]&quot;
    * title:           type: string           minLength: 1           maxLength:
    * 64         description:           type: string           minLength: 1
    * maxLength: 2048 required: - name - description additionalProperties:
    * false  ```  When the asset type is
    * `google.cloudprivatecatalog.ListingOnly`, the schema is as follows:  ```
    * &quot;$schema&quot;: http://json-schema.org/draft-04/schema# type: object
    * properties:   name:     type: string     minLength: 1     maxLength: 64
    * description:     type: string     minLength: 1     maxLength: 2048
    * tagline:     type: string     minLength: 1     maxLength: 100
    * support_info:     type: string     minLength: 1     maxLength: 2048
    * creator:     type: string     minLength: 1     maxLength: 100
    * documentation:     type: array     items:       type: object properties:
    * url:           type: string           pattern:
    * &quot;^(https?)://[-a-zA-Z0-9+&amp;@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&amp;@#/%=~_|]&quot;
    * title:           type: string           minLength: 1           maxLength:
    * 64         description:           type: string           minLength: 1
    * maxLength: 2048   signup_url:     type: string     pattern:
    * &quot;^(https?)://[-a-zA-Z0-9+&amp;@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&amp;@#/%=~_|]&quot;
    * required: - name - description - signup_url additionalProperties: false
    * ```
    */
  var displayMetadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Output only. The public accessible URI of the icon uploaded by
    * PrivateCatalogProducer.UploadIcon.  If no icon is uploaded, it will be
    * the default icon&#39;s URI.
    */
  var iconUri: js.UndefOr[String] = js.native
  /**
    * Required. The resource name of the product in the format
    * `catalogs/{catalog_id}/products/a-z*[a-z0-9]&#39;.  A unique identifier
    * for the product under a catalog, which cannot be changed after the
    * product is created. The final segment of the name must between 1 and 256
    * characters in length.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The time when the product was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudPrivatecatalogproducerV1beta1Product {
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1Product = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product]
  }
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogproducerV1beta1ProductOps[Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1Product] (val x: Self) extends AnyVal {
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
    def setAssetType(value: String): Self = this.set("assetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetType: Self = this.set("assetType", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setDisplayMetadata(value: StringDictionary[js.Any]): Self = this.set("displayMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayMetadata: Self = this.set("displayMetadata", js.undefined)
    @scala.inline
    def setIconUri(value: String): Self = this.set("iconUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconUri: Self = this.set("iconUri", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
  
}

