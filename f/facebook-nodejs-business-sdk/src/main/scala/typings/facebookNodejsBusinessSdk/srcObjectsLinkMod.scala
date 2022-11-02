package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsLinkMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/link", JSImport.Default)
  @js.native
  open class default () extends Link
  
  @js.native
  trait Link extends AbstractCrudObject {
    
    def createComment(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsCommentMod.default] = js.native
    def createComment(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsCommentMod.default] = js.native
    def createComment(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsCommentMod.default] = js.native
    def createComment(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsCommentMod.default] = js.native
    
    def get(fields: js.Array[String]): js.Promise[Link] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[Link] = js.native
    
    def getLikes(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getLikes(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getLikes(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getLikes(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
  }
}
