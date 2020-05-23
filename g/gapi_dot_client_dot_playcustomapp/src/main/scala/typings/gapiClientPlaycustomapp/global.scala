package typings.gapiClientPlaycustomapp

import typings.gapiClientPlaycustomapp.gapi.client.playcustomapp.AccountsResource
import typings.gapiClientPlaycustomapp.gapiClientPlaycustomappStrings.playcustomapp
import typings.gapiClientPlaycustomapp.gapiClientPlaycustomappStrings.v1
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
      val accounts: AccountsResource = js.native
      /** Load Google Play Custom App Publishing API v1 */
      def load(name: playcustomapp, version: v1): js.Thenable[Unit] = js.native
      def load(name: playcustomapp, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

