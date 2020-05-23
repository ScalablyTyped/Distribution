package typings.gapiClientGmail

import typings.gapiClientGmail.gapi.client.gmail.UsersResource
import typings.gapiClientGmail.gapiClientGmailStrings.gmail
import typings.gapiClientGmail.gapiClientGmailStrings.v1
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
      val users: UsersResource = js.native
      /** Load Gmail API v1 */
      def load(name: gmail, version: v1): js.Thenable[Unit] = js.native
      def load(name: gmail, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

