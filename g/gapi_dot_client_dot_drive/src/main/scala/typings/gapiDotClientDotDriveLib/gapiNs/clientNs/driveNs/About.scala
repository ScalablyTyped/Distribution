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
  var teamDriveThemes: js.UndefOr[js.Array[gapiDotClientDotDriveLib.Anon_ColorRgb]] = js.undefined
  /** The authenticated user. */
  var user: js.UndefOr[User] = js.undefined
}

