package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsCpasCollaborationRequestMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/cpas-collaboration-request", JSImport.Default)
  @js.native
  open class default () extends CPASCollaborationRequest
  
  @js.native
  trait CPASCollaborationRequest extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[CPASCollaborationRequest] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[CPASCollaborationRequest] = js.native
  }
}
