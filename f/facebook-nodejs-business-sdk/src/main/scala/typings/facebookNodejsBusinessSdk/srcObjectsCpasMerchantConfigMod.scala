package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsCpasMerchantConfigMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/cpas-merchant-config", JSImport.Default)
  @js.native
  open class default () extends CPASMerchantConfig
  
  @js.native
  trait CPASMerchantConfig extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[CPASMerchantConfig] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[CPASMerchantConfig] = js.native
  }
}
