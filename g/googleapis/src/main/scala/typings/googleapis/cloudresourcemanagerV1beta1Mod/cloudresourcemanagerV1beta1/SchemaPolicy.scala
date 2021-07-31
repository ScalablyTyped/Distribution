package typings.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait SchemaPolicy extends StObject {
  
  /**
    * Specifies cloud audit logging configuration for this policy.
    */
  var auditConfigs: js.UndefOr[js.Array[SchemaAuditConfig]] = js.undefined
  
  /**
    * Associates a list of `members` to a `role`. `bindings` with no members
    * will result in an error.
    */
  var bindings: js.UndefOr[js.Array[SchemaBinding]] = js.undefined
  
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
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated.
    */
  var version: js.UndefOr[Double] = js.undefined
}
object SchemaPolicy {
  
  @scala.inline
  def apply(): SchemaPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicy]
  }
  
  @scala.inline
  implicit class SchemaPolicyMutableBuilder[Self <: SchemaPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuditConfigs(value: js.Array[SchemaAuditConfig]): Self = StObject.set(x, "auditConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditConfigsUndefined: Self = StObject.set(x, "auditConfigs", js.undefined)
    
    @scala.inline
    def setAuditConfigsVarargs(value: SchemaAuditConfig*): Self = StObject.set(x, "auditConfigs", js.Array(value :_*))
    
    @scala.inline
    def setBindings(value: js.Array[SchemaBinding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    @scala.inline
    def setBindingsVarargs(value: SchemaBinding*): Self = StObject.set(x, "bindings", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
