package typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service Account used as a credential.
  */
@js.native
trait Schema$ServiceAccount extends js.Object {
  /**
    * The IAM service account email address like
    * test@myproject.iam.gserviceaccount.com
    */
  var email: js.UndefOr[String] = js.native
}

object Schema$ServiceAccount {
  @scala.inline
  def apply(email: String = null): Schema$ServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ServiceAccount]
  }
}

