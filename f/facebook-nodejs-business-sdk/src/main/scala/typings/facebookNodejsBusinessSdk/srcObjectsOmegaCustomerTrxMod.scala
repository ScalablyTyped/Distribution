package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsOmegaCustomerTrxMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/omega-customer-trx", JSImport.Default)
  @js.native
  open class default () extends OmegaCustomerTrx
  
  @js.native
  trait OmegaCustomerTrx extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[OmegaCustomerTrx] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[OmegaCustomerTrx] = js.native
    
    def getCampaigns(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getCampaigns(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getCampaigns(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getCampaigns(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
  }
}
