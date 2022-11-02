package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsPageUserMessageThreadLabelMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/page-user-message-thread-label", JSImport.Default)
  @js.native
  open class default () extends PageUserMessageThreadLabel
  
  @js.native
  trait PageUserMessageThreadLabel extends AbstractCrudObject {
    
    def createLabel(fields: js.Array[String]): js.Promise[PageUserMessageThreadLabel] = js.native
    def createLabel(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[PageUserMessageThreadLabel] = js.native
    def createLabel(fields: js.Array[String], params: Record[String, Any]): js.Promise[PageUserMessageThreadLabel] = js.native
    def createLabel(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[PageUserMessageThreadLabel] = js.native
    
    def delete(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def delete(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    
    def deleteLabel(): js.Promise[Any] = js.native
    def deleteLabel(params: Record[String, Any]): js.Promise[Any] = js.native
    
    def get(fields: js.Array[String]): js.Promise[PageUserMessageThreadLabel] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[PageUserMessageThreadLabel] = js.native
  }
}
