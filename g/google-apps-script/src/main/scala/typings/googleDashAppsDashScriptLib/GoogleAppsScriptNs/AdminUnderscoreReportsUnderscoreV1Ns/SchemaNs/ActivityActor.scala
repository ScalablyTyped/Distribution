package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreReportsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityActor extends js.Object {
  var callerType: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var profileId: js.UndefOr[java.lang.String] = js.undefined
}

object ActivityActor {
  @scala.inline
  def apply(
    callerType: java.lang.String = null,
    email: java.lang.String = null,
    key: java.lang.String = null,
    profileId: java.lang.String = null
  ): ActivityActor = {
    val __obj = js.Dynamic.literal()
    if (callerType != null) __obj.updateDynamic("callerType")(callerType)
    if (email != null) __obj.updateDynamic("email")(email)
    if (key != null) __obj.updateDynamic("key")(key)
    if (profileId != null) __obj.updateDynamic("profileId")(profileId)
    __obj.asInstanceOf[ActivityActor]
  }
}

