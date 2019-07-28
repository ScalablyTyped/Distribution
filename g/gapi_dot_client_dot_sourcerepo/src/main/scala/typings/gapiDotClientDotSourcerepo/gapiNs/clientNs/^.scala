package typings.gapiDotClientDotSourcerepo.gapiNs.clientNs

import typings.gapiDotClientDotSourcerepo.gapiDotClientDotSourcerepoStrings.sourcerepo
import typings.gapiDotClientDotSourcerepo.gapiDotClientDotSourcerepoStrings.v1
import typings.gapiDotClientDotSourcerepo.gapiNs.clientNs.sourcerepoNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: ProjectsResource = js.native
  /** Load Cloud Source Repositories API v1 */
  def load(name: sourcerepo, version: v1): js.Thenable[Unit] = js.native
  def load(name: sourcerepo, version: v1, callback: js.Function0[_]): Unit = js.native
}

