package typings.gapiClientServicecontrol

import typings.gapiClientServicecontrol.gapi.client.servicecontrol.ServicesResource
import typings.gapiClientServicecontrol.gapiClientServicecontrolStrings.servicecontrol
import typings.gapiClientServicecontrol.gapiClientServicecontrolStrings.v1
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
      val services: ServicesResource = js.native
      /** Load Google Service Control API v1 */
      def load(name: servicecontrol, version: v1): js.Thenable[Unit] = js.native
      def load(name: servicecontrol, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

