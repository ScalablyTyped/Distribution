package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsSavedMessageResponseMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/saved-message-response", JSImport.Default)
  @js.native
  open class default () extends SavedMessageResponse
  
  @js.native
  trait SavedMessageResponse extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[SavedMessageResponse] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[SavedMessageResponse] = js.native
  }
}
