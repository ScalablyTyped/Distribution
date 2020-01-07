package typings.googleapis.buildSrcApisCloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducer_v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The producer representation of a version, which is a child resource under a
  * `Product` with asset data.
  */
@js.native
trait Schema$GoogleCloudPrivatecatalogproducerV1beta1Version extends js.Object {
  /**
    * Output only. The asset which has been validated and is ready to be
    * provisioned. See Version.original_asset for the schema.
    */
  var asset: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Output only. The time when the version was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The user-supplied description of the version. Maximum of 256 characters.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Required. The resource name of the version, in the format
    * `catalogs/{catalog_id}/products/{product_id}/versions/a-z*[a-z0-9]&#39;.
    * A unique identifier for the version under a product, which can&#39;t be
    * changed after the version is created. The final segment of the name must
    * between 1 and 63 characters in length.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The user-supplied asset payload. The maximum size of the payload is 2MB.
    * The JSON schema of the payload is defined as:  ``` type: object
    * properties:   mainTemplate:     type: string     description: The file
    * name of the main template and name prefix of     schema file. The content
    * of the main template should be set in the     imports list. The schema
    * file name is expected to be     &lt;mainTemplate&gt;.schema in the
    * imports list. required: true   imports:     type: array     description:
    * Import template and schema file contents. Required to have     both
    * &lt;mainTemplate&gt; and &lt;mainTemplate&gt;.schema files. required:
    * true     minItems: 2     items:       type: object       properties:
    * name:           type: string         content:           type: string ```
    */
  var originalAsset: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Output only. The time when the version was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudPrivatecatalogproducerV1beta1Version {
  @scala.inline
  def apply(
    asset: StringDictionary[js.Any] = null,
    createTime: String = null,
    description: String = null,
    name: String = null,
    originalAsset: StringDictionary[js.Any] = null,
    updateTime: String = null
  ): Schema$GoogleCloudPrivatecatalogproducerV1beta1Version = {
    val __obj = js.Dynamic.literal()
    if (asset != null) __obj.updateDynamic("asset")(asset.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalAsset != null) __obj.updateDynamic("originalAsset")(originalAsset.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudPrivatecatalogproducerV1beta1Version]
  }
}

