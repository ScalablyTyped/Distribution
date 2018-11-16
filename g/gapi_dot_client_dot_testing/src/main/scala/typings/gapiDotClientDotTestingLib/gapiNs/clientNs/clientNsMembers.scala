package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val projects: gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs.ProjectsResource = js.native
  val testEnvironmentCatalog: gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs.TestEnvironmentCatalogResource = js.native
  /** Load Google Cloud Testing API v1 */
  def load(
    name: gapiDotClientDotTestingLib.gapiDotClientDotTestingLibStrings.testing,
    version: gapiDotClientDotTestingLib.gapiDotClientDotTestingLibStrings.v1
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotTestingLib.gapiDotClientDotTestingLibStrings.testing,
    version: gapiDotClientDotTestingLib.gapiDotClientDotTestingLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

