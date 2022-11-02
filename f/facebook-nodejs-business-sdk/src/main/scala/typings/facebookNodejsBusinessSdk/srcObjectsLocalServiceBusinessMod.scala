package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsLocalServiceBusinessMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/local-service-business", JSImport.Default)
  @js.native
  open class default () extends LocalServiceBusiness
  
  @js.native
  trait LocalServiceBusiness extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[LocalServiceBusiness] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[LocalServiceBusiness] = js.native
    
    def getChannelsToIntegrityStatus(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getChannelsToIntegrityStatus(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getChannelsToIntegrityStatus(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getChannelsToIntegrityStatus(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
  }
}
