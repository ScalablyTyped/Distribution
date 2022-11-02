package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsUserPageOneTimeOptInTokenSettingsMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/user-page-one-time-opt-in-token-settings", JSImport.Default)
  @js.native
  open class default () extends UserPageOneTimeOptInTokenSettings
  
  @js.native
  trait UserPageOneTimeOptInTokenSettings extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[UserPageOneTimeOptInTokenSettings] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[UserPageOneTimeOptInTokenSettings] = js.native
  }
}
