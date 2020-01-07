package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The matching user resources.
  */
@js.native
trait Schema$UsersListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#usersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A user of an enterprise.
    */
  var user: js.UndefOr[js.Array[Schema$User]] = js.native
}

object Schema$UsersListResponse {
  @scala.inline
  def apply(kind: String = null, user: js.Array[Schema$User] = null): Schema$UsersListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UsersListResponse]
  }
}

