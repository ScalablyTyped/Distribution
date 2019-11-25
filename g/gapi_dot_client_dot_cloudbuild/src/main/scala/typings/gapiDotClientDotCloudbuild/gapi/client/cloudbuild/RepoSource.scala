package typings.gapiDotClientDotCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoSource extends js.Object {
  /** Name of the branch to build. */
  var branchName: js.UndefOr[String] = js.undefined
  /** Explicit commit SHA to build. */
  var commitSha: js.UndefOr[String] = js.undefined
  /**
    * ID of the project that owns the repo. If omitted, the project ID requesting
    * the build is assumed.
    */
  var projectId: js.UndefOr[String] = js.undefined
  /** Name of the repo. If omitted, the name "default" is assumed. */
  var repoName: js.UndefOr[String] = js.undefined
  /** Name of the tag to build. */
  var tagName: js.UndefOr[String] = js.undefined
}

object RepoSource {
  @scala.inline
  def apply(
    branchName: String = null,
    commitSha: String = null,
    projectId: String = null,
    repoName: String = null,
    tagName: String = null
  ): RepoSource = {
    val __obj = js.Dynamic.literal()
    if (branchName != null) __obj.updateDynamic("branchName")(branchName.asInstanceOf[js.Any])
    if (commitSha != null) __obj.updateDynamic("commitSha")(commitSha.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (repoName != null) __obj.updateDynamic("repoName")(repoName.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoSource]
  }
}

