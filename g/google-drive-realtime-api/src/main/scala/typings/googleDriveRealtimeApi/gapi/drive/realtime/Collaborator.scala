package typings.googleDriveRealtimeApi.gapi.drive.realtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collaborator extends js.Object {
  // The HTML color associated with this collaborator. When possible, collaborators are assigned unique colors.
  var color: String
  // The display name for this collaborator.
  var displayName: String
  // True if this collaborator is anonymous, false otherwise.
  var isAnonymous: Boolean
  // True if this collaborator is the local user, false otherwise.
  var isMe: Boolean
  // The permission ID for this collaborator. This ID is stable for a given user and is compatible with the
  // Drive API permissions APIs. Use the userId property for all other uses.
  var permissionId: String
  // A URL that points to the profile photo for this collaborator, or to a generic profile photo for
  // anonymous collaborators.
  var photoUrl: String
  // The session ID for this collaborator. A single user may have multiple sessions if they have the same document
  // open on multiple devices or in multiple browser tabs.
  var sessionId: String
  // The user ID for this collaborator. This ID is stable for a given user and is compatible with most Google APIs
  // except the Drive API permission APIs. For an ID which is compatible with the Drive API permission APIs,
  // use the permissionId property.
  var userId: String
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
}

