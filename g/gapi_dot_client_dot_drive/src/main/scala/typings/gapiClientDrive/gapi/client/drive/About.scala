package typings.gapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.TopLevel
import typings.gapiClientDrive.anon.BackgroundImageLink
import typings.gapiClientDrive.anon.Limit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait About extends js.Object {
  /** Whether the user has installed the requesting app. */
  var appInstalled: js.UndefOr[Boolean] = js.undefined
  /** Whether the user can create shared drives. */
  var canCreateDrives: js.UndefOr[Boolean] = js.undefined
  /** Deprecated - use canCreateDrives instead. */
  var canCreateTeamDrives: js.UndefOr[Boolean] = js.undefined
  /** A list of themes that are supported for shared drives. */
  var driveThemes: js.UndefOr[js.Array[BackgroundImageLink]] = js.undefined
  /** A map of source MIME type to possible targets for all supported exports. */
  var exportFormats: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: std.Array<string>}
    */ typings.gapiClientDrive.gapiClientDriveStrings.About with TopLevel[js.Any]
  ] = js.undefined
  /** The currently supported folder colors as RGB hex strings. */
  var folderColorPalette: js.UndefOr[js.Array[String]] = js.undefined
  /** A map of source MIME type to possible targets for all supported imports. */
  var importFormats: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: std.Array<string>}
    */ typings.gapiClientDrive.gapiClientDriveStrings.About with TopLevel[js.Any]
  ] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#about". */
  var kind: js.UndefOr[String] = js.undefined
  /** A map of maximum import sizes by MIME type, in bytes. */
  var maxImportSizes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.gapiClientDrive.gapiClientDriveStrings.About with TopLevel[js.Any]
  ] = js.undefined
  /** The maximum upload size in bytes. */
  var maxUploadSize: js.UndefOr[String] = js.undefined
  /** The user's storage quota limits and usage. All fields are measured in bytes. */
  var storageQuota: js.UndefOr[Limit] = js.undefined
  /** Deprecated - use driveThemes instead. */
  var teamDriveThemes: js.UndefOr[js.Array[BackgroundImageLink]] = js.undefined
  /** The authenticated user. */
  var user: js.UndefOr[User] = js.undefined
}

object About {
  @scala.inline
  def apply(
    appInstalled: js.UndefOr[Boolean] = js.undefined,
    canCreateDrives: js.UndefOr[Boolean] = js.undefined,
    canCreateTeamDrives: js.UndefOr[Boolean] = js.undefined,
    driveThemes: js.Array[BackgroundImageLink] = null,
    exportFormats: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: std.Array<string>}
    */ typings.gapiClientDrive.gapiClientDriveStrings.About with TopLevel[js.Any] = null,
    folderColorPalette: js.Array[String] = null,
    importFormats: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: std.Array<string>}
    */ typings.gapiClientDrive.gapiClientDriveStrings.About with TopLevel[js.Any] = null,
    kind: String = null,
    maxImportSizes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.gapiClientDrive.gapiClientDriveStrings.About with TopLevel[js.Any] = null,
    maxUploadSize: String = null,
    storageQuota: Limit = null,
    teamDriveThemes: js.Array[BackgroundImageLink] = null,
    user: User = null
  ): About = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appInstalled)) __obj.updateDynamic("appInstalled")(appInstalled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canCreateDrives)) __obj.updateDynamic("canCreateDrives")(canCreateDrives.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canCreateTeamDrives)) __obj.updateDynamic("canCreateTeamDrives")(canCreateTeamDrives.get.asInstanceOf[js.Any])
    if (driveThemes != null) __obj.updateDynamic("driveThemes")(driveThemes.asInstanceOf[js.Any])
    if (exportFormats != null) __obj.updateDynamic("exportFormats")(exportFormats.asInstanceOf[js.Any])
    if (folderColorPalette != null) __obj.updateDynamic("folderColorPalette")(folderColorPalette.asInstanceOf[js.Any])
    if (importFormats != null) __obj.updateDynamic("importFormats")(importFormats.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (maxImportSizes != null) __obj.updateDynamic("maxImportSizes")(maxImportSizes.asInstanceOf[js.Any])
    if (maxUploadSize != null) __obj.updateDynamic("maxUploadSize")(maxUploadSize.asInstanceOf[js.Any])
    if (storageQuota != null) __obj.updateDynamic("storageQuota")(storageQuota.asInstanceOf[js.Any])
    if (teamDriveThemes != null) __obj.updateDynamic("teamDriveThemes")(teamDriveThemes.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[About]
  }
}

