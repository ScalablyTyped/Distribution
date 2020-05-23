package typings.gapiClientTesting

import typings.gapiClientTesting.gapi.client.testing.ProjectsResource
import typings.gapiClientTesting.gapi.client.testing.TestEnvironmentCatalogResource
import typings.gapiClientTesting.gapiClientTestingStrings.testing
import typings.gapiClientTesting.gapiClientTestingStrings.v1
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
      val testEnvironmentCatalog: TestEnvironmentCatalogResource = js.native
      /** Load Google Cloud Testing API v1 */
      def load(name: testing, version: v1): js.Thenable[Unit] = js.native
      def load(name: testing, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

