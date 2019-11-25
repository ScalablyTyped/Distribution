package typings.gitlab.distTypesCoreInfrastructureBaseServiceMod

import typings.gitlab.gitlabNumbers.`3`
import typings.gitlab.gitlabNumbers.`4`
import typings.gitlab.gitlabStrings.execution
import typings.gitlab.gitlabStrings.memory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseServiceOptions extends js.Object {
  var camelize: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var jobToken: js.UndefOr[String] = js.undefined
  var oauthToken: js.UndefOr[String] = js.undefined
  var profileMode: js.UndefOr[execution | memory] = js.undefined
  var profileToken: js.UndefOr[String] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  var requestTimeout: js.UndefOr[Double] = js.undefined
  var requester: js.UndefOr[Requester] = js.undefined
  var sudo: js.UndefOr[String | Double] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[`3` | `4`] = js.undefined
}

object BaseServiceOptions {
  @scala.inline
  def apply(
    camelize: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    jobToken: String = null,
    oauthToken: String = null,
    profileMode: execution | memory = null,
    profileToken: String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    requestTimeout: Int | Double = null,
    requester: Requester = null,
    sudo: String | Double = null,
    token: String = null,
    url: String = null,
    version: `3` | `4` = null
  ): BaseServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(camelize)) __obj.updateDynamic("camelize")(camelize.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (jobToken != null) __obj.updateDynamic("jobToken")(jobToken.asInstanceOf[js.Any])
    if (oauthToken != null) __obj.updateDynamic("oauthToken")(oauthToken.asInstanceOf[js.Any])
    if (profileMode != null) __obj.updateDynamic("profileMode")(profileMode.asInstanceOf[js.Any])
    if (profileToken != null) __obj.updateDynamic("profileToken")(profileToken.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseServiceOptions]
  }
}

