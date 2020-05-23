package typings.gapiClientOslogin

import typings.gapiClientOslogin.gapi.client.oslogin.UsersResource
import typings.gapiClientOslogin.gapiClientOsloginStrings.oslogin
import typings.gapiClientOslogin.gapiClientOsloginStrings.v1alpha
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
      /** Load Google Cloud OS Login API v1alpha */
      def load(name: oslogin, version: v1alpha): js.Thenable[Unit] = js.native
      def load(name: oslogin, version: v1alpha, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

