package typings.gapiClientPeople

import typings.gapiClientPeople.gapi.client.people.ContactGroupsResource
import typings.gapiClientPeople.gapi.client.people.PeopleResource
import typings.gapiClientPeople.gapiClientPeopleStrings.people
import typings.gapiClientPeople.gapiClientPeopleStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      /** Load People API v1 */
      def load(name: people, version: v1): js.Thenable[Unit] = js.native
      def load(name: people, version: v1, callback: js.Function0[_]): Unit = js.native
      @js.native
      object people extends js.Object {
        val contactGroups: ContactGroupsResource = js.native
        val people: PeopleResource = js.native
      }
      
    }
    
  }
  
}

