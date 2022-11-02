package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsExtendedCreditInvoiceGroupMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/extended-credit-invoice-group", JSImport.Default)
  @js.native
  open class default () extends ExtendedCreditInvoiceGroup
  
  @js.native
  trait ExtendedCreditInvoiceGroup extends AbstractCrudObject {
    
    def createAdAccount(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsAdAccountMod.default] = js.native
    def createAdAccount(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsAdAccountMod.default] = js.native
    def createAdAccount(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsAdAccountMod.default] = js.native
    def createAdAccount(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsAdAccountMod.default] = js.native
    
    def delete(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def delete(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    
    def deleteAdAccounts(): js.Promise[Any] = js.native
    def deleteAdAccounts(params: Record[String, Any]): js.Promise[Any] = js.native
    
    def get(fields: js.Array[String]): js.Promise[ExtendedCreditInvoiceGroup] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[ExtendedCreditInvoiceGroup] = js.native
    
    def getAdAccounts(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAdAccounts(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAdAccounts(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAdAccounts(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def update(fields: js.Array[String]): js.Promise[ExtendedCreditInvoiceGroup] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[ExtendedCreditInvoiceGroup] = js.native
  }
}
