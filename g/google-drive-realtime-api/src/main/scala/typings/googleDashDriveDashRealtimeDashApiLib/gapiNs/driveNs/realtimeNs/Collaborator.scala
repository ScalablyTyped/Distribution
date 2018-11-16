package typings
package googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.drive.realtime.Collaborator")
@js.native
class Collaborator ()
  extends ScalablyTyped.runtime.Instantiable8[
      /* sessionId */ java.lang.String, 
      /* userId */ java.lang.String, 
      /* displayName */ java.lang.String, 
      /* color */ java.lang.String, 
      /* isMe */ scala.Boolean, 
      /* isAnonymous */ scala.Boolean, 
      /* photoUrl */ java.lang.String, 
      /* permissionId */ java.lang.String, 
      Collaborator
    ] {
  // The HTML color associated with this collaborator. When possible, collaborators are assigned unique colors.
  var color: java.lang.String = js.native
  // The display name for this collaborator.
  var displayName: java.lang.String = js.native
  // True if this collaborator is anonymous, false otherwise.
  var isAnonymous: scala.Boolean = js.native
  // True if this collaborator is the local user, false otherwise.
  var isMe: scala.Boolean = js.native
  // The permission ID for this collaborator. This ID is stable for a given user and is compatible with the
  // Drive API permissions APIs. Use the userId property for all other uses.
  var permissionId: java.lang.String = js.native
  // A URL that points to the profile photo for this collaborator, or to a generic profile photo for
  // anonymous collaborators.
  var photoUrl: java.lang.String = js.native
  // The session ID for this collaborator. A single user may have multiple sessions if they have the same document
  // open on multiple devices or in multiple browser tabs.
  var sessionId: java.lang.String = js.native
  // The user ID for this collaborator. This ID is stable for a given user and is compatible with most Google APIs
  // except the Drive API permission APIs. For an ID which is compatible with the Drive API permission APIs,
  // use the permissionId property.
  var userId: java.lang.String = js.native
}

