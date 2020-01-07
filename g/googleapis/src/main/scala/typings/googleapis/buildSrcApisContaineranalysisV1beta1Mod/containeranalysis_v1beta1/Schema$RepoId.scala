package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A unique identifier for a Cloud Repo.
  */
@js.native
trait Schema$RepoId extends js.Object {
  /**
    * A combination of a project ID and a repo name.
    */
  var projectRepoId: js.UndefOr[Schema$ProjectRepoId] = js.native
  /**
    * A server-assigned, globally unique identifier.
    */
  var uid: js.UndefOr[String] = js.native
}

object Schema$RepoId {
  @scala.inline
  def apply(projectRepoId: Schema$ProjectRepoId = null, uid: String = null): Schema$RepoId = {
    val __obj = js.Dynamic.literal()
    if (projectRepoId != null) __obj.updateDynamic("projectRepoId")(projectRepoId.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RepoId]
  }
}

