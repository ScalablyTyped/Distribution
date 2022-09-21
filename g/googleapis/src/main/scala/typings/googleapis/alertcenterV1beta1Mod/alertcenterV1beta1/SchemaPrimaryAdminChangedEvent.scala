package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrimaryAdminChangedEvent extends StObject {
  
  /**
    * domain in which actioned occurred
    */
  var domain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Email of person who was the primary admin before the action
    */
  var previousAdminEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Email of person who is the primary admin after the action
    */
  var updatedAdminEmail: js.UndefOr[String | Null] = js.undefined
}
object SchemaPrimaryAdminChangedEvent {
  
  inline def apply(): SchemaPrimaryAdminChangedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrimaryAdminChangedEvent]
  }
  
  extension [Self <: SchemaPrimaryAdminChangedEvent](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setPreviousAdminEmail(value: String): Self = StObject.set(x, "previousAdminEmail", value.asInstanceOf[js.Any])
    
    inline def setPreviousAdminEmailNull: Self = StObject.set(x, "previousAdminEmail", null)
    
    inline def setPreviousAdminEmailUndefined: Self = StObject.set(x, "previousAdminEmail", js.undefined)
    
    inline def setUpdatedAdminEmail(value: String): Self = StObject.set(x, "updatedAdminEmail", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAdminEmailNull: Self = StObject.set(x, "updatedAdminEmail", null)
    
    inline def setUpdatedAdminEmailUndefined: Self = StObject.set(x, "updatedAdminEmail", js.undefined)
  }
}
