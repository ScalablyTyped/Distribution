package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  var authorized: js.UndefOr[scala.Boolean] = js.undefined
  var createInFolderTemplate: js.UndefOr[java.lang.String] = js.undefined
  var createUrl: js.UndefOr[java.lang.String] = js.undefined
  var hasDriveWideScope: js.UndefOr[scala.Boolean] = js.undefined
  var icons: js.UndefOr[js.Array[AppIcons]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var installed: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var longDescription: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var objectType: js.UndefOr[java.lang.String] = js.undefined
  var openUrlTemplate: js.UndefOr[java.lang.String] = js.undefined
  var primaryFileExtensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var primaryMimeTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var productId: js.UndefOr[java.lang.String] = js.undefined
  var productUrl: js.UndefOr[java.lang.String] = js.undefined
  var secondaryFileExtensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var secondaryMimeTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var shortDescription: js.UndefOr[java.lang.String] = js.undefined
  var supportsCreate: js.UndefOr[scala.Boolean] = js.undefined
  var supportsImport: js.UndefOr[scala.Boolean] = js.undefined
  var supportsMultiOpen: js.UndefOr[scala.Boolean] = js.undefined
  var supportsOfflineCreate: js.UndefOr[scala.Boolean] = js.undefined
  var useByDefault: js.UndefOr[scala.Boolean] = js.undefined
}

object App {
  @scala.inline
  def apply(
    authorized: js.UndefOr[scala.Boolean] = js.undefined,
    createInFolderTemplate: java.lang.String = null,
    createUrl: java.lang.String = null,
    hasDriveWideScope: js.UndefOr[scala.Boolean] = js.undefined,
    icons: js.Array[AppIcons] = null,
    id: java.lang.String = null,
    installed: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    longDescription: java.lang.String = null,
    name: java.lang.String = null,
    objectType: java.lang.String = null,
    openUrlTemplate: java.lang.String = null,
    primaryFileExtensions: js.Array[java.lang.String] = null,
    primaryMimeTypes: js.Array[java.lang.String] = null,
    productId: java.lang.String = null,
    productUrl: java.lang.String = null,
    secondaryFileExtensions: js.Array[java.lang.String] = null,
    secondaryMimeTypes: js.Array[java.lang.String] = null,
    shortDescription: java.lang.String = null,
    supportsCreate: js.UndefOr[scala.Boolean] = js.undefined,
    supportsImport: js.UndefOr[scala.Boolean] = js.undefined,
    supportsMultiOpen: js.UndefOr[scala.Boolean] = js.undefined,
    supportsOfflineCreate: js.UndefOr[scala.Boolean] = js.undefined,
    useByDefault: js.UndefOr[scala.Boolean] = js.undefined
  ): App = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(authorized)) __obj.updateDynamic("authorized")(authorized)
    if (createInFolderTemplate != null) __obj.updateDynamic("createInFolderTemplate")(createInFolderTemplate)
    if (createUrl != null) __obj.updateDynamic("createUrl")(createUrl)
    if (!js.isUndefined(hasDriveWideScope)) __obj.updateDynamic("hasDriveWideScope")(hasDriveWideScope)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(installed)) __obj.updateDynamic("installed")(installed)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (longDescription != null) __obj.updateDynamic("longDescription")(longDescription)
    if (name != null) __obj.updateDynamic("name")(name)
    if (objectType != null) __obj.updateDynamic("objectType")(objectType)
    if (openUrlTemplate != null) __obj.updateDynamic("openUrlTemplate")(openUrlTemplate)
    if (primaryFileExtensions != null) __obj.updateDynamic("primaryFileExtensions")(primaryFileExtensions)
    if (primaryMimeTypes != null) __obj.updateDynamic("primaryMimeTypes")(primaryMimeTypes)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (productUrl != null) __obj.updateDynamic("productUrl")(productUrl)
    if (secondaryFileExtensions != null) __obj.updateDynamic("secondaryFileExtensions")(secondaryFileExtensions)
    if (secondaryMimeTypes != null) __obj.updateDynamic("secondaryMimeTypes")(secondaryMimeTypes)
    if (shortDescription != null) __obj.updateDynamic("shortDescription")(shortDescription)
    if (!js.isUndefined(supportsCreate)) __obj.updateDynamic("supportsCreate")(supportsCreate)
    if (!js.isUndefined(supportsImport)) __obj.updateDynamic("supportsImport")(supportsImport)
    if (!js.isUndefined(supportsMultiOpen)) __obj.updateDynamic("supportsMultiOpen")(supportsMultiOpen)
    if (!js.isUndefined(supportsOfflineCreate)) __obj.updateDynamic("supportsOfflineCreate")(supportsOfflineCreate)
    if (!js.isUndefined(useByDefault)) __obj.updateDynamic("useByDefault")(useByDefault)
    __obj.asInstanceOf[App]
  }
}

