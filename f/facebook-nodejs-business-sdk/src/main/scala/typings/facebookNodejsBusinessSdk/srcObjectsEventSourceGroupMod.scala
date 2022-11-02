package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsEventSourceGroupMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/event-source-group", JSImport.Default)
  @js.native
  open class default () extends EventSourceGroup
  
  @js.native
  trait EventSourceGroup extends AbstractCrudObject {
    
    def createSharedAccount(fields: js.Array[String]): js.Promise[EventSourceGroup] = js.native
    def createSharedAccount(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[EventSourceGroup] = js.native
    def createSharedAccount(fields: js.Array[String], params: Record[String, Any]): js.Promise[EventSourceGroup] = js.native
    def createSharedAccount(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[EventSourceGroup] = js.native
    
    def get(fields: js.Array[String]): js.Promise[EventSourceGroup] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[EventSourceGroup] = js.native
    
    def getSharedAccounts(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getSharedAccounts(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getSharedAccounts(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getSharedAccounts(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def update(fields: js.Array[String]): js.Promise[EventSourceGroup] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[EventSourceGroup] = js.native
  }
}
