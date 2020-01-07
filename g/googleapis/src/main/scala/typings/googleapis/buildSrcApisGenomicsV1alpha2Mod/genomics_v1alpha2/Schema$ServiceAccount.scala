package typings.googleapis.buildSrcApisGenomicsV1alpha2Mod.genomics_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Google Cloud Service Account.
  */
@js.native
trait Schema$ServiceAccount extends js.Object {
  /**
    * Email address of the service account. Defaults to `default`, which uses
    * the compute service account associated with the project.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * List of scopes to be enabled for this service account on the VM. The
    * following scopes are automatically included:  *
    * https://www.googleapis.com/auth/compute *
    * https://www.googleapis.com/auth/devstorage.full_control *
    * https://www.googleapis.com/auth/genomics *
    * https://www.googleapis.com/auth/logging.write *
    * https://www.googleapis.com/auth/monitoring.write
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

