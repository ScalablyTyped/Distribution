package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an Identity and Access Management (IAM) policy. It is used to
  * specify access control policies for Cloud Platform resources.   A `Policy`
  * consists of a list of `bindings`. A `binding` binds a list of `members` to
  * a `role`, where the members can be user accounts, Google groups, Google
  * domains, and service accounts. A `role` is a named list of permissions
  * defined by IAM.  **JSON Example**      {       &quot;bindings&quot;: [ {
  * &quot;role&quot;: &quot;roles/owner&quot;,           &quot;members&quot;: [
  * &quot;user:mike@example.com&quot;, &quot;group:admins@example.com&quot;,
  * &quot;domain:google.com&quot;,
  * &quot;serviceAccount:my-other-app@appspot.gserviceaccount.com&quot; ] }, {
  * &quot;role&quot;: &quot;roles/viewer&quot;,           &quot;members&quot;:
  * [&quot;user:sean@example.com&quot;]         }       ]     }  **YAML
  * Example**      bindings:     - members:       - user:mike@example.com -
  * group:admins@example.com       - domain:google.com       -
  * serviceAccount:my-other-app@appspot.gserviceaccount.com       role:
  * roles/owner     - members:       - user:sean@example.com       role:
  * roles/viewer   For a description of IAM and its features, see the [IAM
  * developer&#39;s guide](https://cloud.google.com/iam/docs).
  */
@js.native
trait Schema$Policy extends js.Object {
  /**
    * Specifies cloud audit logging configuration for this policy.
    */
  var auditConfigs: js.UndefOr[js.Array[Schema$AuditConfig]] = js.native
  /**
    * Associates a list of `members` to a `role`. `bindings` with no members
    * will result in an error.
    */
  var bindings: js.UndefOr[js.Array[Schema$Binding]] = js.native
  /**
    * `etag` is used for optimistic concurrency control as a way to help
    * prevent simultaneous updates of a policy from overwriting each other. It
    * is strongly suggested that systems make use of the `etag` in the
    * read-modify-write cycle to perform policy updates in order to avoid race
    * conditions: An `etag` is returned in the response to `getIamPolicy`, and
    * systems are expected to put that etag in the request to `setIamPolicy` to
    * ensure that their change will be applied to the same version of the
    * policy.  If no `etag` is provided in the call to `setIamPolicy`, then the
    * existing policy is overwritten blindly.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Deprecated.
    */
  var version: js.UndefOr[Double] = js.native
}

object Schema$Policy {
  @scala.inline
  def apply(
    auditConfigs: js.Array[Schema$AuditConfig] = null,
    bindings: js.Array[Schema$Binding] = null,
    etag: String = null,
    version: Int | Double = null
  ): Schema$Policy = {
    val __obj = js.Dynamic.literal()
    if (auditConfigs != null) __obj.updateDynamic("auditConfigs")(auditConfigs.asInstanceOf[js.Any])
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Policy]
  }
}

