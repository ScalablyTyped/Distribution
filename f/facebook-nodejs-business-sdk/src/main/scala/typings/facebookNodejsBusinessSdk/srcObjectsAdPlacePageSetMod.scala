package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsAdPlacePageSetMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/ad-place-page-set", JSImport.Default)
  @js.native
  open class default () extends AdPlacePageSet
  
  @js.native
  trait AdPlacePageSet extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[AdPlacePageSet] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[AdPlacePageSet] = js.native
  }
}
