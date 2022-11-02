package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsProductFeedRuleMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/product-feed-rule", JSImport.Default)
  @js.native
  open class default () extends ProductFeedRule
  
  @js.native
  trait ProductFeedRule extends AbstractCrudObject {
    
    def delete(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def delete(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    
    def get(fields: js.Array[String]): js.Promise[ProductFeedRule] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[ProductFeedRule] = js.native
    
    def update(fields: js.Array[String]): js.Promise[ProductFeedRule] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[ProductFeedRule] = js.native
  }
}
