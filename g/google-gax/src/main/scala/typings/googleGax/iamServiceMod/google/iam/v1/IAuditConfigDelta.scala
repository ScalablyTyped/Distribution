package typings.googleGax.iamServiceMod.google.iam.v1

import typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an AuditConfigDelta. */
trait IAuditConfigDelta extends StObject {
  
  /** AuditConfigDelta action */
  var action: js.UndefOr[Action | Null] = js.undefined
  
  /** AuditConfigDelta exemptedMember */
  var exemptedMember: js.UndefOr[String | Null] = js.undefined
  
  /** AuditConfigDelta logType */
  var logType: js.UndefOr[String | Null] = js.undefined
  
  /** AuditConfigDelta service */
  var service: js.UndefOr[String | Null] = js.undefined
}
object IAuditConfigDelta {
  
  @scala.inline
  def apply(): IAuditConfigDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAuditConfigDelta]
  }
  
  @scala.inline
  implicit class IAuditConfigDeltaMutableBuilder[Self <: IAuditConfigDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNull: Self = StObject.set(x, "action", null)
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setExemptedMember(value: String): Self = StObject.set(x, "exemptedMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExemptedMemberNull: Self = StObject.set(x, "exemptedMember", null)
    
    @scala.inline
    def setExemptedMemberUndefined: Self = StObject.set(x, "exemptedMember", js.undefined)
    
    @scala.inline
    def setLogType(value: String): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogTypeNull: Self = StObject.set(x, "logType", null)
    
    @scala.inline
    def setLogTypeUndefined: Self = StObject.set(x, "logType", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNull: Self = StObject.set(x, "service", null)
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
