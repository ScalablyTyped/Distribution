package typings.gapiClientAdexchangeseller

import typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller.AccountsResource
import typings.gapiClientAdexchangeseller.gapiClientAdexchangesellerStrings.adexchangeseller
import typings.gapiClientAdexchangeseller.gapiClientAdexchangesellerStrings.v2Dot0
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
      /** Load Ad Exchange Seller API v2.0 */
      def load(name: adexchangeseller, version: v2Dot0): js.Thenable[Unit] = js.native
      def load(name: adexchangeseller, version: v2Dot0, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

