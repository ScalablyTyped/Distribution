package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsLiveVideoErrorMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/live-video-error", JSImport.Default)
  @js.native
  open class default () extends LiveVideoError
  
  @js.native
  trait LiveVideoError extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[LiveVideoError] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[LiveVideoError] = js.native
  }
}
