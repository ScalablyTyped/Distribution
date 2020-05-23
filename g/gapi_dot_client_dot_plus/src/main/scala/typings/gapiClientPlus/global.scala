package typings.gapiClientPlus

import typings.gapiClientPlus.gapi.client.plus.ActivitiesResource
import typings.gapiClientPlus.gapi.client.plus.CommentsResource
import typings.gapiClientPlus.gapi.client.plus.PeopleResource
import typings.gapiClientPlus.gapiClientPlusStrings.plus
import typings.gapiClientPlus.gapiClientPlusStrings.v1
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
      val activities: ActivitiesResource = js.native
      val comments: CommentsResource = js.native
      val people: PeopleResource = js.native
      /** Load Google+ API v1 */
      def load(name: plus, version: v1): js.Thenable[Unit] = js.native
      def load(name: plus, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

