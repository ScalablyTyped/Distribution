package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsCloudGameMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/cloud-game", JSImport.Default)
  @js.native
  open class default () extends CloudGame
  
  @js.native
  trait CloudGame extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[CloudGame] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[CloudGame] = js.native
  }
}
