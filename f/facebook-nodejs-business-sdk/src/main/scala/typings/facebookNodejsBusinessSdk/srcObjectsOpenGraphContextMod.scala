package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsOpenGraphContextMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/open-graph-context", JSImport.Default)
  @js.native
  open class default () extends OpenGraphContext
  
  @js.native
  trait OpenGraphContext extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[OpenGraphContext] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[OpenGraphContext] = js.native
  }
}
