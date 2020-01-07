package typings.googleapis.buildSrcApisSourcerepoV1Mod.sourcerepo_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for UpdateRepo.
  */
@js.native
trait Schema$UpdateRepoRequest extends js.Object {
  /**
    * The new configuration for the repository.
    */
  var repo: js.UndefOr[Schema$Repo] = js.native
  /**
    * A FieldMask specifying which fields of the repo to modify. Only the
    * fields in the mask will be modified. If no mask is provided, this request
    * is no-op.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object Schema$UpdateRepoRequest {
  @scala.inline
  def apply(repo: Schema$Repo = null, updateMask: String = null): Schema$UpdateRepoRequest = {
    val __obj = js.Dynamic.literal()
    if (repo != null) __obj.updateDynamic("repo")(repo.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateRepoRequest]
  }
}

