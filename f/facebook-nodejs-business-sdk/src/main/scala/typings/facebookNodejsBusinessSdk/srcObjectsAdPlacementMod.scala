package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsAdPlacementMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/ad-placement", JSImport.Default)
  @js.native
  open class default () extends AdPlacement
  
  @js.native
  trait AdPlacement extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[AdPlacement] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[AdPlacement] = js.native
  }
}
