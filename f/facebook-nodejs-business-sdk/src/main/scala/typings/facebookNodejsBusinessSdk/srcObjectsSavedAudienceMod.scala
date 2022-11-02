package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsSavedAudienceMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/saved-audience", JSImport.Default)
  @js.native
  open class default () extends SavedAudience
  
  @js.native
  trait SavedAudience extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[SavedAudience] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[SavedAudience] = js.native
  }
}
