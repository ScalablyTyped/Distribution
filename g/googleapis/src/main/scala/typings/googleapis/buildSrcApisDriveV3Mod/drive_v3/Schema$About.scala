package typings.googleapis.buildSrcApisDriveV3Mod.drive_v3

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.Anon_BackgroundImageLink
import typings.googleapis.Anon_Limit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the user, the user&#39;s Drive, and system capabilities.
  */
@js.native
trait Schema$About extends js.Object {
  /**
    * Whether the user has installed the requesting app.
    */
  var appInstalled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the user can create Team Drives.
    */
  var canCreateTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * A map of source MIME type to possible targets for all supported exports.
    */
  var exportFormats: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  /**
    * The currently supported folder colors as RGB hex strings.
    */
  var folderColorPalette: js.UndefOr[js.Array[String]] = js.native
  /**
    * A map of source MIME type to possible targets for all supported imports.
    */
  var importFormats: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#about&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A map of maximum import sizes by MIME type, in bytes.
    */
  var maxImportSizes: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The maximum upload size in bytes.
    */
  var maxUploadSize: js.UndefOr[String] = js.native
  /**
    * The user&#39;s storage quota limits and usage. All fields are measured in
    * bytes.
    */
  var storageQuota: js.UndefOr[Anon_Limit] = js.native
  /**
    * A list of themes that are supported for Team Drives.
    */
  var teamDriveThemes: js.UndefOr[js.Array[Anon_BackgroundImageLink]] = js.native
  /**
    * The authenticated user.
    */
  var user: js.UndefOr[Schema$User] = js.native
}

object Schema$About {
  @scala.inline
  def apply(
    appInstalled: js.UndefOr[Boolean] = js.undefined,
    canCreateTeamDrives: js.UndefOr[Boolean] = js.undefined,
    exportFormats: StringDictionary[js.Array[String]] = null,
    folderColorPalette: js.Array[String] = null,
    importFormats: StringDictionary[js.Array[String]] = null,
    kind: String = null,
    maxImportSizes: StringDictionary[String] = null,
    maxUploadSize: String = null,
    storageQuota: Anon_Limit = null,
    teamDriveThemes: js.Array[Anon_BackgroundImageLink] = null,
    user: Schema$User = null
  ): Schema$About = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appInstalled)) __obj.updateDynamic("appInstalled")(appInstalled.asInstanceOf[js.Any])
    if (!js.isUndefined(canCreateTeamDrives)) __obj.updateDynamic("canCreateTeamDrives")(canCreateTeamDrives.asInstanceOf[js.Any])
    if (exportFormats != null) __obj.updateDynamic("exportFormats")(exportFormats.asInstanceOf[js.Any])
    if (folderColorPalette != null) __obj.updateDynamic("folderColorPalette")(folderColorPalette.asInstanceOf[js.Any])
    if (importFormats != null) __obj.updateDynamic("importFormats")(importFormats.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (maxImportSizes != null) __obj.updateDynamic("maxImportSizes")(maxImportSizes.asInstanceOf[js.Any])
    if (maxUploadSize != null) __obj.updateDynamic("maxUploadSize")(maxUploadSize.asInstanceOf[js.Any])
    if (storageQuota != null) __obj.updateDynamic("storageQuota")(storageQuota.asInstanceOf[js.Any])
    if (teamDriveThemes != null) __obj.updateDynamic("teamDriveThemes")(teamDriveThemes.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$About]
  }
}

