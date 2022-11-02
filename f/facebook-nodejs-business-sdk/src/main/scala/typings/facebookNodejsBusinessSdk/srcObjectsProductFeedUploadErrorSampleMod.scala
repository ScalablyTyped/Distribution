package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsProductFeedUploadErrorSampleMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/product-feed-upload-error-sample", JSImport.Default)
  @js.native
  open class default () extends ProductFeedUploadErrorSample
  
  @js.native
  trait ProductFeedUploadErrorSample extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[ProductFeedUploadErrorSample] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[ProductFeedUploadErrorSample] = js.native
  }
}
