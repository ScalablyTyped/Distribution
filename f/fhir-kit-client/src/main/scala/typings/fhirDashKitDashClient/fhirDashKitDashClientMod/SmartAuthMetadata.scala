package typings.fhirDashKitDashClient.fhirDashKitDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartAuthMetadata extends js.Object {
  var authorizeUrl: js.UndefOr[String] = js.undefined
  var manageUrl: js.UndefOr[String] = js.undefined
  var registerUrl: js.UndefOr[String] = js.undefined
  var tokenUrl: js.UndefOr[String] = js.undefined
}

object SmartAuthMetadata {
  @scala.inline
  def apply(
    authorizeUrl: String = null,
    manageUrl: String = null,
    registerUrl: String = null,
    tokenUrl: String = null
  ): SmartAuthMetadata = {
    val __obj = js.Dynamic.literal()
    if (authorizeUrl != null) __obj.updateDynamic("authorizeUrl")(authorizeUrl)
    if (manageUrl != null) __obj.updateDynamic("manageUrl")(manageUrl)
    if (registerUrl != null) __obj.updateDynamic("registerUrl")(registerUrl)
    if (tokenUrl != null) __obj.updateDynamic("tokenUrl")(tokenUrl)
    __obj.asInstanceOf[SmartAuthMetadata]
  }
}

