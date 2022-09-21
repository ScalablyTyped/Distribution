package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSensitiveAdminAction extends StObject {
  
  /**
    * Email of person who performed the action
    */
  var actorEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which event occurred
    */
  var eventTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Event occurred when primary admin changed in customer's account
    */
  var primaryAdminChangedEvent: js.UndefOr[SchemaPrimaryAdminChangedEvent] = js.undefined
  
  /**
    * Event occurred when SSO Profile created in customer's account
    */
  var ssoProfileCreatedEvent: js.UndefOr[SchemaSSOProfileCreatedEvent] = js.undefined
  
  /**
    * Event occurred when SSO Profile deleted in customer's account
    */
  var ssoProfileDeletedEvent: js.UndefOr[SchemaSSOProfileDeletedEvent] = js.undefined
  
  /**
    * Event occurred when SSO Profile updated in customer's account
    */
  var ssoProfileUpdatedEvent: js.UndefOr[SchemaSSOProfileUpdatedEvent] = js.undefined
  
  /**
    * Event occurred when password was reset for super admin in customer's account
    */
  var superAdminPasswordResetEvent: js.UndefOr[SchemaSuperAdminPasswordResetEvent] = js.undefined
}
object SchemaSensitiveAdminAction {
  
  inline def apply(): SchemaSensitiveAdminAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSensitiveAdminAction]
  }
  
  extension [Self <: SchemaSensitiveAdminAction](x: Self) {
    
    inline def setActorEmail(value: String): Self = StObject.set(x, "actorEmail", value.asInstanceOf[js.Any])
    
    inline def setActorEmailNull: Self = StObject.set(x, "actorEmail", null)
    
    inline def setActorEmailUndefined: Self = StObject.set(x, "actorEmail", js.undefined)
    
    inline def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeNull: Self = StObject.set(x, "eventTime", null)
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setPrimaryAdminChangedEvent(value: SchemaPrimaryAdminChangedEvent): Self = StObject.set(x, "primaryAdminChangedEvent", value.asInstanceOf[js.Any])
    
    inline def setPrimaryAdminChangedEventUndefined: Self = StObject.set(x, "primaryAdminChangedEvent", js.undefined)
    
    inline def setSsoProfileCreatedEvent(value: SchemaSSOProfileCreatedEvent): Self = StObject.set(x, "ssoProfileCreatedEvent", value.asInstanceOf[js.Any])
    
    inline def setSsoProfileCreatedEventUndefined: Self = StObject.set(x, "ssoProfileCreatedEvent", js.undefined)
    
    inline def setSsoProfileDeletedEvent(value: SchemaSSOProfileDeletedEvent): Self = StObject.set(x, "ssoProfileDeletedEvent", value.asInstanceOf[js.Any])
    
    inline def setSsoProfileDeletedEventUndefined: Self = StObject.set(x, "ssoProfileDeletedEvent", js.undefined)
    
    inline def setSsoProfileUpdatedEvent(value: SchemaSSOProfileUpdatedEvent): Self = StObject.set(x, "ssoProfileUpdatedEvent", value.asInstanceOf[js.Any])
    
    inline def setSsoProfileUpdatedEventUndefined: Self = StObject.set(x, "ssoProfileUpdatedEvent", js.undefined)
    
    inline def setSuperAdminPasswordResetEvent(value: SchemaSuperAdminPasswordResetEvent): Self = StObject.set(x, "superAdminPasswordResetEvent", value.asInstanceOf[js.Any])
    
    inline def setSuperAdminPasswordResetEventUndefined: Self = StObject.set(x, "superAdminPasswordResetEvent", js.undefined)
  }
}
