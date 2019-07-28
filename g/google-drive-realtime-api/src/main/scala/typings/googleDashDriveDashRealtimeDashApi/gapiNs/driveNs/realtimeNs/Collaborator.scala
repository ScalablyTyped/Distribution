package typings.googleDashDriveDashRealtimeDashApi.gapiNs.driveNs.realtimeNs

import org.scalablytyped.runtime.Instantiable8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.drive.realtime.Collaborator")
@js.native
class Collaborator () extends Instantiable8[
      /* sessionId */ String, 
      /* userId */ String, 
      /* displayName */ String, 
      /* color */ String, 
      /* isMe */ Boolean, 
      /* isAnonymous */ Boolean, 
      /* photoUrl */ String, 
      /* permissionId */ String, 
      Collaborator
    ] {
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

