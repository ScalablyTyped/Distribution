package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsProductFeedScheduleMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/product-feed-schedule", JSImport.Default)
  @js.native
  open class default () extends ProductFeedSchedule
  
  @js.native
  trait ProductFeedSchedule extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[ProductFeedSchedule] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[ProductFeedSchedule] = js.native
  }
}
