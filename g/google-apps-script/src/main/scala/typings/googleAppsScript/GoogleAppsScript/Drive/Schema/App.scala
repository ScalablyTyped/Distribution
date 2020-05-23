package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  var authorized: js.UndefOr[Boolean] = js.undefined
  var createInFolderTemplate: js.UndefOr[String] = js.undefined
  var createUrl: js.UndefOr[String] = js.undefined
  var hasDriveWideScope: js.UndefOr[Boolean] = js.undefined
  var icons: js.UndefOr[js.Array[AppIcons]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var installed: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var longDescription: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var objectType: js.UndefOr[String] = js.undefined
  var openUrlTemplate: js.UndefOr[String] = js.undefined
  var primaryFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  var primaryMimeTypes: js.UndefOr[js.Array[String]] = js.undefined
  var productId: js.UndefOr[String] = js.undefined
  var productUrl: js.UndefOr[String] = js.undefined
  var secondaryFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  var secondaryMimeTypes: js.UndefOr[js.Array[String]] = js.undefined
  var shortDescription: js.UndefOr[String] = js.undefined
  var supportsCreate: js.UndefOr[Boolean] = js.undefined
  var supportsImport: js.UndefOr[Boolean] = js.undefined
  var supportsMultiOpen: js.UndefOr[Boolean] = js.undefined
  var supportsOfflineCreate: js.UndefOr[Boolean] = js.undefined
  var useByDefault: js.UndefOr[Boolean] = js.undefined
}

object App {
  @scala.inline
  def apply(
    authorized: js.UndefOr[Boolean] = js.undefined,
    createInFolderTemplate: String = null,
    createUrl: String = null,
    hasDriveWideScope: js.UndefOr[Boolean] = js.undefined,
    icons: js.Array[AppIcons] = null,
    id: String = null,
    installed: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    longDescription: String = null,
    name: String = null,
    objectType: String = null,
    openUrlTemplate: String = null,
    primaryFileExtensions: js.Array[String] = null,
    primaryMimeTypes: js.Array[String] = null,
    productId: String = null,
    productUrl: String = null,
    secondaryFileExtensions: js.Array[String] = null,
    secondaryMimeTypes: js.Array[String] = null,
    shortDescription: String = null,
    supportsCreate: js.UndefOr[Boolean] = js.undefined,
    supportsImport: js.UndefOr[Boolean] = js.undefined,
    supportsMultiOpen: js.UndefOr[Boolean] = js.undefined,
    supportsOfflineCreate: js.UndefOr[Boolean] = js.undefined,
    useByDefault: js.UndefOr[Boolean] = js.undefined
  ): App = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(authorized)) __obj.updateDynamic("authorized")(authorized.get.asInstanceOf[js.Any])
    if (createInFolderTemplate != null) __obj.updateDynamic("createInFolderTemplate")(createInFolderTemplate.asInstanceOf[js.Any])
    if (createUrl != null) __obj.updateDynamic("createUrl")(createUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDriveWideScope)) __obj.updateDynamic("hasDriveWideScope")(hasDriveWideScope.get.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(installed)) __obj.updateDynamic("installed")(installed.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (longDescription != null) __obj.updateDynamic("longDescription")(longDescription.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (openUrlTemplate != null) __obj.updateDynamic("openUrlTemplate")(openUrlTemplate.asInstanceOf[js.Any])
    if (primaryFileExtensions != null) __obj.updateDynamic("primaryFileExtensions")(primaryFileExtensions.asInstanceOf[js.Any])
    if (primaryMimeTypes != null) __obj.updateDynamic("primaryMimeTypes")(primaryMimeTypes.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (productUrl != null) __obj.updateDynamic("productUrl")(productUrl.asInstanceOf[js.Any])
    if (secondaryFileExtensions != null) __obj.updateDynamic("secondaryFileExtensions")(secondaryFileExtensions.asInstanceOf[js.Any])
    if (secondaryMimeTypes != null) __obj.updateDynamic("secondaryMimeTypes")(secondaryMimeTypes.asInstanceOf[js.Any])
    if (shortDescription != null) __obj.updateDynamic("shortDescription")(shortDescription.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsCreate)) __obj.updateDynamic("supportsCreate")(supportsCreate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsImport)) __obj.updateDynamic("supportsImport")(supportsImport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsMultiOpen)) __obj.updateDynamic("supportsMultiOpen")(supportsMultiOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsOfflineCreate)) __obj.updateDynamic("supportsOfflineCreate")(supportsOfflineCreate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useByDefault)) __obj.updateDynamic("useByDefault")(useByDefault.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
}

