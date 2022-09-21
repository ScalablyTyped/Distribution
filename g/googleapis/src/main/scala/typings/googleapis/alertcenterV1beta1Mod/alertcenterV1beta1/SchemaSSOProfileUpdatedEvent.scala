package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSSOProfileUpdatedEvent extends StObject {
  
  /**
    * changes made to sso profile
    */
  var inboundSsoProfileChanges: js.UndefOr[String | Null] = js.undefined
  
  /**
    * sso profile name which got updated
    */
  var inboundSsoProfileName: js.UndefOr[String | Null] = js.undefined
}
object SchemaSSOProfileUpdatedEvent {
  
  inline def apply(): SchemaSSOProfileUpdatedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSSOProfileUpdatedEvent]
  }
  
  extension [Self <: SchemaSSOProfileUpdatedEvent](x: Self) {
    
    inline def setInboundSsoProfileChanges(value: String): Self = StObject.set(x, "inboundSsoProfileChanges", value.asInstanceOf[js.Any])
    
    inline def setInboundSsoProfileChangesNull: Self = StObject.set(x, "inboundSsoProfileChanges", null)
    
    inline def setInboundSsoProfileChangesUndefined: Self = StObject.set(x, "inboundSsoProfileChanges", js.undefined)
    
    inline def setInboundSsoProfileName(value: String): Self = StObject.set(x, "inboundSsoProfileName", value.asInstanceOf[js.Any])
    
    inline def setInboundSsoProfileNameNull: Self = StObject.set(x, "inboundSsoProfileName", null)
    
    inline def setInboundSsoProfileNameUndefined: Self = StObject.set(x, "inboundSsoProfileName", js.undefined)
  }
}
