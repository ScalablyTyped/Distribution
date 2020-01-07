package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a user reference.
  */
@js.native
trait Schema$UserRef extends js.Object {
  /**
    * Email ID of this user.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * User ID.
    */
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
}

object Schema$UserRef {
  @scala.inline
  def apply(email: String = null, id: String = null, kind: String = null): Schema$UserRef = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserRef]
  }
}

