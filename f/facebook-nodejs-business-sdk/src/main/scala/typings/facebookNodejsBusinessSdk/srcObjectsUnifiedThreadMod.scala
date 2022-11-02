package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsUnifiedThreadMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/unified-thread", JSImport.Default)
  @js.native
  open class default () extends UnifiedThread
  
  @js.native
  trait UnifiedThread extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[UnifiedThread] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[UnifiedThread] = js.native
    
    def getMessages(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getMessages(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getMessages(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getMessages(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
  }
}
