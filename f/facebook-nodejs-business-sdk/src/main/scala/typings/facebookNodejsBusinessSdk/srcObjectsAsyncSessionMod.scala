package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsAsyncSessionMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/async-session", JSImport.Default)
  @js.native
  open class default () extends AsyncSession
  
  @js.native
  trait AsyncSession extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[AsyncSession] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[AsyncSession] = js.native
  }
}
