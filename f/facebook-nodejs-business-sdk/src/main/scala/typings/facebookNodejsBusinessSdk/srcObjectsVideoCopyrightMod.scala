package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.facebookNodejsBusinessSdkBooleans.`false`
import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsVideoCopyrightMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/video-copyright", JSImport.Default)
  @js.native
  open class default () extends VideoCopyright
  
  @js.native
  trait VideoCopyright extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[VideoCopyright] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[VideoCopyright] = js.native
    
    def getUpdateRecords(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getUpdateRecords(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getUpdateRecords(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getUpdateRecords(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getUpdateRecords")
    def getUpdateRecords_Promise(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getUpdateRecords")
    def getUpdateRecords_Promise(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getUpdateRecords")
    def getUpdateRecords_false(fields: js.Array[String], params: Unit, fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    @JSName("getUpdateRecords")
    def getUpdateRecords_false(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def update(fields: js.Array[String]): js.Promise[VideoCopyright] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[VideoCopyright] = js.native
  }
}
