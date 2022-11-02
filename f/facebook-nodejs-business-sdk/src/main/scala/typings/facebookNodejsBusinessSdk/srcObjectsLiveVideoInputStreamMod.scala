package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsLiveVideoInputStreamMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/live-video-input-stream", JSImport.Default)
  @js.native
  open class default () extends LiveVideoInputStream
  
  @js.native
  trait LiveVideoInputStream extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[LiveVideoInputStream] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[LiveVideoInputStream] = js.native
  }
}
