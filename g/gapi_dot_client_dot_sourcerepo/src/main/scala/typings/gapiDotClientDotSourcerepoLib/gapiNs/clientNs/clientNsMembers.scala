package typings
package gapiDotClientDotSourcerepoLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val projects: gapiDotClientDotSourcerepoLib.gapiNs.clientNs.sourcerepoNs.ProjectsResource = js.native
  /** Load Cloud Source Repositories API v1 */
  def load(
    name: gapiDotClientDotSourcerepoLib.gapiDotClientDotSourcerepoLibStrings.sourcerepo,
    version: gapiDotClientDotSourcerepoLib.gapiDotClientDotSourcerepoLibStrings.v1
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotSourcerepoLib.gapiDotClientDotSourcerepoLibStrings.sourcerepo,
    version: gapiDotClientDotSourcerepoLib.gapiDotClientDotSourcerepoLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

