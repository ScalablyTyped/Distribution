package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClientDrive.anon.CanChangeCopyRequiresWriterPermissionRestriction
import typings.gapiClientDrive.anon.CopyRequiresWriterPermission
import typings.gapiClientDrive.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamDrive extends js.Object {
  /**
    * An image file and cropping parameters from which a background image for this Team Drive is set. This is a write only field; it can only be set on
    * drive.teamdrives.update requests that don't set themeId. When specified, all fields of the backgroundImageFile must be set.
    */
  var backgroundImageFile: js.UndefOr[Id] = js.native
  /** A short-lived link to this Team Drive's background image. */
  var backgroundImageLink: js.UndefOr[String] = js.native
  /** Capabilities the current user has on this Team Drive. */
  var capabilities: js.UndefOr[CanChangeCopyRequiresWriterPermissionRestriction] = js.native
  /** The color of this Team Drive as an RGB hex string. It can only be set on a drive.teamdrives.update request that does not set themeId. */
  var colorRgb: js.UndefOr[String] = js.native
  /** The time at which the Team Drive was created (RFC 3339 date-time). */
  var createdTime: js.UndefOr[String] = js.native
  /** The ID of this Team Drive which is also the ID of the top level folder of this Team Drive. */
  var id: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "drive#teamDrive". */
  var kind: js.UndefOr[String] = js.native
  /** The name of this Team Drive. */
  var name: js.UndefOr[String] = js.native
  /** A set of restrictions that apply to this Team Drive or items inside this Team Drive. */
  var restrictions: js.UndefOr[CopyRequiresWriterPermission] = js.native
  /**
    * The ID of the theme from which the background image and color will be set. The set of possible teamDriveThemes can be retrieved from a drive.about.get
    * response. When not specified on a drive.teamdrives.create request, a random theme is chosen from which the background image and color are set. This is
    * a write-only field; it can only be set on requests that don't set colorRgb or backgroundImageFile.
    */
  var themeId: js.UndefOr[String] = js.native
}

object TeamDrive {
  @scala.inline
  def apply(): TeamDrive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamDrive]
  }
  @scala.inline
  implicit class TeamDriveOps[Self <: TeamDrive] (val x: Self) extends AnyVal {
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
    def setBackgroundImageFile(value: Id): Self = this.set("backgroundImageFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundImageFile: Self = this.set("backgroundImageFile", js.undefined)
    @scala.inline
    def setBackgroundImageLink(value: String): Self = this.set("backgroundImageLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundImageLink: Self = this.set("backgroundImageLink", js.undefined)
    @scala.inline
    def setCapabilities(value: CanChangeCopyRequiresWriterPermissionRestriction): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    @scala.inline
    def setColorRgb(value: String): Self = this.set("colorRgb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorRgb: Self = this.set("colorRgb", js.undefined)
    @scala.inline
    def setCreatedTime(value: String): Self = this.set("createdTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("createdTime", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRestrictions(value: CopyRequiresWriterPermission): Self = this.set("restrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictions: Self = this.set("restrictions", js.undefined)
    @scala.inline
    def setThemeId(value: String): Self = this.set("themeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThemeId: Self = this.set("themeId", js.undefined)
  }
  
}

