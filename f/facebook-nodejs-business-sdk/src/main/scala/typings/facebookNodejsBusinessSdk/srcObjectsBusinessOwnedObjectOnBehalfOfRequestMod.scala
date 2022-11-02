package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsBusinessOwnedObjectOnBehalfOfRequestMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/business-owned-object-on-behalf-of-request", JSImport.Default)
  @js.native
  open class default () extends BusinessOwnedObjectOnBehalfOfRequest
  
  @js.native
  trait BusinessOwnedObjectOnBehalfOfRequest extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[BusinessOwnedObjectOnBehalfOfRequest] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[BusinessOwnedObjectOnBehalfOfRequest] = js.native
  }
}
