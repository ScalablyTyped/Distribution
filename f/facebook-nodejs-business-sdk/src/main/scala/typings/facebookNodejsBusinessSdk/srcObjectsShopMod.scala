package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsShopMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/shop", JSImport.Default)
  @js.native
  open class default () extends Shop
  
  @js.native
  trait Shop extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[Shop] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[Shop] = js.native
  }
}
