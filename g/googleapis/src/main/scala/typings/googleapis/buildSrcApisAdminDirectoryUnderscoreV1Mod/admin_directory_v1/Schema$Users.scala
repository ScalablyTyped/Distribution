package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template for List Users operation in Apps Directory API.
  */
@js.native
trait Schema$Users extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token used to access next page of this result.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Event that triggered this response (only used in case of Push Response)
    */
  var trigger_event: js.UndefOr[String] = js.native
  /**
    * List of user objects.
    */
  var users: js.UndefOr[js.Array[Schema$User]] = js.native
}

object Schema$Users {
  @scala.inline
  def apply(
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null,
    trigger_event: String = null,
    users: js.Array[Schema$User] = null
  ): Schema$Users = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (trigger_event != null) __obj.updateDynamic("trigger_event")(trigger_event.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Users]
  }
}

