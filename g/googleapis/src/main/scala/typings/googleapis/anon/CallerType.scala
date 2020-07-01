package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallerType extends js.Object {
  var callerType: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var key: js.UndefOr[String] = js.native
  var profileId: js.UndefOr[String] = js.native
}

object CallerType {
  @scala.inline
  def apply(callerType: String = null, email: String = null, key: String = null, profileId: String = null): CallerType = {
    val __obj = js.Dynamic.literal()
    if (callerType != null) __obj.updateDynamic("callerType")(callerType.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallerType]
  }
}

