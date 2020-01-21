package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A CloudRepoSourceContext denotes a particular revision in a cloud repo (a
  * repo hosted by the Google Cloud Platform).
  */
@js.native
trait SchemaCloudRepoSourceContext extends js.Object {
  /**
    * An alias, which may be a branch or tag.
    */
  var aliasContext: js.UndefOr[SchemaAliasContext] = js.native
  /**
    * The name of an alias (branch, tag, etc.).
    */
  var aliasName: js.UndefOr[String] = js.native
  /**
    * The ID of the repo.
    */
  var repoId: js.UndefOr[SchemaRepoId] = js.native
  /**
    * A revision ID.
    */
  var revisionId: js.UndefOr[String] = js.native
}

object SchemaCloudRepoSourceContext {
  @scala.inline
  def apply(
    aliasContext: SchemaAliasContext = null,
    aliasName: String = null,
    repoId: SchemaRepoId = null,
    revisionId: String = null
  ): SchemaCloudRepoSourceContext = {
    val __obj = js.Dynamic.literal()
    if (aliasContext != null) __obj.updateDynamic("aliasContext")(aliasContext.asInstanceOf[js.Any])
    if (aliasName != null) __obj.updateDynamic("aliasName")(aliasName.asInstanceOf[js.Any])
    if (repoId != null) __obj.updateDynamic("repoId")(repoId.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCloudRepoSourceContext]
  }
}

