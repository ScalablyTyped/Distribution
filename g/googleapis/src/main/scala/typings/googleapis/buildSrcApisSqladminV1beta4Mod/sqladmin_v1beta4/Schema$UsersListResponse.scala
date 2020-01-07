package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User list response.
  */
@js.native
trait Schema$UsersListResponse extends js.Object {
  /**
    * List of user resources in the instance.
    */
  var items: js.UndefOr[js.Array[Schema$User]] = js.native
  /**
    * This is always sql#usersList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * An identifier that uniquely identifies the operation. You can use this
    * identifier to retrieve the Operations resource that has information about
    * the operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$UsersListResponse {
  @scala.inline
  def apply(items: js.Array[Schema$User] = null, kind: String = null, nextPageToken: String = null): Schema$UsersListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UsersListResponse]
  }
}

