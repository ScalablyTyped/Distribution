package typings.googleapis.buildSrcApisFirebaserulesV1Mod.firebaserules_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for FirebaseRulesService.UpdateReleasePatch.
  */
@js.native
trait Schema$UpdateReleaseRequest extends js.Object {
  /**
    * `Release` to update.
    */
  var release: js.UndefOr[Schema$Release] = js.native
  /**
    * Specifies which fields to update.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object Schema$UpdateReleaseRequest {
  @scala.inline
  def apply(release: Schema$Release = null, updateMask: String = null): Schema$UpdateReleaseRequest = {
    val __obj = js.Dynamic.literal()
    if (release != null) __obj.updateDynamic("release")(release.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateReleaseRequest]
  }
}

