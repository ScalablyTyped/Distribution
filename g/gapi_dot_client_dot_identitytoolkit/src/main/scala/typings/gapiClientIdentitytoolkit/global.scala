package typings.gapiClientIdentitytoolkit

import typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit.RelyingpartyResource
import typings.gapiClientIdentitytoolkit.gapiClientIdentitytoolkitStrings.identitytoolkit
import typings.gapiClientIdentitytoolkit.gapiClientIdentitytoolkitStrings.v3
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
      val relyingparty: RelyingpartyResource = js.native
      /** Load Google Identity Toolkit API v3 */
      def load(name: identitytoolkit, version: v3): js.Thenable[Unit] = js.native
      def load(name: identitytoolkit, version: v3, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

