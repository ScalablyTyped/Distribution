package typings.gapiClientPlaymoviespartner

import typings.gapiClientPlaymoviespartner.gapi.client.playmoviespartner.AccountsResource
import typings.gapiClientPlaymoviespartner.gapiClientPlaymoviespartnerStrings.playmoviespartner
import typings.gapiClientPlaymoviespartner.gapiClientPlaymoviespartnerStrings.v1
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
      /** Load Google Play Movies Partner API v1 */
      def load(name: playmoviespartner, version: v1): js.Thenable[Unit] = js.native
      def load(name: playmoviespartner, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

