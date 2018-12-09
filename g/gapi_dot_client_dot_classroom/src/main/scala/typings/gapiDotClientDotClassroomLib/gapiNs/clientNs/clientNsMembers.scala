package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val courses: gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs.CoursesResource = js.native
  val invitations: gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs.InvitationsResource = js.native
  val registrations: gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs.RegistrationsResource = js.native
  val userProfiles: gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs.UserProfilesResource = js.native
  /** Load Google Classroom API v1 */
  def load(
    name: gapiDotClientDotClassroomLib.gapiDotClientDotClassroomLibStrings.classroom,
    version: gapiDotClientDotClassroomLib.gapiDotClientDotClassroomLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotClassroomLib.gapiDotClientDotClassroomLibStrings.classroom,
    version: gapiDotClientDotClassroomLib.gapiDotClientDotClassroomLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

