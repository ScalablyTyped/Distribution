package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsAdRuleMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/ad-rule", JSImport.Default)
  @js.native
  open class default () extends AdRule
  
  @js.native
  trait AdRule extends AbstractCrudObject {
    
    def createExecute(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def createExecute(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def createExecute(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def createExecute(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    
    def createPreview(fields: js.Array[String]): js.Promise[AdRule] = js.native
    def createPreview(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[AdRule] = js.native
    def createPreview(fields: js.Array[String], params: Record[String, Any]): js.Promise[AdRule] = js.native
    def createPreview(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[AdRule] = js.native
    
    def delete(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def delete(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    
    def get(fields: js.Array[String]): js.Promise[AdRule] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[AdRule] = js.native
    
    def getHistory(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getHistory(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getHistory(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getHistory(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def update(fields: js.Array[String]): js.Promise[AdRule] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[AdRule] = js.native
  }
}
