package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClientDrive.AnonCanChangeTeamDriveBackground
import typings.gapiClientDrive.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamDrive extends js.Object {
  /**
    * An image file and cropping parameters from which a background image for this Team Drive is set. This is a write only field; it can only be set on
    * drive.teamdrives.update requests that don't set themeId. When specified, all fields of the backgroundImageFile must be set.
    */
  var backgroundImageFile: js.UndefOr[AnonId] = js.undefined
  /** A short-lived link to this Team Drive's background image. */
  var backgroundImageLink: js.UndefOr[String] = js.undefined
  /** Capabilities the current user has on this Team Drive. */
  var capabilities: js.UndefOr[AnonCanChangeTeamDriveBackground] = js.undefined
  /** The color of this Team Drive as an RGB hex string. It can only be set on a drive.teamdrives.update request that does not set themeId. */
  var colorRgb: js.UndefOr[String] = js.undefined
  /** The time at which the Team Drive was created (RFC 3339 date-time). */
  var createdTime: js.UndefOr[String] = js.undefined
  /** The ID of this Team Drive which is also the ID of the top level folder for this Team Drive. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#teamDrive". */
  var kind: js.UndefOr[String] = js.undefined
  /** The name of this Team Drive. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The ID of the theme from which the background image and color will be set. The set of possible teamDriveThemes can be retrieved from a drive.about.get
    * response. When not specified on a drive.teamdrives.create request, a random theme is chosen from which the background image and color are set. This is
    * a write-only field; it can only be set on requests that don't set colorRgb or backgroundImageFile.
    */
  var themeId: js.UndefOr[String] = js.undefined
}

object TeamDrive {
  @scala.inline
  def apply(
    backgroundImageFile: AnonId = null,
    backgroundImageLink: String = null,
    capabilities: AnonCanChangeTeamDriveBackground = null,
    colorRgb: String = null,
    createdTime: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    themeId: String = null
  ): TeamDrive = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageFile != null) __obj.updateDynamic("backgroundImageFile")(backgroundImageFile.asInstanceOf[js.Any])
    if (backgroundImageLink != null) __obj.updateDynamic("backgroundImageLink")(backgroundImageLink.asInstanceOf[js.Any])
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (colorRgb != null) __obj.updateDynamic("colorRgb")(colorRgb.asInstanceOf[js.Any])
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (themeId != null) __obj.updateDynamic("themeId")(themeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamDrive]
  }
}

