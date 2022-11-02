package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsProfileMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/profile", JSImport.Default)
  @js.native
  open class default () extends Profile
  
  @js.native
  trait Profile extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[Profile] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[Profile] = js.native
    
    def getPicture(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPicture(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPicture(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPicture(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
  }
}
