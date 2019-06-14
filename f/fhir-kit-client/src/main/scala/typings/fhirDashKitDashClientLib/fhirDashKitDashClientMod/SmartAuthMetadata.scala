package typings
package fhirDashKitDashClientLib.fhirDashKitDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartAuthMetadata extends js.Object {
  var authorizeUrl: js.UndefOr[java.lang.String] = js.undefined
  var manageUrl: js.UndefOr[java.lang.String] = js.undefined
  var registerUrl: js.UndefOr[java.lang.String] = js.undefined
  var tokenUrl: js.UndefOr[java.lang.String] = js.undefined
}

object SmartAuthMetadata {
  @scala.inline
  def apply(
    authorizeUrl: java.lang.String = null,
    manageUrl: java.lang.String = null,
    registerUrl: java.lang.String = null,
    tokenUrl: java.lang.String = null
  ): SmartAuthMetadata = {
    val __obj = js.Dynamic.literal()
    if (authorizeUrl != null) __obj.updateDynamic("authorizeUrl")(authorizeUrl)
    if (manageUrl != null) __obj.updateDynamic("manageUrl")(manageUrl)
    if (registerUrl != null) __obj.updateDynamic("registerUrl")(registerUrl)
    if (tokenUrl != null) __obj.updateDynamic("tokenUrl")(tokenUrl)
    __obj.asInstanceOf[SmartAuthMetadata]
  }
}

