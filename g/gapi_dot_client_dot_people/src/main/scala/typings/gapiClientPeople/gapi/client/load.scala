package typings.gapiClientPeople.gapi.client

import typings.gapiClientPeople.gapiClientPeopleStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.load")
@js.native
object load extends js.Object {
  /** Load People API v1 */
  def apply(name: typings.gapiClientPeople.gapiClientPeopleStrings.people, version: v1): js.Thenable[Unit] = js.native
  def apply(
    name: typings.gapiClientPeople.gapiClientPeopleStrings.people,
    version: v1,
    callback: js.Function0[_]
  ): Unit = js.native
}

