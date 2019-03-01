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

object GerritSourceContext {
  @scala.inline
  def apply(
    aliasContext: AliasContext = null,
    aliasName: java.lang.String = null,
    gerritProject: java.lang.String = null,
    hostUri: java.lang.String = null,
    revisionId: java.lang.String = null
  ): GerritSourceContext = {
    val __obj = js.Dynamic.literal()
    if (aliasContext != null) __obj.updateDynamic("aliasContext")(aliasContext)
    if (aliasName != null) __obj.updateDynamic("aliasName")(aliasName)
    if (gerritProject != null) __obj.updateDynamic("gerritProject")(gerritProject)
    if (hostUri != null) __obj.updateDynamic("hostUri")(hostUri)
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId)
    __obj.asInstanceOf[GerritSourceContext]
  }
}

