package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsPageSavedFilterMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/page-saved-filter", JSImport.Default)
  @js.native
  open class default () extends PageSavedFilter
  
  @js.native
  trait PageSavedFilter extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[PageSavedFilter] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[PageSavedFilter] = js.native
  }
}
