package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsPlaceTopicMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/place-topic", JSImport.Default)
  @js.native
  open class default () extends PlaceTopic
  
  @js.native
  trait PlaceTopic extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[PlaceTopic] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[PlaceTopic] = js.native
  }
}
