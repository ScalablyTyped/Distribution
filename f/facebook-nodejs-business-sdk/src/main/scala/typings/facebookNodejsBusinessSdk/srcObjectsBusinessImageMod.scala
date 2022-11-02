package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsBusinessImageMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/business-image", JSImport.Default)
  @js.native
  open class default () extends BusinessImage
  
  @js.native
  trait BusinessImage extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[BusinessImage] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[BusinessImage] = js.native
  }
}
