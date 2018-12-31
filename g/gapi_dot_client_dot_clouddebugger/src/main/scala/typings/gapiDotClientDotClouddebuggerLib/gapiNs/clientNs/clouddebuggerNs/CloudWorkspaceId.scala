package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWorkspaceId extends js.Object {
  /**
    * The unique name of the workspace within the repo.  This is the name
    * chosen by the client in the Source API's CreateWorkspace method.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the repo containing the workspace. */
  var repoId: js.UndefOr[RepoId] = js.undefined
}

