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
  def apply(): SchemaGoogleCloudPrivatecatalogV1beta1Catalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogV1beta1Catalog]
  }
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogV1beta1CatalogOps[Self <: SchemaGoogleCloudPrivatecatalogV1beta1Catalog] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
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

