package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val contactGroups: gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs.ContactGroupsResource = js.native
  val people: gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs.PeopleResource = js.native
  /** Load Google People API v1 */
  def load(
    name: gapiDotClientDotPeopleLib.gapiDotClientDotPeopleLibStrings.people,
    version: gapiDotClientDotPeopleLib.gapiDotClientDotPeopleLibStrings.v1
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotPeopleLib.gapiDotClientDotPeopleLibStrings.people,
    version: gapiDotClientDotPeopleLib.gapiDotClientDotPeopleLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

