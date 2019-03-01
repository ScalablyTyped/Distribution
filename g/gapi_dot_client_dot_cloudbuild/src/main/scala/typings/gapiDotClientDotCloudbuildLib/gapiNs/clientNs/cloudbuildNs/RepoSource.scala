package typings
package gapiDotClientDotCloudbuildLib.gapiNs.clientNs.cloudbuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoSource extends js.Object {
  /** Name of the branch to build. */
  var branchName: js.UndefOr[java.lang.String] = js.undefined
  /** Explicit commit SHA to build. */
  var commitSha: js.UndefOr[java.lang.String] = js.undefined
  /**
    * ID of the project that owns the repo. If omitted, the project ID requesting
    * the build is assumed.
    */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the repo. If omitted, the name "default" is assumed. */
  var repoName: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the tag to build. */
  var tagName: js.UndefOr[java.lang.String] = js.undefined
}

object RepoSource {
  @scala.inline
  def apply(
    branchName: java.lang.String = null,
    commitSha: java.lang.String = null,
    projectId: java.lang.String = null,
    repoName: java.lang.String = null,
    tagName: java.lang.String = null
  ): RepoSource = {
    val __obj = js.Dynamic.literal()
    if (branchName != null) __obj.updateDynamic("branchName")(branchName)
    if (commitSha != null) __obj.updateDynamic("commitSha")(commitSha)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (repoName != null) __obj.updateDynamic("repoName")(repoName)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[RepoSource]
  }
}

