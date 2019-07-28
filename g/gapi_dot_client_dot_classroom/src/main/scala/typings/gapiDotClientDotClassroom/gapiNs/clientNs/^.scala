package typings.gapiDotClientDotClassroom.gapiNs.clientNs

import typings.gapiDotClientDotClassroom.gapiDotClientDotClassroomStrings.classroom
import typings.gapiDotClientDotClassroom.gapiDotClientDotClassroomStrings.v1
import typings.gapiDotClientDotClassroom.gapiNs.clientNs.classroomNs.CoursesResource
import typings.gapiDotClientDotClassroom.gapiNs.clientNs.classroomNs.InvitationsResource
import typings.gapiDotClientDotClassroom.gapiNs.clientNs.classroomNs.RegistrationsResource
import typings.gapiDotClientDotClassroom.gapiNs.clientNs.classroomNs.UserProfilesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val courses: CoursesResource = js.native
  val invitations: InvitationsResource = js.native
  val registrations: RegistrationsResource = js.native
  val userProfiles: UserProfilesResource = js.native
  /** Load Google Classroom API v1 */
  def load(name: classroom, version: v1): js.Thenable[Unit] = js.native
  def load(name: classroom, version: v1, callback: js.Function0[_]): Unit = js.native
}

