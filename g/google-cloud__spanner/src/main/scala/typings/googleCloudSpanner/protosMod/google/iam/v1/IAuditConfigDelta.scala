package typings.googleCloudSpanner.protosMod.google.iam.v1

import typings.googleCloudSpanner.protosMod.google.iam.v1.AuditConfigDelta.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an AuditConfigDelta. */
trait IAuditConfigDelta extends StObject {
  
  /** AuditConfigDelta action */
  var action: js.UndefOr[
    Action | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.iam.v1.AuditConfigDelta.Action * / any */ String) | Null
  ] = js.undefined
  
  /** AuditConfigDelta exemptedMember */
  var exemptedMember: js.UndefOr[String | Null] = js.undefined
  
  /** AuditConfigDelta logType */
  var logType: js.UndefOr[String | Null] = js.undefined
  
  /** AuditConfigDelta service */
  var service: js.UndefOr[String | Null] = js.undefined
}
object IAuditConfigDelta {
  
  inline def apply(): IAuditConfigDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAuditConfigDelta]
  }
  
  extension [Self <: IAuditConfigDelta](x: Self) {
    
    inline def setAction(
      value: Action | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.iam.v1.AuditConfigDelta.Action * / any */ String)
    ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setExemptedMember(value: String): Self = StObject.set(x, "exemptedMember", value.asInstanceOf[js.Any])
    
    inline def setExemptedMemberNull: Self = StObject.set(x, "exemptedMember", null)
    
    inline def setExemptedMemberUndefined: Self = StObject.set(x, "exemptedMember", js.undefined)
    
    inline def setLogType(value: String): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
    
    inline def setLogTypeNull: Self = StObject.set(x, "logType", null)
    
    inline def setLogTypeUndefined: Self = StObject.set(x, "logType", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
