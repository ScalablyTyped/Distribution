package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsWhatsAppBusinessPreVerifiedPhoneNumberMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/whats-app-business-pre-verified-phone-number", JSImport.Default)
  @js.native
  open class default () extends WhatsAppBusinessPreVerifiedPhoneNumber
  
  @js.native
  trait WhatsAppBusinessPreVerifiedPhoneNumber extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[WhatsAppBusinessPreVerifiedPhoneNumber] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[WhatsAppBusinessPreVerifiedPhoneNumber] = js.native
  }
}
