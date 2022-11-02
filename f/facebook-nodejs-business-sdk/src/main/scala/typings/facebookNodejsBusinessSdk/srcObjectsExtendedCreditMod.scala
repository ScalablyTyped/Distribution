package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsExtendedCreditMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/extended-credit", JSImport.Default)
  @js.native
  open class default () extends ExtendedCredit
  
  @js.native
  trait ExtendedCredit extends AbstractCrudObject {
    
    def createExtendedCreditInvoiceGroup(fields: js.Array[String]): js.Promise[
        typings.facebookNodejsBusinessSdk.srcObjectsExtendedCreditInvoiceGroupMod.default
      ] = js.native
    def createExtendedCreditInvoiceGroup(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[
        typings.facebookNodejsBusinessSdk.srcObjectsExtendedCreditInvoiceGroupMod.default
      ] = js.native
    def createExtendedCreditInvoiceGroup(fields: js.Array[String], params: Record[String, Any]): js.Promise[
        typings.facebookNodejsBusinessSdk.srcObjectsExtendedCreditInvoiceGroupMod.default
      ] = js.native
    def createExtendedCreditInvoiceGroup(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[
        typings.facebookNodejsBusinessSdk.srcObjectsExtendedCreditInvoiceGroupMod.default
      ] = js.native
    
    def createOwningCreditAllocationConfig(fields: js.Array[String]): js.Promise[
        typings.facebookNodejsBusinessSdk.srcObjectsExtendedCreditAllocationConfigMod.default
      ] = js.native
    def createOwningCreditAllocationConfig(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[
        typings.facebookNodejsBusinessSdk.srcObjectsExtendedCreditAllocationConfigMod.default
      ] = js.native
    def createOwningCreditAllocationConfig(fields: js.Array[String], params: Record[String, Any]): js.Promise[
        typings.facebookNodejsBusinessSdk.srcObjectsExtendedCreditAllocationConfigMod.default
      ] = js.native
    def createOwningCreditAllocationConfig(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[
        typings.facebookNodejsBusinessSdk.srcObjectsExtendedCreditAllocationConfigMod.default
      ] = js.native
    
    def createWhatsappCreditSharingAndAttach(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def createWhatsappCreditSharingAndAttach(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def createWhatsappCreditSharingAndAttach(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def createWhatsappCreditSharingAndAttach(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    
    def get(fields: js.Array[String]): js.Promise[ExtendedCredit] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[ExtendedCredit] = js.native
    
    def getExtendedCreditInvoiceGroups(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getExtendedCreditInvoiceGroups(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getExtendedCreditInvoiceGroups(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getExtendedCreditInvoiceGroups(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getOwningCreditAllocationConfigs(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getOwningCreditAllocationConfigs(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getOwningCreditAllocationConfigs(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getOwningCreditAllocationConfigs(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
  }
}
