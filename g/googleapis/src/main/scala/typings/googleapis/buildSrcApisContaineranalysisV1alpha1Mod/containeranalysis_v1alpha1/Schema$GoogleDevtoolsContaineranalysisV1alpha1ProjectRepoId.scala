package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Selects a repo using a Google Cloud Platform project ID (e.g.,
  * winged-cargo-31) and a repo name within that project.
  */
@js.native
trait Schema$GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId extends js.Object {
  /**
    * The ID of the project.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The name of the repo. Leave empty for the default repo.
    */
  var repoName: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId {
  @scala.inline
  def apply(projectId: String = null, repoName: String = null): Schema$GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (repoName != null) __obj.updateDynamic("repoName")(repoName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId]
  }
}

