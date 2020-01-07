package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List AccountUsers Response.
  */
@js.native
trait Schema$ListAccountUsersResponse extends js.Object {
  /**
    * All GTM AccountUsers of a GTM Account.
    */
  var userAccess: js.UndefOr[js.Array[Schema$UserAccess]] = js.native
}

object Schema$ListAccountUsersResponse {
  @scala.inline
  def apply(userAccess: js.Array[Schema$UserAccess] = null): Schema$ListAccountUsersResponse = {
    val __obj = js.Dynamic.literal()
    if (userAccess != null) __obj.updateDynamic("userAccess")(userAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListAccountUsersResponse]
  }
}

