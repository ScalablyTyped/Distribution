package typings.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the configuration for logging a type of permissions. Example: {
  * &quot;audit_log_configs&quot;: [         {           &quot;log_type&quot;:
  * &quot;DATA_READ&quot;,           &quot;exempted_members&quot;: [
  * &quot;user:foo@gmail.com&quot;           ]         },         {
  * &quot;log_type&quot;: &quot;DATA_WRITE&quot;,         }       ]     }  This
  * enables &#39;DATA_READ&#39; and &#39;DATA_WRITE&#39; logging, while
  * exempting foo@gmail.com from DATA_READ logging.
  */
trait SchemaAuditLogConfig extends StObject {
  
  /**
    * Specifies the identities that do not cause logging for this type of
    * permission. Follows the same format of Binding.members.
    */
  var exemptedMembers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The log type that this config enables.
    */
  var logType: js.UndefOr[String] = js.undefined
}
object SchemaAuditLogConfig {
  
  inline def apply(): SchemaAuditLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuditLogConfig]
  }
  
  extension [Self <: SchemaAuditLogConfig](x: Self) {
    
    inline def setExemptedMembers(value: js.Array[String]): Self = StObject.set(x, "exemptedMembers", value.asInstanceOf[js.Any])
    
    inline def setExemptedMembersUndefined: Self = StObject.set(x, "exemptedMembers", js.undefined)
    
    inline def setExemptedMembersVarargs(value: String*): Self = StObject.set(x, "exemptedMembers", js.Array(value :_*))
    
    inline def setLogType(value: String): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
    
    inline def setLogTypeUndefined: Self = StObject.set(x, "logType", js.undefined)
  }
}
