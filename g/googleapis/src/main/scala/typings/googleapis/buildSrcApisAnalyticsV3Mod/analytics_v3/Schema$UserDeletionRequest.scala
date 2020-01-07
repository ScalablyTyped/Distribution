package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.googleapis.Anon_Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a user deletion request resource.
  */
@js.native
trait Schema$UserDeletionRequest extends js.Object {
  /**
    * This marks the point in time for which all user data before should be
    * deleted
    */
  var deletionRequestTime: js.UndefOr[String] = js.native
  /**
    * Firebase Project Id
    */
  var firebaseProjectId: js.UndefOr[String] = js.native
  /**
    * User ID.
    */
  var id: js.UndefOr[Anon_Type] = js.native
  /**
    * Value is &quot;analytics#userDeletionRequest&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Web property ID of the form UA-XXXXX-YY.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}

object Schema$UserDeletionRequest {
  @scala.inline
  def apply(
    deletionRequestTime: String = null,
    firebaseProjectId: String = null,
    id: Anon_Type = null,
    kind: String = null,
    webPropertyId: String = null
  ): Schema$UserDeletionRequest = {
    val __obj = js.Dynamic.literal()
    if (deletionRequestTime != null) __obj.updateDynamic("deletionRequestTime")(deletionRequestTime.asInstanceOf[js.Any])
    if (firebaseProjectId != null) __obj.updateDynamic("firebaseProjectId")(firebaseProjectId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserDeletionRequest]
  }
}

