package typings.googleapis.buildSrcApisSecuritycenterV1Mod.securitycenter_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IAM Policy information associated with the GCP resource described by the
  * Cloud SCC asset. This information is managed and defined by the GCP
  * resource and cannot be modified by the user.
  */
@js.native
trait Schema$IamPolicy extends js.Object {
  /**
    * The JSON representation of the Policy associated with the asset. See
    * https://cloud.google.com/iam/reference/rest/v1/Policy for format details.
    */
  var policyBlob: js.UndefOr[String] = js.native
}

object Schema$IamPolicy {
  @scala.inline
  def apply(policyBlob: String = null): Schema$IamPolicy = {
    val __obj = js.Dynamic.literal()
    if (policyBlob != null) __obj.updateDynamic("policyBlob")(policyBlob.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IamPolicy]
  }
}

