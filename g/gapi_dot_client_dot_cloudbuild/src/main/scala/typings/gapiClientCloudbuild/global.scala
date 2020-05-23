package typings.gapiClientCloudbuild

import typings.gapiClientCloudbuild.gapi.client.cloudbuild.OperationsResource
import typings.gapiClientCloudbuild.gapi.client.cloudbuild.ProjectsResource
import typings.gapiClientCloudbuild.gapiClientCloudbuildStrings.cloudbuild
import typings.gapiClientCloudbuild.gapiClientCloudbuildStrings.v1
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
      /** Load Google Cloud Container Builder API v1 */
      def load(name: cloudbuild, version: v1): js.Thenable[Unit] = js.native
      def load(name: cloudbuild, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

