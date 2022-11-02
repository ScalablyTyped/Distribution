package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsIgbcAdsPermissionMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/igbc-ads-permission", JSImport.Default)
  @js.native
  open class default () extends IGBCAdsPermission
  
  @js.native
  trait IGBCAdsPermission extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[IGBCAdsPermission] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[IGBCAdsPermission] = js.native
  }
}
