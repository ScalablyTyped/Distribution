package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsCustomAudienceMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/custom-audience", JSImport.Default)
  @js.native
  open class default () extends CustomAudience
  
  @js.native
  trait CustomAudience extends AbstractCrudObject {
    
    def createAdAccount(fields: js.Array[String]): js.Promise[CustomAudience] = js.native
    def createAdAccount(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[CustomAudience] = js.native
    def createAdAccount(fields: js.Array[String], params: Record[String, Any]): js.Promise[CustomAudience] = js.native
    def createAdAccount(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[CustomAudience] = js.native
    
    def createUser(fields: js.Array[String]): js.Promise[CustomAudience] = js.native
    def createUser(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[CustomAudience] = js.native
    def createUser(fields: js.Array[String], params: Record[String, Any]): js.Promise[CustomAudience] = js.native
    def createUser(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[CustomAudience] = js.native
    
    def createUsersReplace(fields: js.Array[String]): js.Promise[CustomAudience] = js.native
    def createUsersReplace(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[CustomAudience] = js.native
    def createUsersReplace(fields: js.Array[String], params: Record[String, Any]): js.Promise[CustomAudience] = js.native
    def createUsersReplace(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[CustomAudience] = js.native
    
    def delete(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def delete(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    
    def deleteAdAccounts(): js.Promise[Any] = js.native
    def deleteAdAccounts(params: Record[String, Any]): js.Promise[Any] = js.native
    
    def deleteUsers(): js.Promise[Any] = js.native
    def deleteUsers(params: Record[String, Any]): js.Promise[Any] = js.native
    
    def get(fields: js.Array[String]): js.Promise[CustomAudience] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[CustomAudience] = js.native
    
    def getAdAccounts(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAdAccounts(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAdAccounts(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAdAccounts(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getAds(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAds(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAds(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAds(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getSessions(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getSessions(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getSessions(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getSessions(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getSharedAccountInfo(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getSharedAccountInfo(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getSharedAccountInfo(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getSharedAccountInfo(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def update(fields: js.Array[String]): js.Promise[CustomAudience] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[CustomAudience] = js.native
  }
}
