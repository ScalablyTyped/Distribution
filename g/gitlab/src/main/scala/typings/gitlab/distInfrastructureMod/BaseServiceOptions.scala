package typings.gitlab.distInfrastructureMod

import typings.gitlab.gitlabStrings.v3
import typings.gitlab.gitlabStrings.v4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseServiceOptions extends Sudo {
  var camelize: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var jobToken: js.UndefOr[String] = js.undefined
  var oauthToken: js.UndefOr[String] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  var requestTimeout: js.UndefOr[Double] = js.undefined
  var requester: js.UndefOr[Requester] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[v3 | v4] = js.undefined
}

object BaseServiceOptions {
  @scala.inline
  def apply(
    camelize: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    jobToken: String = null,
    oauthToken: String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    requestTimeout: Int | Double = null,
    requester: Requester = null,
    sudo: String | Double = null,
    token: String = null,
    url: String = null,
    version: v3 | v4 = null
  ): BaseServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(camelize)) __obj.updateDynamic("camelize")(camelize)
    if (host != null) __obj.updateDynamic("host")(host)
    if (jobToken != null) __obj.updateDynamic("jobToken")(jobToken)
    if (oauthToken != null) __obj.updateDynamic("oauthToken")(oauthToken)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester)
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    if (url != null) __obj.updateDynamic("url")(url)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseServiceOptions]
  }
}

