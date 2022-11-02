package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsPlaceMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/place", JSImport.Default)
  @js.native
  open class default () extends Place
  
  @js.native
  trait Place extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[Place] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[Place] = js.native
  }
}
