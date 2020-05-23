package typings.gapiClientRuntimeconfig

import typings.gapiClientRuntimeconfig.gapi.client.runtimeconfig.OperationsResource
import typings.gapiClientRuntimeconfig.gapiClientRuntimeconfigStrings.runtimeconfig
import typings.gapiClientRuntimeconfig.gapiClientRuntimeconfigStrings.v1
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
      val operations: OperationsResource = js.native
      /** Load Google Cloud Runtime Configuration API v1 */
      def load(name: runtimeconfig, version: v1): js.Thenable[Unit] = js.native
      def load(name: runtimeconfig, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

