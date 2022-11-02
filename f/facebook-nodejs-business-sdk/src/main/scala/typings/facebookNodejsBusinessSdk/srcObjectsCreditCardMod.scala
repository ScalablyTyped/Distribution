package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsCreditCardMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/credit-card", JSImport.Default)
  @js.native
  open class default () extends CreditCard
  
  @js.native
  trait CreditCard extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[CreditCard] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[CreditCard] = js.native
  }
}
