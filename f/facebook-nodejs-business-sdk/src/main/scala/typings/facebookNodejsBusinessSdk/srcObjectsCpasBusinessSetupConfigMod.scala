package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsCpasBusinessSetupConfigMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/cpas-business-setup-config", JSImport.Default)
  @js.native
  open class default () extends CPASBusinessSetupConfig
  
  @js.native
  trait CPASBusinessSetupConfig extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[CPASBusinessSetupConfig] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[CPASBusinessSetupConfig] = js.native
    
    def getAdAccounts(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAdAccounts(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAdAccounts(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAdAccounts(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def update(fields: js.Array[String]): js.Promise[CPASBusinessSetupConfig] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[CPASBusinessSetupConfig] = js.native
  }
}
