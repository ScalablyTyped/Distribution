package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsMailingAddressMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/mailing-address", JSImport.Default)
  @js.native
  open class default () extends MailingAddress
  
  @js.native
  trait MailingAddress extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[MailingAddress] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[MailingAddress] = js.native
  }
}
