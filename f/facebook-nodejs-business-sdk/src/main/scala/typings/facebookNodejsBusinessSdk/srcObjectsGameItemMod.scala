package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsGameItemMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/game-item", JSImport.Default)
  @js.native
  open class default () extends GameItem
  
  @js.native
  trait GameItem extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[GameItem] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[GameItem] = js.native
  }
}
