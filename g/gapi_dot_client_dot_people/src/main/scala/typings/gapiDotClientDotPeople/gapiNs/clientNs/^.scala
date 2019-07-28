package typings.gapiDotClientDotPeople.gapiNs.clientNs

import typings.gapiDotClientDotPeople.gapiDotClientDotPeopleStrings.v1
import typings.gapiDotClientDotPeople.gapiNs.clientNs.peopleNs.ContactGroupsResource
import typings.gapiDotClientDotPeople.gapiNs.clientNs.peopleNs.PeopleResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val contactGroups: ContactGroupsResource = js.native
  val people: PeopleResource = js.native
  /** Load Google People API v1 */
  def load(name: typings.gapiDotClientDotPeople.gapiDotClientDotPeopleStrings.people, version: v1): js.Thenable[Unit] = js.native
  def load(
    name: typings.gapiDotClientDotPeople.gapiDotClientDotPeopleStrings.people,
    version: v1,
    callback: js.Function0[_]
  ): Unit = js.native
}

