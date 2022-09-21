package typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSMTPDelivery extends StObject {
  
  /**
    * This is the SMTP account/email that appears in the `From:` of the email. If empty, it is assumed to be sender.
    */
  var fromAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The SMTP sender's password.
    */
  var password: js.UndefOr[SchemaNotifierSecretRef] = js.undefined
  
  /**
    * The SMTP port of the server.
    */
  var port: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is the list of addresses to which we send the email (i.e. in the `To:` of the email).
    */
  var recipientAddresses: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * This is the SMTP account/email that is used to send the message.
    */
  var senderAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The address of the SMTP server.
    */
  var server: js.UndefOr[String | Null] = js.undefined
}
object SchemaSMTPDelivery {
  
  inline def apply(): SchemaSMTPDelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSMTPDelivery]
  }
  
  extension [Self <: SchemaSMTPDelivery](x: Self) {
    
    inline def setFromAddress(value: String): Self = StObject.set(x, "fromAddress", value.asInstanceOf[js.Any])
    
    inline def setFromAddressNull: Self = StObject.set(x, "fromAddress", null)
    
    inline def setFromAddressUndefined: Self = StObject.set(x, "fromAddress", js.undefined)
    
    inline def setPassword(value: SchemaNotifierSecretRef): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setRecipientAddresses(value: js.Array[String]): Self = StObject.set(x, "recipientAddresses", value.asInstanceOf[js.Any])
    
    inline def setRecipientAddressesNull: Self = StObject.set(x, "recipientAddresses", null)
    
    inline def setRecipientAddressesUndefined: Self = StObject.set(x, "recipientAddresses", js.undefined)
    
    inline def setRecipientAddressesVarargs(value: String*): Self = StObject.set(x, "recipientAddresses", js.Array(value*))
    
    inline def setSenderAddress(value: String): Self = StObject.set(x, "senderAddress", value.asInstanceOf[js.Any])
    
    inline def setSenderAddressNull: Self = StObject.set(x, "senderAddress", null)
    
    inline def setSenderAddressUndefined: Self = StObject.set(x, "senderAddress", js.undefined)
    
    inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerNull: Self = StObject.set(x, "server", null)
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
