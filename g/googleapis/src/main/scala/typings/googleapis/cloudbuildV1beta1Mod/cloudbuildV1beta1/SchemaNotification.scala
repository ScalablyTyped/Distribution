package typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNotification extends StObject {
  
  /**
    * The filter string to use for notification filtering. Currently, this is assumed to be a CEL program. See https://opensource.google/projects/cel for more.
    */
  var filter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration for HTTP delivery.
    */
  var httpDelivery: js.UndefOr[SchemaHTTPDelivery] = js.undefined
  
  /**
    * Configuration for Slack delivery.
    */
  var slackDelivery: js.UndefOr[SchemaSlackDelivery] = js.undefined
  
  /**
    * Configuration for SMTP (email) delivery.
    */
  var smtpDelivery: js.UndefOr[SchemaSMTPDelivery] = js.undefined
  
  /**
    * Escape hatch for users to supply custom delivery configs.
    */
  var structDelivery: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaNotification {
  
  inline def apply(): SchemaNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotification]
  }
  
  extension [Self <: SchemaNotification](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setHttpDelivery(value: SchemaHTTPDelivery): Self = StObject.set(x, "httpDelivery", value.asInstanceOf[js.Any])
    
    inline def setHttpDeliveryUndefined: Self = StObject.set(x, "httpDelivery", js.undefined)
    
    inline def setSlackDelivery(value: SchemaSlackDelivery): Self = StObject.set(x, "slackDelivery", value.asInstanceOf[js.Any])
    
    inline def setSlackDeliveryUndefined: Self = StObject.set(x, "slackDelivery", js.undefined)
    
    inline def setSmtpDelivery(value: SchemaSMTPDelivery): Self = StObject.set(x, "smtpDelivery", value.asInstanceOf[js.Any])
    
    inline def setSmtpDeliveryUndefined: Self = StObject.set(x, "smtpDelivery", js.undefined)
    
    inline def setStructDelivery(value: StringDictionary[Any]): Self = StObject.set(x, "structDelivery", value.asInstanceOf[js.Any])
    
    inline def setStructDeliveryNull: Self = StObject.set(x, "structDelivery", null)
    
    inline def setStructDeliveryUndefined: Self = StObject.set(x, "structDelivery", js.undefined)
  }
}
