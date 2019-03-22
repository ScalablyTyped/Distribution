package typings
package gitlabLib.distEs5InfrastructureBaseServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseModelOptions extends js.Object {
  var jobToken: js.UndefOr[java.lang.String] = js.undefined
  var oauthToken: js.UndefOr[java.lang.String] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  var sudo: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var useXMLHttpRequest: js.UndefOr[scala.Boolean] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object BaseModelOptions {
  @scala.inline
  def apply(
    jobToken: java.lang.String = null,
    oauthToken: java.lang.String = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    sudo: java.lang.String | scala.Double = null,
    token: java.lang.String = null,
    url: java.lang.String = null,
    useXMLHttpRequest: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null
  ): BaseModelOptions = {
    val __obj = js.Dynamic.literal()
    if (jobToken != null) __obj.updateDynamic("jobToken")(jobToken)
    if (oauthToken != null) __obj.updateDynamic("oauthToken")(oauthToken)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(useXMLHttpRequest)) __obj.updateDynamic("useXMLHttpRequest")(useXMLHttpRequest)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[BaseModelOptions]
  }
}

