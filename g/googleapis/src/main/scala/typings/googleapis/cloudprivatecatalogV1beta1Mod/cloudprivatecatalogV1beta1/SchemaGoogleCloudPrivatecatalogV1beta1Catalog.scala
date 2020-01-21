package typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The readonly representation of a catalog computed with a given resource
  * context.
  */
@js.native
trait SchemaGoogleCloudPrivatecatalogV1beta1Catalog extends js.Object {
  /**
    * Output only. The time when the catalog was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The description of the catalog.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Output only. The descriptive name of the catalog as it appears in UIs.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Output only. The resource name of the target catalog, in the format of
    * `catalogs/{catalog_id}&#39;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The time when the catalog was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudPrivatecatalogV1beta1Catalog {
  @scala.inline
  def apply(
    createTime: String = null,
    description: String = null,
    displayName: String = null,
    name: String = null,
    updateTime: String = null
  ): SchemaGoogleCloudPrivatecatalogV1beta1Catalog = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogV1beta1Catalog]
  }
}

