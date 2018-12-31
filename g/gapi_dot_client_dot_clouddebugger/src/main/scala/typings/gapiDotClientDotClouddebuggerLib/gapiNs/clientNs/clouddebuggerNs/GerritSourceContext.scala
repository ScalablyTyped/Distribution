package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GerritSourceContext extends js.Object {
  /** An alias, which may be a branch or tag. */
  var aliasContext: js.UndefOr[AliasContext] = js.undefined
  /** The name of an alias (branch, tag, etc.). */
  var aliasName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The full project name within the host. Projects may be nested, so
    * "project/subproject" is a valid project name.
    * The "repo name" is hostURI/project.
    */
  var gerritProject: js.UndefOr[java.lang.String] = js.undefined
  /** The URI of a running Gerrit instance. */
  var hostUri: js.UndefOr[java.lang.String] = js.undefined
  /** A revision (commit) ID. */
  var revisionId: js.UndefOr[java.lang.String] = js.undefined
}

