package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsVideoListMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/video-list", JSImport.Default)
  @js.native
  open class default () extends VideoList
  
  @js.native
  trait VideoList extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[VideoList] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[VideoList] = js.native
    
    def getVideos(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getVideos(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getVideos(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getVideos(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
  }
}
