package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsProductFeedUploadMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/product-feed-upload", JSImport.Default)
  @js.native
  open class default () extends ProductFeedUpload
  
  @js.native
  trait ProductFeedUpload extends AbstractCrudObject {
    
    def createErrorReport(fields: js.Array[String]): js.Promise[ProductFeedUpload] = js.native
    def createErrorReport(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[ProductFeedUpload] = js.native
    def createErrorReport(fields: js.Array[String], params: Record[String, Any]): js.Promise[ProductFeedUpload] = js.native
    def createErrorReport(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[ProductFeedUpload] = js.native
    
    def get(fields: js.Array[String]): js.Promise[ProductFeedUpload] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[ProductFeedUpload] = js.native
    
    def getErrors(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getErrors(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getErrors(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getErrors(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
  }
}
