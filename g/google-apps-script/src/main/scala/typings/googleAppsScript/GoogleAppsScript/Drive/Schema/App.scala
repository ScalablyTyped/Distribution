package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  var authorized: js.UndefOr[Boolean] = js.native
  var createInFolderTemplate: js.UndefOr[String] = js.native
  var createUrl: js.UndefOr[String] = js.native
  var hasDriveWideScope: js.UndefOr[Boolean] = js.native
  var icons: js.UndefOr[js.Array[AppIcons]] = js.native
  var id: js.UndefOr[String] = js.native
  var installed: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var longDescription: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var objectType: js.UndefOr[String] = js.native
  var openUrlTemplate: js.UndefOr[String] = js.native
  var primaryFileExtensions: js.UndefOr[js.Array[String]] = js.native
  var primaryMimeTypes: js.UndefOr[js.Array[String]] = js.native
  var productId: js.UndefOr[String] = js.native
  var productUrl: js.UndefOr[String] = js.native
  var secondaryFileExtensions: js.UndefOr[js.Array[String]] = js.native
  var secondaryMimeTypes: js.UndefOr[js.Array[String]] = js.native
  var shortDescription: js.UndefOr[String] = js.native
  var supportsCreate: js.UndefOr[Boolean] = js.native
  var supportsImport: js.UndefOr[Boolean] = js.native
  var supportsMultiOpen: js.UndefOr[Boolean] = js.native
  var supportsOfflineCreate: js.UndefOr[Boolean] = js.native
  var useByDefault: js.UndefOr[Boolean] = js.native
}

object App {
  @scala.inline
  def apply(): App = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[App]
  }
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
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
    def setAuthorized(value: Boolean): Self = this.set("authorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorized: Self = this.set("authorized", js.undefined)
    @scala.inline
    def setCreateInFolderTemplate(value: String): Self = this.set("createInFolderTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateInFolderTemplate: Self = this.set("createInFolderTemplate", js.undefined)
    @scala.inline
    def setCreateUrl(value: String): Self = this.set("createUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateUrl: Self = this.set("createUrl", js.undefined)
    @scala.inline
    def setHasDriveWideScope(value: Boolean): Self = this.set("hasDriveWideScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasDriveWideScope: Self = this.set("hasDriveWideScope", js.undefined)
    @scala.inline
    def setIconsVarargs(value: AppIcons*): Self = this.set("icons", js.Array(value :_*))
    @scala.inline
    def setIcons(value: js.Array[AppIcons]): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInstalled(value: Boolean): Self = this.set("installed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstalled: Self = this.set("installed", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLongDescription(value: String): Self = this.set("longDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongDescription: Self = this.set("longDescription", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    @scala.inline
    def setOpenUrlTemplate(value: String): Self = this.set("openUrlTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenUrlTemplate: Self = this.set("openUrlTemplate", js.undefined)
    @scala.inline
    def setPrimaryFileExtensionsVarargs(value: String*): Self = this.set("primaryFileExtensions", js.Array(value :_*))
    @scala.inline
    def setPrimaryFileExtensions(value: js.Array[String]): Self = this.set("primaryFileExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryFileExtensions: Self = this.set("primaryFileExtensions", js.undefined)
    @scala.inline
    def setPrimaryMimeTypesVarargs(value: String*): Self = this.set("primaryMimeTypes", js.Array(value :_*))
    @scala.inline
    def setPrimaryMimeTypes(value: js.Array[String]): Self = this.set("primaryMimeTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryMimeTypes: Self = this.set("primaryMimeTypes", js.undefined)
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    @scala.inline
    def setProductUrl(value: String): Self = this.set("productUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductUrl: Self = this.set("productUrl", js.undefined)
    @scala.inline
    def setSecondaryFileExtensionsVarargs(value: String*): Self = this.set("secondaryFileExtensions", js.Array(value :_*))
    @scala.inline
    def setSecondaryFileExtensions(value: js.Array[String]): Self = this.set("secondaryFileExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryFileExtensions: Self = this.set("secondaryFileExtensions", js.undefined)
    @scala.inline
    def setSecondaryMimeTypesVarargs(value: String*): Self = this.set("secondaryMimeTypes", js.Array(value :_*))
    @scala.inline
    def setSecondaryMimeTypes(value: js.Array[String]): Self = this.set("secondaryMimeTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryMimeTypes: Self = this.set("secondaryMimeTypes", js.undefined)
    @scala.inline
    def setShortDescription(value: String): Self = this.set("shortDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortDescription: Self = this.set("shortDescription", js.undefined)
    @scala.inline
    def setSupportsCreate(value: Boolean): Self = this.set("supportsCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsCreate: Self = this.set("supportsCreate", js.undefined)
    @scala.inline
    def setSupportsImport(value: Boolean): Self = this.set("supportsImport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsImport: Self = this.set("supportsImport", js.undefined)
    @scala.inline
    def setSupportsMultiOpen(value: Boolean): Self = this.set("supportsMultiOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsMultiOpen: Self = this.set("supportsMultiOpen", js.undefined)
    @scala.inline
    def setSupportsOfflineCreate(value: Boolean): Self = this.set("supportsOfflineCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsOfflineCreate: Self = this.set("supportsOfflineCreate", js.undefined)
    @scala.inline
    def setUseByDefault(value: Boolean): Self = this.set("useByDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseByDefault: Self = this.set("useByDefault", js.undefined)
  }
  
}

