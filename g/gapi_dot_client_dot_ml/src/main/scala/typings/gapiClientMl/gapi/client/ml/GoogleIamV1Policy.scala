package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleIamV1Policy extends js.Object {
  /** Specifies cloud audit logging configuration for this policy. */
  var auditConfigs: js.UndefOr[js.Array[GoogleIamV1AuditConfig]] = js.undefined
  /**
    * Associates a list of `members` to a `role`.
    * `bindings` with no members will result in an error.
    */
  var bindings: js.UndefOr[js.Array[GoogleIamV1Binding]] = js.undefined
  /**
    * `etag` is used for optimistic concurrency control as a way to help
    * prevent simultaneous updates of a policy from overwriting each other.
    * It is strongly suggested that systems make use of the `etag` in the
    * read-modify-write cycle to perform policy updates in order to avoid race
    * conditions: An `etag` is returned in the response to `getIamPolicy`, and
    * systems are expected to put that etag in the request to `setIamPolicy` to
    * ensure that their change will be applied to the same version of the policy.
    *
    * If no `etag` is provided in the call to `setIamPolicy`, then the existing
    * policy is overwritten blindly.
    */
  var etag: js.UndefOr[String] = js.undefined
  var iamOwned: js.UndefOr[Boolean] = js.undefined
  /** Version of the `Policy`. The default version is 0. */
  var version: js.UndefOr[Double] = js.undefined
}

object GoogleIamV1Policy {
  @scala.inline
  def apply(
    auditConfigs: js.Array[GoogleIamV1AuditConfig] = null,
    bindings: js.Array[GoogleIamV1Binding] = null,
    etag: String = null,
    iamOwned: js.UndefOr[Boolean] = js.undefined,
    version: js.UndefOr[Double] = js.undefined
  ): GoogleIamV1Policy = {
    val __obj = js.Dynamic.literal()
    if (auditConfigs != null) __obj.updateDynamic("auditConfigs")(auditConfigs.asInstanceOf[js.Any])
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(iamOwned)) __obj.updateDynamic("iamOwned")(iamOwned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleIamV1Policy]
  }
}

