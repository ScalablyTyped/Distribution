package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsWhatsAppBusinessAccountMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/whats-app-business-account", JSImport.Default)
  @js.native
  open class default () extends WhatsAppBusinessAccount
  
  @js.native
  trait WhatsAppBusinessAccount extends AbstractCrudObject {
    
    def createAssignedUser(fields: js.Array[String]): js.Promise[WhatsAppBusinessAccount] = js.native
    def createAssignedUser(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[WhatsAppBusinessAccount] = js.native
    def createAssignedUser(fields: js.Array[String], params: Record[String, Any]): js.Promise[WhatsAppBusinessAccount] = js.native
    def createAssignedUser(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[WhatsAppBusinessAccount] = js.native
    
    def createMessageTemplate(fields: js.Array[String]): js.Promise[WhatsAppBusinessAccount] = js.native
    def createMessageTemplate(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[WhatsAppBusinessAccount] = js.native
    def createMessageTemplate(fields: js.Array[String], params: Record[String, Any]): js.Promise[WhatsAppBusinessAccount] = js.native
    def createMessageTemplate(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[WhatsAppBusinessAccount] = js.native
    
    def createPhoneNumber(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def createPhoneNumber(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def createPhoneNumber(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def createPhoneNumber(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    
    def createProductCatalog(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsProductCatalogMod.default] = js.native
    def createProductCatalog(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsProductCatalogMod.default] = js.native
    def createProductCatalog(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsProductCatalogMod.default] = js.native
    def createProductCatalog(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsProductCatalogMod.default] = js.native
    
    def createSubscribedApp(fields: js.Array[String]): js.Promise[WhatsAppBusinessAccount] = js.native
    def createSubscribedApp(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[WhatsAppBusinessAccount] = js.native
    def createSubscribedApp(fields: js.Array[String], params: Record[String, Any]): js.Promise[WhatsAppBusinessAccount] = js.native
    def createSubscribedApp(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[WhatsAppBusinessAccount] = js.native
    
    def deleteAssignedUsers(): js.Promise[Any] = js.native
    def deleteAssignedUsers(params: Record[String, Any]): js.Promise[Any] = js.native
    
    def deleteMessageTemplates(): js.Promise[Any] = js.native
    def deleteMessageTemplates(params: Record[String, Any]): js.Promise[Any] = js.native
    
    def deleteProductCatalogs(): js.Promise[Any] = js.native
    def deleteProductCatalogs(params: Record[String, Any]): js.Promise[Any] = js.native
    
    def deleteSubscribedApps(): js.Promise[Any] = js.native
    def deleteSubscribedApps(params: Record[String, Any]): js.Promise[Any] = js.native
    
    def get(fields: js.Array[String]): js.Promise[WhatsAppBusinessAccount] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[WhatsAppBusinessAccount] = js.native
    
    def getAssignedUsers(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAssignedUsers(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAssignedUsers(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAssignedUsers(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getAudiences(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAudiences(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAudiences(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAudiences(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getConversationAnalytics(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getConversationAnalytics(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getConversationAnalytics(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getConversationAnalytics(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getMessageTemplates(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getMessageTemplates(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getMessageTemplates(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getMessageTemplates(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getPhoneNumbers(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPhoneNumbers(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPhoneNumbers(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPhoneNumbers(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getProductCatalogs(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getProductCatalogs(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getProductCatalogs(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getProductCatalogs(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getSubscribedApps(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getSubscribedApps(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getSubscribedApps(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getSubscribedApps(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
  }
}
