package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A CloudRepoSourceContext denotes a particular revision in a Google Cloud
  * Source Repo.
  */
@js.native
trait Schema$GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext extends js.Object {
  /**
    * An alias, which may be a branch or tag.
    */
  var aliasContext: js.UndefOr[Schema$GoogleDevtoolsContaineranalysisV1alpha1AliasContext] = js.native
  /**
    * The ID of the repo.
    */
  var repoId: js.UndefOr[Schema$GoogleDevtoolsContaineranalysisV1alpha1RepoId] = js.native
  /**
    * A revision ID.
    */
  var revisionId: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext {
  @scala.inline
  def apply(
    aliasContext: Schema$GoogleDevtoolsContaineranalysisV1alpha1AliasContext = null,
    repoId: Schema$GoogleDevtoolsContaineranalysisV1alpha1RepoId = null,
    revisionId: String = null
  ): Schema$GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext = {
    val __obj = js.Dynamic.literal()
    if (aliasContext != null) __obj.updateDynamic("aliasContext")(aliasContext.asInstanceOf[js.Any])
    if (repoId != null) __obj.updateDynamic("repoId")(repoId.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext]
  }
}

