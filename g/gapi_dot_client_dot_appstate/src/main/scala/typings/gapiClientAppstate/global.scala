package typings.gapiClientAppstate

import typings.gapiClientAppstate.gapi.client.appstate.StatesResource
import typings.gapiClientAppstate.gapiClientAppstateStrings.appstate
import typings.gapiClientAppstate.gapiClientAppstateStrings.v1
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
      val states: StatesResource = js.native
      /** Load Google App State API v1 */
      def load(name: appstate, version: v1): js.Thenable[Unit] = js.native
      def load(name: appstate, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

