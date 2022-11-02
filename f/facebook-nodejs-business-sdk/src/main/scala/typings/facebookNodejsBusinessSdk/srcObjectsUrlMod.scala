package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsUrlMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/url", JSImport.Default)
  @js.native
  open class default () extends URL
  
  @js.native
  trait URL extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[URL] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[URL] = js.native
    
    def update(fields: js.Array[String]): js.Promise[URL] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[URL] = js.native
  }
}
