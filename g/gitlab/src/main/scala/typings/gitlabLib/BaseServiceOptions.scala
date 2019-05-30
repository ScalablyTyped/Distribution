package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseServiceOptions extends Sudo {
  var camelize: js.UndefOr[scala.Boolean] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var jobToken: js.UndefOr[java.lang.String] = js.undefined
  var oauthToken: js.UndefOr[java.lang.String] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  var requester: js.UndefOr[Requester] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object BaseServiceOptions {
  @scala.inline
  def apply(
    camelize: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    jobToken: java.lang.String = null,
    oauthToken: java.lang.String = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    requester: Requester = null,
    sudo: java.lang.String | scala.Double = null,
    token: java.lang.String = null,
    url: java.lang.String = null,
    version: java.lang.String = null
  ): BaseServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(camelize)) __obj.updateDynamic("camelize")(camelize)
    if (host != null) __obj.updateDynamic("host")(host)
    if (jobToken != null) __obj.updateDynamic("jobToken")(jobToken)
    if (oauthToken != null) __obj.updateDynamic("oauthToken")(oauthToken)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (requester != null) __obj.updateDynamic("requester")(requester)
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    if (url != null) __obj.updateDynamic("url")(url)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[BaseServiceOptions]
  }
}

