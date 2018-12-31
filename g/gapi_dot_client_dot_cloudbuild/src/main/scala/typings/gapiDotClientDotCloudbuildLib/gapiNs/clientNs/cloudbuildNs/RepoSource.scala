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

