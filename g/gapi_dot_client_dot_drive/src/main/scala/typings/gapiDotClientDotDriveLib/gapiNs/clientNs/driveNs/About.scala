package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait About extends js.Object {
  /** Whether the user has installed the requesting app. */
  var appInstalled: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the user can create Team Drives. */
  var canCreateTeamDrives: js.UndefOr[scala.Boolean] = js.undefined
  /** A map of source MIME type to possible targets for all supported exports. */
  var exportFormats: js.UndefOr[stdLib.Record[java.lang.String, js.Array[java.lang.String]]] = js.undefined
  /** The currently supported folder colors as RGB hex strings. */
  var folderColorPalette: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A map of source MIME type to possible targets for all supported imports. */
  var importFormats: js.UndefOr[stdLib.Record[java.lang.String, js.Array[java.lang.String]]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#about". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** A map of maximum import sizes by MIME type, in bytes. */
  var maxImportSizes: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The maximum upload size in bytes. */
  var maxUploadSize: js.UndefOr[java.lang.String] = js.undefined
  /** The user's storage quota limits and usage. All fields are measured in bytes. */
  var storageQuota: js.UndefOr[gapiDotClientDotDriveLib.Anon_Limit] = js.undefined
  /** A list of themes that are supported for Team Drives. */
  var teamDriveThemes: js.UndefOr[js.Array[gapiDotClientDotDriveLib.Anon_BackgroundImageLink]] = js.undefined
  /** The authenticated user. */
  var user: js.UndefOr[User] = js.undefined
}

object About {
  @scala.inline
  def apply(
    appInstalled: js.UndefOr[scala.Boolean] = js.undefined,
    canCreateTeamDrives: js.UndefOr[scala.Boolean] = js.undefined,
    exportFormats: stdLib.Record[java.lang.String, js.Array[java.lang.String]] = null,
    folderColorPalette: js.Array[java.lang.String] = null,
    importFormats: stdLib.Record[java.lang.String, js.Array[java.lang.String]] = null,
    kind: java.lang.String = null,
    maxImportSizes: stdLib.Record[java.lang.String, java.lang.String] = null,
    maxUploadSize: java.lang.String = null,
    storageQuota: gapiDotClientDotDriveLib.Anon_Limit = null,
    teamDriveThemes: js.Array[gapiDotClientDotDriveLib.Anon_BackgroundImageLink] = null,
    user: User = null
  ): About = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appInstalled)) __obj.updateDynamic("appInstalled")(appInstalled)
    if (!js.isUndefined(canCreateTeamDrives)) __obj.updateDynamic("canCreateTeamDrives")(canCreateTeamDrives)
    if (exportFormats != null) __obj.updateDynamic("exportFormats")(exportFormats)
    if (folderColorPalette != null) __obj.updateDynamic("folderColorPalette")(folderColorPalette)
    if (importFormats != null) __obj.updateDynamic("importFormats")(importFormats)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (maxImportSizes != null) __obj.updateDynamic("maxImportSizes")(maxImportSizes)
    if (maxUploadSize != null) __obj.updateDynamic("maxUploadSize")(maxUploadSize)
    if (storageQuota != null) __obj.updateDynamic("storageQuota")(storageQuota)
    if (teamDriveThemes != null) __obj.updateDynamic("teamDriveThemes")(teamDriveThemes)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[About]
  }
}

