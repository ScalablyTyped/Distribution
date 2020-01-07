package typings.googleapis.buildSrcApisGenomicsV2alpha1Mod.genomics_v2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Carries information about a Google Cloud service account.
  */
@js.native
trait Schema$ServiceAccount extends js.Object {
  /**
    * Email address of the service account. If not specified, the default
    * Compute Engine service account for the project will be used.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * List of scopes to be enabled for this service account on the VM, in
    * addition to the Cloud Genomics API scope.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ServiceAccount {
  @scala.inline
  def apply(email: String = null, scopes: js.Array[String] = null): Schema$ServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ServiceAccount]
  }
}

