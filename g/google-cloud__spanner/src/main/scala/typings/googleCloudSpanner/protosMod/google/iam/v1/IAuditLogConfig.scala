package typings.googleCloudSpanner.protosMod.google.iam.v1

import typings.googleCloudSpanner.protosMod.google.iam.v1.AuditLogConfig.LogType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an AuditLogConfig. */
trait IAuditLogConfig extends StObject {
  
  /** AuditLogConfig exemptedMembers */
  var exemptedMembers: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** AuditLogConfig logType */
  var logType: js.UndefOr[
    LogType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.iam.v1.AuditLogConfig.LogType * / any */ String) | Null
  ] = js.undefined
}
object IAuditLogConfig {
  
  inline def apply(): IAuditLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAuditLogConfig]
  }
  
  extension [Self <: IAuditLogConfig](x: Self) {
    
    inline def setExemptedMembers(value: js.Array[String]): Self = StObject.set(x, "exemptedMembers", value.asInstanceOf[js.Any])
    
    inline def setExemptedMembersNull: Self = StObject.set(x, "exemptedMembers", null)
    
    inline def setExemptedMembersUndefined: Self = StObject.set(x, "exemptedMembers", js.undefined)
    
    inline def setExemptedMembersVarargs(value: String*): Self = StObject.set(x, "exemptedMembers", js.Array(value*))
    
    inline def setLogType(
      value: LogType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.iam.v1.AuditLogConfig.LogType * / any */ String)
    ): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
    
    inline def setLogTypeNull: Self = StObject.set(x, "logType", null)
    
    inline def setLogTypeUndefined: Self = StObject.set(x, "logType", js.undefined)
  }
}
