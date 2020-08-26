package typings.googleDriveRealtimeApi.gapi.drive.realtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collaborator extends js.Object {
  // The HTML color associated with this collaborator. When possible, collaborators are assigned unique colors.
  var color: String = js.native
  // The display name for this collaborator.
  var displayName: String = js.native
  // True if this collaborator is anonymous, false otherwise.
  var isAnonymous: Boolean = js.native
  // True if this collaborator is the local user, false otherwise.
  var isMe: Boolean = js.native
  // The permission ID for this collaborator. This ID is stable for a given user and is compatible with the
  // Drive API permissions APIs. Use the userId property for all other uses.
  var permissionId: String = js.native
  // A URL that points to the profile photo for this collaborator, or to a generic profile photo for
  // anonymous collaborators.
  var photoUrl: String = js.native
  // The session ID for this collaborator. A single user may have multiple sessions if they have the same document
  // open on multiple devices or in multiple browser tabs.
  var sessionId: String = js.native
  // The user ID for this collaborator. This ID is stable for a given user and is compatible with most Google APIs
  // except the Drive API permission APIs. For an ID which is compatible with the Drive API permission APIs,
  // use the permissionId property.
  var userId: String = js.native
}

object Collaborator {
  @scala.inline
  def apply(
    color: String,
    displayName: String,
    isAnonymous: Boolean,
    isMe: Boolean,
    permissionId: String,
    photoUrl: String,
    sessionId: String,
    userId: String
  ): Collaborator = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], isAnonymous = isAnonymous.asInstanceOf[js.Any], isMe = isMe.asInstanceOf[js.Any], permissionId = permissionId.asInstanceOf[js.Any], photoUrl = photoUrl.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collaborator]
  }
  @scala.inline
  implicit class CollaboratorOps[Self <: Collaborator] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAnonymous(value: Boolean): Self = this.set("isAnonymous", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMe(value: Boolean): Self = this.set("isMe", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissionId(value: String): Self = this.set("permissionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhotoUrl(value: String): Self = this.set("photoUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
  
}

