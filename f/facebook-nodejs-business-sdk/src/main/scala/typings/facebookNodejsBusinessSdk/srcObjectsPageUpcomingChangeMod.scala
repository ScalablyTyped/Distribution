package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsPageUpcomingChangeMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/page-upcoming-change", JSImport.Default)
  @js.native
  open class default () extends PageUpcomingChange
  
  @js.native
  trait PageUpcomingChange extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[PageUpcomingChange] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[PageUpcomingChange] = js.native
    
    def update(fields: js.Array[String]): js.Promise[PageUpcomingChange] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[PageUpcomingChange] = js.native
  }
}
