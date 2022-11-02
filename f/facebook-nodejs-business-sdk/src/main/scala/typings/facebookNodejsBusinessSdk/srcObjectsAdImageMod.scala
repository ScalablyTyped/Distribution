package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsAdImageMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/ad-image", JSImport.Default)
  @js.native
  open class default () extends AdImage
  
  @js.native
  trait AdImage extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[AdImage] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[AdImage] = js.native
  }
}
