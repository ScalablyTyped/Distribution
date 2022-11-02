package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsProductImageMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/product-image", JSImport.Default)
  @js.native
  open class default () extends ProductImage
  
  @js.native
  trait ProductImage extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[ProductImage] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[ProductImage] = js.native
  }
}
