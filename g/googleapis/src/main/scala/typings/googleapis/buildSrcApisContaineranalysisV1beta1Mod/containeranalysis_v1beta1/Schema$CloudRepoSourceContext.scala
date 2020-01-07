package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A CloudRepoSourceContext denotes a particular revision in a Google Cloud
  * Source Repo.
  */
@js.native
trait Schema$CloudRepoSourceContext extends js.Object {
  /**
    * An alias, which may be a branch or tag.
    */
  var aliasContext: js.UndefOr[Schema$AliasContext] = js.native
  /**
    * The ID of the repo.
    */
  var repoId: js.UndefOr[Schema$RepoId] = js.native
  /**
    * A revision ID.
    */
  var revisionId: js.UndefOr[String] = js.native
}

object Schema$CloudRepoSourceContext {
  @scala.inline
  def apply(aliasContext: Schema$AliasContext = null, repoId: Schema$RepoId = null, revisionId: String = null): Schema$CloudRepoSourceContext = {
    val __obj = js.Dynamic.literal()
    if (aliasContext != null) __obj.updateDynamic("aliasContext")(aliasContext.asInstanceOf[js.Any])
    if (repoId != null) __obj.updateDynamic("repoId")(repoId.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CloudRepoSourceContext]
  }
}

