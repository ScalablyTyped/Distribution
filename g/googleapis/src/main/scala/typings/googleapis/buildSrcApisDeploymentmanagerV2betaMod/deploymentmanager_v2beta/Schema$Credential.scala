package typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The credential used by Deployment Manager and TypeProvider. Only one of the
  * options is permitted.
  */
@js.native
trait Schema$Credential extends js.Object {
  /**
    * Basic Auth Credential, only used by TypeProvider.
    */
  var basicAuth: js.UndefOr[Schema$BasicAuth] = js.native
  /**
    * Service Account Credential, only used by Deployment.
    */
  var serviceAccount: js.UndefOr[Schema$ServiceAccount] = js.native
  /**
    * Specify to use the project default credential, only supported by
    * Deployment.
    */
  var useProjectDefault: js.UndefOr[Boolean] = js.native
}

object Schema$Credential {
  @scala.inline
  def apply(
    basicAuth: Schema$BasicAuth = null,
    serviceAccount: Schema$ServiceAccount = null,
    useProjectDefault: js.UndefOr[Boolean] = js.undefined
  ): Schema$Credential = {
    val __obj = js.Dynamic.literal()
    if (basicAuth != null) __obj.updateDynamic("basicAuth")(basicAuth.asInstanceOf[js.Any])
    if (serviceAccount != null) __obj.updateDynamic("serviceAccount")(serviceAccount.asInstanceOf[js.Any])
    if (!js.isUndefined(useProjectDefault)) __obj.updateDynamic("useProjectDefault")(useProjectDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Credential]
  }
}

