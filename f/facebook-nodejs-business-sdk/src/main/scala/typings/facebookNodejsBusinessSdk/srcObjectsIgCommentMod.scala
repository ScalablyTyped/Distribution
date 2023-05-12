package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.facebookNodejsBusinessSdkBooleans.`false`
import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsIgCommentMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/ig-comment", JSImport.Default)
  @js.native
  open class default () extends IGComment
  
  @js.native
  trait IGComment extends AbstractCrudObject {
    
    def createReply(fields: js.Array[String]): js.Promise[IGComment] = js.native
    def createReply(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[IGComment] = js.native
    def createReply(fields: js.Array[String], params: Record[String, Any]): js.Promise[IGComment] = js.native
    def createReply(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[IGComment] = js.native
    
    def delete(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def delete(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    
    def get(fields: js.Array[String]): js.Promise[IGComment] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[IGComment] = js.native
    
    def getReplies(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getReplies(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getReplies(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getReplies(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getReplies")
    def getReplies_Promise(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getReplies")
    def getReplies_Promise(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getReplies")
    def getReplies_false(fields: js.Array[String], params: Unit, fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    @JSName("getReplies")
    def getReplies_false(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def update(fields: js.Array[String]): js.Promise[IGComment] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[IGComment] = js.native
  }
}
