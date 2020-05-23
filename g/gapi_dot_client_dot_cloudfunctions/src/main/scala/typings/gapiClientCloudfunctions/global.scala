package typings.gapiClientCloudfunctions

import typings.gapiClientCloudfunctions.gapi.client.cloudfunctions.OperationsResource
import typings.gapiClientCloudfunctions.gapi.client.cloudfunctions.ProjectsResource
import typings.gapiClientCloudfunctions.gapiClientCloudfunctionsStrings.cloudfunctions
import typings.gapiClientCloudfunctions.gapiClientCloudfunctionsStrings.v1
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
      val projects: ProjectsResource = js.native
      /** Load Google Cloud Functions API v1 */
      def load(name: cloudfunctions, version: v1): js.Thenable[Unit] = js.native
      def load(name: cloudfunctions, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

