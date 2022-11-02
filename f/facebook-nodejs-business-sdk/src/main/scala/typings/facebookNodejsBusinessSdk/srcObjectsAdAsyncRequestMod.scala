package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsAdAsyncRequestMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/ad-async-request", JSImport.Default)
  @js.native
  open class default () extends AdAsyncRequest
  
  @js.native
  trait AdAsyncRequest extends AbstractCrudObject {
    
    def delete(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def delete(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    
    def get(fields: js.Array[String]): js.Promise[AdAsyncRequest] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[AdAsyncRequest] = js.native
  }
}
