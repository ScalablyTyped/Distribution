package typings.gapiClientDiscovery

import typings.gapiClientDiscovery.gapi.client.discovery.ApisResource
import typings.gapiClientDiscovery.gapiClientDiscoveryStrings.discovery
import typings.gapiClientDiscovery.gapiClientDiscoveryStrings.v1
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
      /** Load API Discovery Service v1 */
      def load(name: discovery, version: v1): js.Thenable[Unit] = js.native
      def load(name: discovery, version: v1, callback: js.Function0[_]): Unit = js.native
      @js.native
      object discovery extends js.Object {
        val apis: ApisResource = js.native
      }
      
    }
    
  }
  
}

