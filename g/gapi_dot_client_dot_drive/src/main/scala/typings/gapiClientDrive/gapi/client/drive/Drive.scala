package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClientDrive.anon.AdminManagedRestrictions
import typings.gapiClientDrive.anon.CanAddChildren
import typings.gapiClientDrive.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Drive extends js.Object {
  /**
    * An image file and cropping parameters from which a background image for this shared drive is set. This is a write only field; it can only be set on
    * drive.drives.update requests that don't set themeId. When specified, all fields of the backgroundImageFile must be set.
    */
  var backgroundImageFile: js.UndefOr[Id] = js.undefined
  /** A short-lived link to this shared drive's background image. */
  var backgroundImageLink: js.UndefOr[String] = js.undefined
  /** Capabilities the current user has on this shared drive. */
  var capabilities: js.UndefOr[CanAddChildren] = js.undefined
  /** The color of this shared drive as an RGB hex string. It can only be set on a drive.drives.update request that does not set themeId. */
  var colorRgb: js.UndefOr[String] = js.undefined
  /** The time at which the shared drive was created (RFC 3339 date-time). */
  var createdTime: js.UndefOr[String] = js.undefined
  /** Whether the shared drive is hidden from default view. */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /** The ID of this shared drive which is also the ID of the top level folder of this shared drive. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#drive". */
  var kind: js.UndefOr[String] = js.undefined
  /** The name of this shared drive. */
  var name: js.UndefOr[String] = js.undefined
  /** A set of restrictions that apply to this shared drive or items inside this shared drive. */
  var restrictions: js.UndefOr[AdminManagedRestrictions] = js.undefined
  /**
    * The ID of the theme from which the background image and color will be set. The set of possible driveThemes can be retrieved from a drive.about.get
    * response. When not specified on a drive.drives.create request, a random theme is chosen from which the background image and color are set. This is a
    * write-only field; it can only be set on requests that don't set colorRgb or backgroundImageFile.
    */
  var themeId: js.UndefOr[String] = js.undefined
}

object Drive {
  @scala.inline
  def apply(
    backgroundImageFile: Id = null,
    backgroundImageLink: String = null,
    capabilities: CanAddChildren = null,
    colorRgb: String = null,
    createdTime: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    name: String = null,
    restrictions: AdminManagedRestrictions = null,
    themeId: String = null
  ): Drive = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageFile != null) __obj.updateDynamic("backgroundImageFile")(backgroundImageFile.asInstanceOf[js.Any])
    if (backgroundImageLink != null) __obj.updateDynamic("backgroundImageLink")(backgroundImageLink.asInstanceOf[js.Any])
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (colorRgb != null) __obj.updateDynamic("colorRgb")(colorRgb.asInstanceOf[js.Any])
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    if (themeId != null) __obj.updateDynamic("themeId")(themeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drive]
  }
}

