package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsPhotoMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/photo", JSImport.Default)
  @js.native
  open class default () extends Photo
  
  @js.native
  trait Photo extends AbstractCrudObject {
    
    def createComment(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsCommentMod.default] = js.native
    def createComment(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsCommentMod.default] = js.native
    def createComment(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsCommentMod.default] = js.native
    def createComment(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsCommentMod.default] = js.native
    
    def createLike(fields: js.Array[String]): js.Promise[Photo] = js.native
    def createLike(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[Photo] = js.native
    def createLike(fields: js.Array[String], params: Record[String, Any]): js.Promise[Photo] = js.native
    def createLike(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[Photo] = js.native
    
    def delete(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def delete(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    
    def get(fields: js.Array[String]): js.Promise[Photo] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[Photo] = js.native
    
    def getComments(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getComments(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getComments(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getComments(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getInsights(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getInsights(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getInsights(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getInsights(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getLikes(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getLikes(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getLikes(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getLikes(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getSponsorTags(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getSponsorTags(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getSponsorTags(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getSponsorTags(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
  }
}
