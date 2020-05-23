package typings.gapiClientContainer

import typings.gapiClientContainer.gapi.client.container.ProjectsResource
import typings.gapiClientContainer.gapiClientContainerStrings.container
import typings.gapiClientContainer.gapiClientContainerStrings.v1
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
      val projects: ProjectsResource = js.native
      /** Load Google Container Engine API v1 */
      def load(name: container, version: v1): js.Thenable[Unit] = js.native
      def load(name: container, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

