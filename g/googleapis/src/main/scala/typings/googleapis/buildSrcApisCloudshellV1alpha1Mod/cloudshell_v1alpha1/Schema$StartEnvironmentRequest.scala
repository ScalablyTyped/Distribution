package typings.googleapis.buildSrcApisCloudshellV1alpha1Mod.cloudshell_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for StartEnvironment.
  */
@js.native
trait Schema$StartEnvironmentRequest extends js.Object {
  /**
    * The initial access token passed to the environment. If this is present
    * and valid, the environment will be pre-authenticated with gcloud so that
    * the user can run gcloud commands in Cloud Shell without having to log in.
    * This code can be updated later by calling AuthorizeEnvironment.
    */
  var accessToken: js.UndefOr[String] = js.native
}

object Schema$StartEnvironmentRequest {
  @scala.inline
  def apply(accessToken: String = null): Schema$StartEnvironmentRequest = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StartEnvironmentRequest]
  }
}

