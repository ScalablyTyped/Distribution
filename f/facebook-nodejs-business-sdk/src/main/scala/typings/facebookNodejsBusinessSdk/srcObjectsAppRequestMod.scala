package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsAppRequestMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/app-request", JSImport.Default)
  @js.native
  open class default () extends AppRequest
  
  @js.native
  trait AppRequest extends AbstractCrudObject {
    
    def delete(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def delete(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    
    def get(fields: js.Array[String]): js.Promise[AppRequest] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[AppRequest] = js.native
  }
}
