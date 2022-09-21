package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSSOProfileCreatedEvent extends StObject {
  
  /**
    * sso profile name which got created
    */
  var inboundSsoProfileName: js.UndefOr[String | Null] = js.undefined
}
object SchemaSSOProfileCreatedEvent {
  
  inline def apply(): SchemaSSOProfileCreatedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSSOProfileCreatedEvent]
  }
  
  extension [Self <: SchemaSSOProfileCreatedEvent](x: Self) {
    
    inline def setInboundSsoProfileName(value: String): Self = StObject.set(x, "inboundSsoProfileName", value.asInstanceOf[js.Any])
    
    inline def setInboundSsoProfileNameNull: Self = StObject.set(x, "inboundSsoProfileName", null)
    
    inline def setInboundSsoProfileNameUndefined: Self = StObject.set(x, "inboundSsoProfileName", js.undefined)
  }
}
