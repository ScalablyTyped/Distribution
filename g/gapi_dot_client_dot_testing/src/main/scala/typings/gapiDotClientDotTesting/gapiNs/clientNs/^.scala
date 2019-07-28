package typings.gapiDotClientDotTesting.gapiNs.clientNs

import typings.gapiDotClientDotTesting.gapiDotClientDotTestingStrings.testing
import typings.gapiDotClientDotTesting.gapiDotClientDotTestingStrings.v1
import typings.gapiDotClientDotTesting.gapiNs.clientNs.testingNs.ProjectsResource
import typings.gapiDotClientDotTesting.gapiNs.clientNs.testingNs.TestEnvironmentCatalogResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: ProjectsResource = js.native
  val testEnvironmentCatalog: TestEnvironmentCatalogResource = js.native
  /** Load Google Cloud Testing API v1 */
  def load(name: testing, version: v1): js.Thenable[Unit] = js.native
  def load(name: testing, version: v1, callback: js.Function0[_]): Unit = js.native
}

