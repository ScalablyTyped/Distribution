package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the configuration for logging a type of permissions. Example: {
  * &quot;audit_log_configs&quot;: [         {           &quot;log_type&quot;:
  * &quot;DATA_READ&quot;,           &quot;exempted_members&quot;: [
  * &quot;user:foo@gmail.com&quot;           ]         },         {
  * &quot;log_type&quot;: &quot;DATA_WRITE&quot;,         }       ]     }  This
  * enables &#39;DATA_READ&#39; and &#39;DATA_WRITE&#39; logging, while
  * exempting foo@gmail.com from DATA_READ logging.
  */
@js.native
trait SchemaGoogleIamV1AuditLogConfig extends js.Object {
  /**
    * Specifies the identities that do not cause logging for this type of
    * permission. Follows the same format of Binding.members.
    */
  var exemptedMembers: js.UndefOr[js.Array[String]] = js.native
  /**
    * The log type that this config enables.
    */
  var logType: js.UndefOr[String] = js.native
}

object SchemaGoogleIamV1AuditLogConfig {
  @scala.inline
  def apply(exemptedMembers: js.Array[String] = null, logType: String = null): SchemaGoogleIamV1AuditLogConfig = {
    val __obj = js.Dynamic.literal()
    if (exemptedMembers != null) __obj.updateDynamic("exemptedMembers")(exemptedMembers.asInstanceOf[js.Any])
    if (logType != null) __obj.updateDynamic("logType")(logType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleIamV1AuditLogConfig]
  }
}

