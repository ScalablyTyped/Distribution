package typings.googleapis.buildSrcApisCloudprivatecatalogV1beta1Mod.cloudprivatecatalog_v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The readonly representation of a product computed with a given resource
  * context.
  */
@js.native
trait Schema$GoogleCloudPrivatecatalogV1beta1Product extends js.Object {
  /**
    * Output only. The type of the product asset. It can be one of the
    * following values:  * `google.deploymentmanager.Template` *
    * `google.cloudprivatecatalog.ListingOnly`
    */
  var assetType: js.UndefOr[String] = js.native
  /**
    * Output only. The time when the product was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The display metadata to describe the product. The JSON
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
    * Output only. The icon URI of the product.
    */
  var iconUri: js.UndefOr[String] = js.native
  /**
    * Output only. The resource name of the target product, in the format of
    * `products/a-z*[a-z0-9]&#39;.  A unique identifier for the product under a
    * catalog.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The time when the product was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudPrivatecatalogV1beta1Product {
  @scala.inline
  def apply(
    assetType: String = null,
    createTime: String = null,
    displayMetadata: StringDictionary[js.Any] = null,
    iconUri: String = null,
    name: String = null,
    updateTime: String = null
  ): Schema$GoogleCloudPrivatecatalogV1beta1Product = {
    val __obj = js.Dynamic.literal()
    if (assetType != null) __obj.updateDynamic("assetType")(assetType.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (displayMetadata != null) __obj.updateDynamic("displayMetadata")(displayMetadata.asInstanceOf[js.Any])
    if (iconUri != null) __obj.updateDynamic("iconUri")(iconUri.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudPrivatecatalogV1beta1Product]
  }
}

